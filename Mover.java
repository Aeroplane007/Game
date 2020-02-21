import java.awt.*;
import java.awt.event.*;

public class Mover implements KeyListener{

  private GraphicsPanel movh = new GraphicsPanel();
  private Hero hero = new Hero();
  private int speed = 10;

  public void movex(Skeleton GObj,int i){
    GObj.setposx(GObj.getposx()+i);
  }
  public void movey(Skeleton GObj,int i){
    GObj.setposy(GObj.getposy()+i);
  }

  public void keyPressed(KeyEvent e){
    if(e.getKeyCode() == e.VK_RIGHT){
      movex(hero,speed);
    }if(e.getKeyCode() == e.VK_LEFT){
       movex(hero,-speed);
    }if(e.getKeyCode() == e.VK_UP){
       movey(hero,-speed);
    }if(e.getKeyCode() == e.VK_DOWN){
       movey(hero,speed);
    }


  }
  public void keyReleased(KeyEvent e){}
  public void keyTyped(KeyEvent e){}

      }
