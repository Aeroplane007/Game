public class GenerateWorld{

  private GraphicsPanel graphics = new GraphicsPanel();
  private Plane plane = new Plane();
  private ViewBox viewbox = new ViewBox();
  private double grassgenc = 0.25;

  public GenerateWorld(){

    graphics.addObj(plane);
    generategrass();
  }



  public void generategrass(){
    double chance = Math.random();
    int size = graphics.getsizeofGameobj();
     for(int i = size;i < size+10000;i++){
       graphics.addObj(new Grass());
       chance = Math.random();
       graphics.GetOb(i).setposx((int) (Math.pow(-1,Math.round((chance+1)*100))*Math.round(chance*10000)));
       System.out.printf("Bush drawn at: " + (int) (Math.pow(-1,Math.round((chance+1)*100))*Math.round(chance*10000)));
       chance = Math.random();
       graphics.GetOb(i).setposy((int) (Math.pow(-1,Math.round((chance+1)*100))*Math.round(chance*10000)));
       System.out.println(" , " + (int) (Math.pow(-1,Math.round((chance+1)*100))*Math.round(chance*10000)));
     }
  }




}
