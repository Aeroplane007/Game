import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.*;

public class DrawEnemy{

  BufferedImage img;
  String ImgName = "enemy.png";
  private int posx;
  private int posy;
  private int width;
  private int height;

  public DrawEnemy(Graphics g){
    posx=0;
    posy=0;

    try {
        img = ImageIO.read(new File(ImgName));
    }catch (IOException e) {
        System.out.println("Error occured while loading data");
    }

    g.drawImage(img,posx,posy,null);
  }



}
