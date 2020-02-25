import java.io.File;
import java.io.FileWriter;

public class GenerateWorld{

  private GraphicsPanel graphics = new GraphicsPanel();
  private Plane plane = new Plane();
  private ViewBox viewbox = new ViewBox();
  private double grassgenc = 0.25;
  private int amountOfBush = 100;
  private int sizeofplane = 1000;

  public GenerateWorld(String SaveN){
    graphics.addObj(plane);
    generategrass();
    savefile(SaveN);

  }



  public void generategrass(){
    double chance = Math.random();
    int size = graphics.getsizeofGameobj();
     for(int i = size;i < size+amountOfBush;i++){
       graphics.addObj(new Grass());
       chance = Math.random();
       graphics.GetOb(i).setposx((int) (Math.pow(-1,Math.round((chance+1)*100))*Math.round(chance*sizeofplane)));
       chance = Math.random();
       graphics.GetOb(i).setposy((int) (Math.pow(-1,Math.round((chance+1)*100))*Math.round(chance*sizeofplane)));
     }
  }

  public void savefile(String SaveN){
    int i =0;
    try{
      File file = new File((SaveN +Integer.toString(i) + ".txt"));
      FileWriter writer = new FileWriter(file);
      while(!file.createNewFile()){
        if(file.createNewFile()){
          break;
        }else{
          i++;
          file = new File((SaveN +Integer.toString(i)+".txt"));
        }
    }
    for(int j = 0; j< graphics.getsizeofGameobj(); j++){
      writer.write(graphics.getObj(j).toString());
   }

   } catch(Exception e){
      System.err.println(e);
    }
  }




}
