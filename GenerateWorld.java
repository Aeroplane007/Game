import java.io.File;
import java.io.FileWriter;

public class GenerateWorld{

  private GraphicsPanel graphics = new GraphicsPanel();
  private double grassgenc = 0.25;
  private int amountOfBush = 100;
  private int sizeofplane = 1000;
  private Grass grass;

  public GenerateWorld(String SaveN,Skeleton plane,Skeleton viewbox,Skeleton RenderB,Hero hero){
    graphics.addObj(plane.getId(), plane);
    graphics.addObj(viewbox.getId(),viewbox);
    graphics.addObj(RenderB.getId(), RenderB);
    generategrass(hero);
    savefile(SaveN);

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




  public void savefile(String SaveN){
    int i =0;
    try{
      File file = new File(("Save/"+SaveN + ".txt"));
      boolean created = file.createNewFile();
      while(!created){
        if(file.createNewFile()){
          break;
        }else{
          i++;
          file = new File(("Save/"+SaveN + Integer.toString(i) +".txt"));
        }
    }
    FileWriter writer = new FileWriter(file);
    for(int j = 0; j < graphics.getsizeofGameobj(); j++){
      writer.write(graphics.getObj(j).toString() + "\n");
      System.out.println(file);
    }
    writer.close();

   } catch(Exception e){
      System.err.println(e);
    }
  }




}
