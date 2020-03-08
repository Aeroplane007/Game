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
  private SWORD sword = new SWORD(500,500,10,10);
  private MONEY money = new MONEY(100,100,20,20);

  public GenerateWorld(String SaveN){

    graphics.addObj(plane.getId(), plane);
    graphics.addObj(viewbox.getId(),viewbox);
    graphics.addObj(renderB.getId(), renderB);
    graphics.addObj(hero.getId(), hero);
    graphics.addObj(road.getId(), road);
    generategrass(hero);
    graphics.addObj(sword.getId(), sword);
    graphics.addObj(money.getId(), money);
    graphics.addObj(sword.getId()+"0", new SWORD(300,300,10,10));
    graphics.addObj(sword.getId()+"1", new SWORD(350,300,10,10));
    graphics.addObj(sword.getId()+"2", new SWORD(300,350,10,10));
    graphics.addObj(sword.getId()+"3", new SWORD(500,300,10,10));
    graphics.addObj(sword.getId()+"4", new SWORD(900,300,10,10));
    graphics.addObj(sword.getId()+"5", new SWORD(1000,350,10,10));
    graphics.addObj(sword.getId()+"6", new SWORD(550,300,10,10));



    graphics.addObj(inventory.getId(), inventory);
    for(int i = inventory.getposx(); i<(inventory.getposx()+inventory.getwidth());i+=inventory.getposx()){
      inventorybox = new INVENTORYBOX(i,inventory.getposy(),50,50);
      graphics.addObj(inventorybox.getId()+Integer.toString((i/inventory.getposx())-1), inventorybox);

    }
    graphics.setActiveInv(0);
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
