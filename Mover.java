import java.awt.*;
import java.awt.event.*;

public class Mover implements KeyListener{

  private GraphicsPanel movh = new GraphicsPanel();
  private Hero hero = new Hero();


  public void move(Skeleton GObj){
    GObj.addx(1);
    GObj.addy(1);
  }

  public void keyPressed(KeyEvent e){
    System.out.println(hero.getposx());
    move(hero);


  }
  public void keyReleased(KeyEvent e){}
  public void keyTyped(KeyEvent e){}

      }
