import java.awt.*;


public class ViewBox implements Skeleton{


  private static int posx;
  private static int posy;
  private static int width;
  private static int height;
  private static int speedx;
  private static int speedy;
  private String ID = "ViewBox";

  public ViewBox(){
    this.posx=100;
    this.posy = 100;
    this.width = 300;
    this.height = 300;
  }

  public void render(Graphics g){
    g.setColor(Color.BLACK);
    g.drawRect(posx,posy,width,height);
  }
  public void tick(){

  }


  public int getposx(){return posx;}
  public int getposy(){return posy;}
  public int getwidth(){return width;}
  public int getheight(){return height;}
  public String getId(){return ID;}

  public void setposx(int x){posx=x;}
  public void setposy(int y){posy=y;}
  public void setwidth(int width){this.width=width;}
  public void setheight(int height){this.height=height;}
  public void setspeedx(int speedx){this.speedx=speedx;}
  public void setspeedy(int speedy){this.speedy=speedy;}



}
