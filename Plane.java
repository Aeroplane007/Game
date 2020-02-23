import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.*;

public class Plane implements Skeleton{
  private static int posx;
  private static int posy;
  private static int width;
  private static int height;



  public Plane(){
    posx=(-Frame.Wwidth)/2;
    posy=(-Frame.Wheight)/2;
    width=Frame.Wwidth*2;
    height=Frame.Wheight*2;
  }

  public void render(Graphics g){
    g.setColor(Color.GREEN);
    g.fillRect(posx,posy,width,height);
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
