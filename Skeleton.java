import javax.swing.*;
import java.awt.*;
import java.io.Serializable;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;


public abstract class Skeleton implements Serializable{

  private int[] pos;
  private int width;
  private int height;
  private int speedx;
  private int speedy;
  private String ID;
  public String name;
  private Skeleton item;
  private boolean hasObj;
  private boolean pickble;
  private static HashMap <String,BufferedImage> img = new LinkedHashMap<>();
  private String ImgId;

  public Skeleton(int posx,int posy,int width,int height){
    pos = new int[2];
    this.pos[0]=posx;
    this.pos[1]=posy;
    this.width=width;
    this.height=height;
    pickble = false;
  }
  public Skeleton(String ObjectName){
    name = ObjectName;
  }

  public abstract void tick();
  public abstract void render(Graphics g);

  public void loadimg(String key,String imgName){
    try{
      setImage(key,ImageIO.read(new File(imgName)));
    }catch(IOException e){
      System.out.println("Could not load image: " + imgName);
    }
  }


  public int getposx(){return pos[0];}
  public int getposy(){return pos[1];}
  public int getwidth(){return width;}
  public int getheight(){return height;}
  public int getSpeedx(){return speedx;}
  public int getSpeedy(){return speedy;}
  public int[] getCoordinates(){return pos;}
  public String getId(){return ID;}
  public String toString(){return ID + "," + pos[0] + "," + pos[1] + "," + width + "," + height;}
  public Skeleton getItem(){return item;}
  public boolean getHasObj(){return hasObj;}
  public boolean getPickble(){return pickble;}
  public BufferedImage getImage(String key){return img.get(key);}
  public String getImgId(){return ImgId;}



  public void setposx(int x){this.pos[0]=x;}
  public void setposy(int y){this.pos[1]=y;}
  public void setwidth(int width){this.width=width;}
  public void setheight(int height){this.height=height;}
  public void setspeedx(int speedx){this.speedx=speedx;}
  public void setspeedy(int speedy){this.speedy=speedy;}
  public void SetID(String ID){this.ID = ID;}
  public void setCoordinates(int[] i){this.pos[0]=i[0];this.pos[1]=i[1];}
  public void setItem(Skeleton item){this.item = item;}
  public void setHasObj(){hasObj=!hasObj;}
  public void setPickble(){pickble=!pickble;}
  public void setImage(String key,BufferedImage img){this.img.put(key,img);}
  public void setImgId(String ImgId){this.ImgId=ImgId;}


}
