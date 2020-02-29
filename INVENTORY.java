import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

public class INVENTORY extends Skeleton{

  String ID = "INVENTORY";

  public INVENTORY(){
    super(0,Frame.Wheight-50,Frame.Wwidth,50);
    super.SetID(ID);
  }



   public void render(Graphics g){
       g.setColor(new Color(161, 84, 37));
       g.fillRect(super.getposx(),super.getposy(),super.getwidth(),super.getheight());

    }

    public void tick(){

    }



}
