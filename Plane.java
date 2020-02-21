import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.*;

public class Plane implements Skeleton{
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

  public int getposx(){return posx;}
  public int getposy(){return posy;}
  public int getwidth(){return width;}
  public int getheight(){return height;}

  public void setposx(int x){posx=x;}
  public void setposy(int y){posy=y;}
  public void setwidth(int width){this.width=width;}
  public void setheight(int height){this.height=height;}

  public void addx(int b){posx+=1;}
  public void addy(int b){posy+=1;}






}
