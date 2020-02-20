import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.*;

public class DrawEnemy extends Skeleton{

  BufferedImage img;
  String ImgName = "enemy.png";

  public DrawEnemy(Graphics g){
    super(0,0,0,0);

    try {
        img = ImageIO.read(new File(ImgName));
    }catch (IOException e) {
        System.out.println("Error occured while loading data");
    }

    g.drawImage(img,super.getposx(),super.getposy(),null);
  }



}
