import javax.swing.*;
import java.awt.*;
import java.io.Serializable;


public abstract class Skeleton implements Serializable{

  private int posx;
  private int posy;
  private int width;
  private int height;
  private int speedx;
  private int speedy;
  private String ID;
  public String name;

  public Skeleton(int posx,int posy,int width,int height){
    this.posx=posx;
    this.posy=posy;
    this.width=width;
    this.height=height;

  }
  public Skeleton(String ObjectName){
    name = ObjectName;
  }

  public abstract void tick();
  public abstract void render(Graphics g);



  public int getposx(){return posx;}
  public int getposy(){return posy;}
  public int getwidth(){return width;}
  public int getheight(){return height;}
  public int getSpeedx(){return speedx;}
  public int getSpeedy(){return speedy;}
  public String getId(){return ID;}
  public String toString(){return ID + "," + posx + "," + posy + "," + width + "," + height;}

  public void setposx(int x){posx=x;}
  public void setposy(int y){posy=y;}
  public void setwidth(int width){this.width=width;}
  public void setheight(int height){this.height=height;}
  public void setspeedx(int speedx){this.speedx=speedx;}
  public void setspeedy(int speedy){this.speedy=speedy;}
  public void SetID(String ID){this.ID = ID;}


}
