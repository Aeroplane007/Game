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
      graphics.getActiveInv().setColor(Color.BLACK);
      graphics.getObj("HERO").setItem(graphics.getInv(0));
      graphics.setActiveInv(0);
    }if(e.getKeyCode() == e.VK_2){
      graphics.getActiveInv().setColor(Color.BLACK);
      graphics.getObj("HERO").setItem(graphics.getInv(1));
      graphics.setActiveInv(1);
    }
    if(e.getKeyCode() == e.VK_3){
      graphics.getActiveInv().setColor(Color.BLACK);
      graphics.getObj("HERO").setItem(graphics.getInv(2));
      graphics.setActiveInv(2);
    }
    if(e.getKeyCode() == e.VK_4){
      graphics.getActiveInv().setColor(Color.BLACK);
      graphics.getObj("HERO").setItem(graphics.getInv(3));
      graphics.setActiveInv(3);
    }
    if(e.getKeyCode() == e.VK_5){
      graphics.getActiveInv().setColor(Color.BLACK);
      graphics.getObj("HERO").setItem(graphics.getInv(4));
      graphics.setActiveInv(4);
    }
    if(e.getKeyCode() == e.VK_6){
      graphics.getActiveInv().setColor(Color.BLACK);
      graphics.getObj("HERO").setItem(graphics.getInv(5));
      graphics.setActiveInv(5);
    }
    if(e.getKeyCode() == e.VK_7){
      graphics.getActiveInv().setColor(Color.BLACK);
      graphics.getObj("HERO").setItem(graphics.getInv(6));
      graphics.setActiveInv(6);
    }
    if(e.getKeyCode() == e.VK_8){
      graphics.getActiveInv().setColor(Color.BLACK);
      graphics.getObj("HERO").setItem(graphics.getInv(7));
      graphics.setActiveInv(7);
    }
    if(e.getKeyCode() == e.VK_9){
      graphics.getActiveInv().setColor(Color.BLACK);
      graphics.getObj("HERO").setItem(graphics.getInv(8));
      graphics.setActiveInv(8);
    }
    if(e.getKeyCode() == e.VK_Q){
      graphics.removeInv(graphics.getObj("HERO").getItem());
      graphics.getObj("HERO").setItem(null);
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
