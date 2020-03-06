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
