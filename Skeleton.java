import javax.swing.*;


public class Skeleton extends JPanel{

  private int posx;
  private int posy;
  private int width;
  private int height;


  public Skeleton(int posx,int posy, int width, int height){
    this.posx=posx;
    this.posy=posy;
    this.width=width;
    this.height=height;
  }


  public int getposx(){return posx;}
  public int getposy(){return posy;}
  public int getwidth(){return width;}
  public int getheight(){return height;}

  // public void setposx(int x){posx=x;}
  // public void setposy(int y){posy=y;}
  // public void setwidth(int width){this.width=width;}
  // public void setheight(int height){this.height=height;}

  public void addx(int b){
    posx+=1;
  }
  public void addy(int b){
    posy+=1;
  }



}
