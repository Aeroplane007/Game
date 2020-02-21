import java.awt.*;
import java.awt.event.*;

public class Mover implements KeyListener{

  private GraphicsPanel movh = new GraphicsPanel();
  private Hero hero = new Hero();
  private Plane plane = new Plane();
  private int totalspeed=5;
  private static int speedx;
  private static int speedy;

  public void moveherox(){
    hero.setposx(hero.getposx()+speedx);
  }
  public void moveheroy(){
    hero.setposy(hero.getposy()+speedy);
  }

  public void keyPressed(KeyEvent e){
    if(e.getKeyCode() == e.VK_RIGHT){
        speedx = totalspeed;
    }if(e.getKeyCode() == e.VK_LEFT){
       speedx= -totalspeed;
    }if(e.getKeyCode() == e.VK_UP){
       speedy= -totalspeed;
    }if(e.getKeyCode() == e.VK_DOWN){
       speedy = totalspeed;
    }

  }



  public void keyReleased(KeyEvent e){
      if(e.getKeyCode() == e.VK_RIGHT || e.getKeyCode() == e.VK_LEFT){
          speedx =0;
      }if(e.getKeyCode() == e.VK_UP || e.getKeyCode() == e.VK_DOWN){
         speedy=0;
      }
    }
  public void keyTyped(KeyEvent e){}

      }
