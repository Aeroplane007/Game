import java.io.File;
import java.io.FileWriter;

public class GenerateWorld{

  private GraphicsPanel graphics = new GraphicsPanel();
  private double grassgenc = 0.25;
  private int amountOfBush = 100;
  private int amountOfRoad = 100;
  private int sizeofplane = 1000;
  private GRASS grass;
  private INVENTORYBOX inventorybox;

  private ROAD road = new ROAD();
  private HERO hero = new HERO();
  private PLANE plane = new PLANE();
  private VIEWBOX viewbox = new VIEWBOX();
  private RENDERBOX renderB = new RENDERBOX();
  private INVENTORY inventory = new INVENTORY();
  private SWORD sword = new SWORD();

  public GenerateWorld(String SaveN){
    graphics.addObj(plane.getId(), plane);
    graphics.addObj(viewbox.getId(),viewbox);
    graphics.addObj(renderB.getId(), renderB);
    graphics.addObj(hero.getId(), hero);
    graphics.addObj(road.getId(), road);
    graphics.addObj(sword.getId(), sword);

    generategrass(hero);


    graphics.addObj(inventory.getId(), inventory);
    for(int i = inventory.getposx(); i<(inventory.getposx()+inventory.getwidth());i+=inventory.getposx()){
      inventorybox = new INVENTORYBOX(i,inventory.getposy(),50,50);
      graphics.addObj(inventorybox.getId()+Integer.toString((i/inventory.getposx())-1), inventorybox);

    }
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





}
