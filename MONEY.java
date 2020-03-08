import java.awt.*;



public class MONEY extends Skeleton{


  String ID = "MONEY";
  private GraphicsPanel graphics = new GraphicsPanel();



  public MONEY(int posx,int posy, int width, int height){
    super(posx,posy,width,height);
    super.SetID(ID);
    super.setPickble();
  }

  public void tick(){

  }
  public void render(Graphics g){
    g.setColor(Color.YELLOW);
    g.fillOval(super.getposx(),super.getposy(),super.getwidth(),super.getheight());

  }
}
