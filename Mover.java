import java.awt.*;
import java.awt.event.*;

public class Mover implements KeyListener{

  private static int totalspeed;

  Skeleton hero;

  public Mover(Hero hero){
    totalspeed = 3;
    this.hero = hero;
  }

  public void keyPressed(KeyEvent e){



    if(e.getKeyCode() == e.VK_SHIFT){
      totalspeed=13;
      System.out.println(totalspeed);
    }
    if(e.getKeyCode() == e.VK_RIGHT){
        hero.setspeedx(totalspeed);
    }if(e.getKeyCode() == e.VK_LEFT){
       hero.setspeedx(-totalspeed);
    }if(e.getKeyCode() == e.VK_UP){
       hero.setspeedy(-totalspeed);
    }

    if(e.getKeyCode() == e.VK_DOWN){
      hero.setspeedy(totalspeed);
    }


  }



  public void keyReleased(KeyEvent e){
      if(e.getKeyCode() == e.VK_RIGHT || e.getKeyCode() == e.VK_LEFT){
          hero.setspeedx(0);
      }if(e.getKeyCode() == e.VK_UP || e.getKeyCode() == e.VK_DOWN){
         hero.setspeedy(0);
      }
      // if(e.getKeyCode() == e.VK_SHIFT){
      //   totalspeed=3;
      // }


    }
  public void keyTyped(KeyEvent e){}



  public int getspeed(){
    return totalspeed;
  }
}
