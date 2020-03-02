import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;



public class ROAD extends Skeleton{

  String ID = "ROAD";

  public ROAD(){
    super(0,0,50,20);
    super.SetID(ID);
  }



   public void render(Graphics g){
     g.setColor(new Color(107, 56, 25));
     g.fillRect(super.getposx(),super.getposy()-5,super.getwidth(),5);
     g.setColor(new Color(161, 84, 37));
     g.fillRect(super.getposx(),super.getposy(),super.getwidth(),super.getheight());
     g.setColor(new Color(107, 56, 25));
     g.fillRect(super.getposx(),super.getposy()+super.getheight(),super.getwidth(),5);

    }

    public void tick(){

    }



}
