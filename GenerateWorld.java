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
       if(i==0){
        graphics.addObj(road.getId() + Integer.toString(i), road);

        graphics.getObj(road.getId() + Integer.toString(i)).setposx(0);

        graphics.getObj(road.getId() + Integer.toString(i)).setposy(0);
      }else{
        chance = Math.random();
        graphics.addObj(road.getId() + Integer.toString(i), road);
        if(chance<=0.5){
          graphics.getObj(road.getId() + Integer.toString(i)).setCoordinates(rotator(45, graphics.getObj(road.getId() + Integer.toString(i-1)).getCoordinates(),road));

        }else if(chance>=75){
          graphics.getObj(road.getId() + Integer.toString(i)).setCoordinates(rotator(45, graphics.getObj(road.getId() + Integer.toString(i-1)).getCoordinates(),road));
        }else{
          graphics.getObj(road.getId() + Integer.toString(i)).setCoordinates(rotator(45, graphics.getObj(road.getId() + Integer.toString(i-1)).getCoordinates(),road));
        }
      }
    }
  }

  public int[] rotator(int v, int[] coordinates,Skeleton obj){
    coordinates[0] += obj.getwidth();
    double[][] rotation = {{Math.cos(Math.toRadians(v)),-Math.sin(Math.toRadians(v))},{Math.sin(Math.toRadians(v)),Math.cos(Math.toRadians(v))}};
    int[] c = new int[2];
    c[0]=coordinates[0];
    c[1]=coordinates[1];
    for(int i=0; i<rotation.length;i++){
        for(int k =0; k<rotation[i].length;k++){
        System.out.printf("i:" + i + "coordinates:" + coordinates[k] + ",");
        c[i] += (int) Math.round(rotation[i][k]*(double)coordinates[k]);
        System.out.printf("sum=" + rotation[i][k]*coordinates[k]);
        System.out.println(" C: " + c[i]);

        }

    }
    coordinates=c;
    return coordinates;
  }









}
