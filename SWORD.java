import java.awt.*;



public class SWORD extends Skeleton{

  String ID = "SWORD";
  private GraphicsPanel graphics = new GraphicsPanel();


  public SWORD(int posx,int posy, int width, int height){
    super(posx,posy,width,height);
    super.SetID(ID);
    super.setPickble();
  }

  public void tick(){

  }
  public void render(Graphics g){
    g.setColor(Color.BLACK);
    g.fillOval(super.getposx(),super.getposy(),super.getwidth(),super.getheight());

  }



}
