import java.awt.*;



public class SWORD extends Skeleton{

  String ID = "SWORD";
  private boolean pickedup;
  private GraphicsPanel graphics = new GraphicsPanel();

  public SWORD(){
    super(500,500,10,10);
    super.SetID(ID);
  }
  public void tick(){
    if(Collision.collided(graphics.getObj("HERO"),this)){
      graphics.addToInv(this);
    }
  }
  public void render(Graphics g){
    g.setColor(Color.BLACK);
    g.fillOval(super.getposx(),super.getposy(),super.getwidth(),super.getheight());

  }

}
