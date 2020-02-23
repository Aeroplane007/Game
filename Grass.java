import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;


public class Grass implements Skeleton{

  private int posx;
  private int posy;
  private int width;
  private int height;
  static BufferedImage imgF,imgC;
  String ImgNameF = "Grass.jpg";
  String ImgNameC = "GrassOp.jpg";
  String ID = "Grass";

  public Grass(){
    this.posx=0;
    this.posy=0;
    width=50;
    height=30;
  }

  public void loadimg(){
    try{
      imgF = ImageIO.read(new File(ImgNameF));
      imgC = ImageIO.read(new File(ImgNameC));
    }catch(IOException e){
      System.out.println("Could not load image: " + ImgNameF + " and or " + ImgNameC);
    }
  }

   public void render1(Graphics g){
       g.drawImage(imgF, posx, posy,width,height, null);
    }

    public void render2(Graphics g){
        g.drawImage(imgC, posx, posy,width,height, null);
     }


    public void tick(){

    }




  public int getposx(){return posx;}
  public int getposy(){return posy;}
  public int getwidth(){return width;}
  public int getheight(){return height;}

  public void setposx(int x){posx=x;}
  public void setposy(int y){posy=y;}
  public void setwidth(int width){this.width=width;}
  public void setheight(int height){this.height=height;}


}
