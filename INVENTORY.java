import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

public class INVENTORY extends Skeleton{

  String ID = "INVENTORY";
  INVENTORYBOX box;


  public INVENTORY(){
    super(50,Frame.Wheight-70,Frame.Wwidth-100,50);
    super.SetID(ID);
  }



   public void render(Graphics g){
       g.setColor(new Color(161, 84, 37));
       g.fillRect(super.getposx(),super.getposy(),super.getwidth(),super.getheight());
       for(int i = super.getposx(); i<(super.getposx()+super.getwidth());i+=super.getposx()){
         new INVENTORYBOX(i,super.getposy(),50,50,Color.BLACK).render(g);
      }

    }

    public void tick(){

    }



}
