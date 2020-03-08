import java.awt.*;

public class INVENTORYBOX extends Skeleton{

  String ID = "INVENTORYBOX";
  GraphicsPanel graphics = new GraphicsPanel();
  private float thickness;


  public INVENTORYBOX(int posx,int posy,int width, int height){
    super(posx,posy,width,height);
    super.SetID(ID);
    thickness = 3;
    setItem(null);
  }





   public void render(Graphics g){
     g.setColor(Color.BLACK);
     Graphics2D g2d = (Graphics2D) g;
     g2d.setStroke(new BasicStroke(thickness));
     g.drawRect(super.getposx(),super.getposy(),super.getwidth(),super.getheight());
     if(getImgId()!=null){g.drawImage(getImage(getImgId()), getposx(), getposy(), getwidth(), getheight(), null);}
    }

    public void tick(){

    }


}
