import java.io.File;
import java.io.FileWriter;

public class GenerateWorld{

  private GraphicsPanel graphics = new GraphicsPanel();
  private double grassgenc = 0.25;
  private int amountOfBush = 100;
  private int sizeofplane = 1000;
  private Grass grass;

  private Hero hero = new Hero();
  private Plane plane = new Plane();
  private ViewBox viewbox = new ViewBox();
  private RenderBox renderB = new RenderBox();



  public GenerateWorld(String SaveN){
    graphics.addObj(plane.getId(), plane);
    graphics.addObj(viewbox.getId(),viewbox);
    graphics.addObj(renderB.getId(), renderB);
    graphics.addObj(hero.getId(), hero);
    generategrass(hero);
    graphics.savefile(SaveN);

  }



  public void generategrass(Hero hero){
    double chance = Math.random();
     for(int i = 0; i < amountOfBush;i++){
       grass = new Grass(hero);
       graphics.addObj(grass.getId() + Integer.toString(i), grass);
       chance = Math.random();
       graphics.getObj(grass.getId() + Integer.toString(i)).setposx((int) (Math.pow(-1,Math.round((chance+1)*100))*Math.round(chance*sizeofplane)));
       chance = Math.random();
       graphics.getObj(grass.getId() + Integer.toString(i)).setposy((int) (Math.pow(-1,Math.round((chance+1)*100))*Math.round(chance*sizeofplane)));
     }
  }









}
