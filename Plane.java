import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.*;

public class Plane{
  private int posx;
  private int posy;
  private int width;
  private int height;

  BufferedImage img;
  String ImgName = "green.jpg";

  public Plane(){
    posx=0;
    posy=0;

  }

  public void LoadPlane(Graphics g){

    try {
        img = ImageIO.read(new File(ImgName));
    }catch (IOException e) {
        System.out.println("Error occured while loading data");
    }

    g.drawImage(img,posx,posy,null);



  }




}
