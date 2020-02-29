import java.io.File;
import java.io.FileWriter;

public class GenerateWorld{

  private GraphicsPanel graphics = new GraphicsPanel();
  private double grassgenc = 0.25;
  private int amountOfBush = 100;
  private int amountOfRoad = 100;
  private int sizeofplane = 1000;
  private GRASS grass;
  private ROAD road;

  private HERO hero = new HERO();
  private PLANE plane = new PLANE();
  private VIEWBOX viewbox = new VIEWBOX();
  private RENDERBOX renderB = new RENDERBOX();


  public GenerateWorld(String SaveN){
    graphics.addObj(plane.getId(), plane);
    graphics.addObj(viewbox.getId(),viewbox);
    graphics.addObj(renderB.getId(), renderB);
    graphics.addObj(hero.getId(), hero);
    generateroad();
    generategrass(hero);
    graphics.savefile(SaveN);

  }



  public void generategrass(HERO hero){
    double chance = Math.random();
     for(int i = 0; i < amountOfBush;i++){
       grass = new GRASS(hero);
       graphics.addObj(grass.getId() + Integer.toString(i), grass);
       chance = Math.random();
       graphics.getObj(grass.getId() + Integer.toString(i)).setposx((int) (Math.pow(-1,Math.round((chance+1)*100))*Math.round(chance*sizeofplane)));
       chance = Math.random();
       graphics.getObj(grass.getId() + Integer.toString(i)).setposy((int) (Math.pow(-1,Math.round((chance+1)*100))*Math.round(chance*sizeofplane)));
     }
  }



  public void generateroad(){
    double chance = Math.random();
    for(int i = 0; i < amountOfRoad;i++){
      road = new ROAD();
      int width = road.getwidth();
      int height = road.getheight();
       if(i==0){
        graphics.addObj(road.getId() + Integer.toString(i), road);

        graphics.getObj(road.getId() + Integer.toString(i)).setposx(0);

        graphics.getObj(road.getId() + Integer.toString(i)).setposy(0);
      }else{
        chance = Math.random();
        graphics.addObj(road.getId() + Integer.toString(i), road);
        if(chance<=0.25){
          graphics.getObj(road.getId() + Integer.toString(i)).setwidth(height);
          graphics.getObj(road.getId() + Integer.toString(i)).setheight(width);
          graphics.getObj(road.getId() + Integer.toString(i)).setposx(graphics.getObj(road.getId() + Integer.toString(i-1)).getposx()+graphics.getObj(road.getId() + Integer.toString(i-1)).getheight());
          graphics.getObj(road.getId() + Integer.toString(i)).setposy(graphics.getObj(road.getId() + Integer.toString(i-1)).getposy()+graphics.getObj(road.getId() + Integer.toString(i-1)).getwidth());
        }
        else{
        graphics.getObj(road.getId() + Integer.toString(i)).setposx(graphics.getObj(road.getId() + Integer.toString(i-1)).getposx()+ graphics.getObj(road.getId() + Integer.toString(i-1)).getwidth());
        graphics.getObj(road.getId() + Integer.toString(i)).setposy(graphics.getObj(road.getId() + Integer.toString(i-1)).getposy());
        }
      }
    }
  }









}
