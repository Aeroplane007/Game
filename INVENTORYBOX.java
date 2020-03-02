import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

public class INVENTORYBOX extends Skeleton{

  String ID = "INVENTORYBOX";
  GraphicsPanel graphics = new GraphicsPanel();
  Color Color;
  private float thickness;

  public INVENTORYBOX(int posx,int posy,int width, int height, Color Color){
    super(posx,posy,width,height);
    super.SetID(ID);
    this.Color = Color;
    thickness = 3;
  }



   public void render(Graphics g){
     g.setColor(Color);
     Graphics2D g2d = (Graphics2D) g;
     g2d.setStroke(new BasicStroke(thickness));
     g.drawRect(super.getposx(),super.getposy(),super.getwidth(),super.getheight());
    }

    public void tick(){

    }



}
