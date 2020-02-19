import java.awt.*;
import java.awt.event.*;

public class Mover implements KeyListener{

  private GraphicsPanel movh = new GraphicsPanel();

  public void move(moveint x, moveint y){
    x+=1;
    y+=1;
  }

  public void keyPressed(KeyEvent e){
    movh.herox+=5;
    System.out.println(movh.herox);
    move(movh.herox,movh.heroy);
  }
  public void keyReleased(KeyEvent e){}
  public void keyTyped(KeyEvent e){}

      }
