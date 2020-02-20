import java.awt.*;
import java.awt.event.*;

public class Mover implements KeyListener{

  private GraphicsPanel movh = new GraphicsPanel();


  public void move(moveint x, moveint y,int addx, int addy){
    x.add(addx);
    y.add(addy);
  }

  public void keyPressed(KeyEvent e){
    System.out.println(movh.herox.get());
    move(movh.herox,movh.heroy,1,1);

  }
  public void keyReleased(KeyEvent e){}
  public void keyTyped(KeyEvent e){}

      }
