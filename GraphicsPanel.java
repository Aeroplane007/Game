import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class GraphicsPanel extends JPanel{


  BufferedImage img = null;
  private Hero hero = new Hero();
  private Plane plane = new Plane();


  public void paint(Graphics g) {
      super.paint(g);
      plane.LoadPlane(g);
      hero.drawhero(g);
      //new DrawEnemy(g);
  }
  public void thisx(){
    System.out.println(hero.getposx());
  }






}
