import java.awt.*;
import java.awt.event.*;

public class Mover implements KeyListener{

  private static int totalspeed;

  GraphicsPanel graphics = new GraphicsPanel();

  public Mover(){
    totalspeed = 3;
  }

  public void keyPressed(KeyEvent e){

    if(e.getKeyCode() == e.VK_RIGHT){
      graphics.getObj("HERO").setspeedx(totalspeed);
    }if(e.getKeyCode() == e.VK_LEFT){
      graphics.getObj("HERO").setspeedx(-totalspeed);
    }if(e.getKeyCode() == e.VK_UP){
      graphics.getObj("HERO").setspeedy(-totalspeed);
    }
    if(e.getKeyCode() == e.VK_DOWN){
      graphics.getObj("HERO").setspeedy(totalspeed);
    }
    //realeasing object
    if(e.getKeyCode() == e.VK_1){
      graphics.getObj("HERO").setItem(graphics.getInv(0));
    }if(e.getKeyCode() == e.VK_2){
      graphics.getObj("HERO").setItem(graphics.getInv(1));
    }
    if(e.getKeyCode() == e.VK_3){
      graphics.getObj("HERO").setItem(graphics.getInv(2));
    }
    if(e.getKeyCode() == e.VK_4){
      graphics.getObj("HERO").setItem(graphics.getInv(3));
    }
    if(e.getKeyCode() == e.VK_5){
      graphics.getObj("HERO").setItem(graphics.getInv(4));
    }
    if(e.getKeyCode() == e.VK_6){
      graphics.getObj("HERO").setItem(graphics.getInv(5));
    }
    if(e.getKeyCode() == e.VK_7){
      graphics.getObj("HERO").setItem(graphics.getInv(6));
    }


  }



  public void keyReleased(KeyEvent e){
      if(e.getKeyCode() == e.VK_RIGHT || e.getKeyCode() == e.VK_LEFT){
        graphics.getObj("HERO").setspeedx(0);
      }if(e.getKeyCode() == e.VK_UP || e.getKeyCode() == e.VK_DOWN){
        graphics.getObj("HERO").setspeedy(0);
      }


    }
  public void keyTyped(KeyEvent e){}



  public int getspeed(){
    return totalspeed;
  }
}
