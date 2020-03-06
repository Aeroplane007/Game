import java.awt.*;



public class SWORD extends Skeleton{

  String ID = "SWORD";
  private GraphicsPanel graphics = new GraphicsPanel();

  public SWORD(){
    super(500,500,10,10);
    super.SetID(ID);
  }
  public SWORD(int posx,int posy, int width, int height){
    super(posx,posy,width,height);
    super.SetID(ID);
  }

  public void tick(){
    if(Collision.collided(graphics.getObj("HERO"),this)){
      graphics.addToInv(new SWORD());
      graphics.getObj("HERO").setItem(this);
      if(!graphics.getObj("HERO").getHasObj()){graphics.getObj("HERO").setHasObj();}
    }

  }
  public void render(Graphics g){
    g.setColor(Color.BLACK);
    g.fillOval(super.getposx(),super.getposy(),super.getwidth(),super.getheight());

  }

}
