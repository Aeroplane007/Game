import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;



public class ROAD extends Skeleton{

  String ID = "ROAD";

  public ROAD(){
    super(0,0,50,50);
    super.SetID(ID);
  }



   public void render(Graphics g){
       g.setColor(new Color(161, 84, 37));
       g.fillOval(super.getposx(),super.getposy(),super.getwidth(),super.getheight());

    }

    public void tick(){

    }



}
