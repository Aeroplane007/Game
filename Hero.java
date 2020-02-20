import java.awt.*;

public class Hero{

  private int posx;
  private int posy;
  private int width;
  private int height;

  public Hero(){
    posx=200;
    posy=200;
    width=20;
    height=20;

  }

  public void drawhero(Graphics g){
    g.setColor(Color.BLUE);
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


}
