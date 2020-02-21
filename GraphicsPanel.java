import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class GraphicsPanel extends Canvas{


  BufferedImage img = null;
  private Hero hero = new Hero();
  private Plane plane = new Plane();
  int x = 0;

  public void paint(Graphics g) {

      super.paint(g);
      plane.LoadPlane(g);
      hero.drawhero(g);
      g.setColor(Color.BLACK);
      g.fillRect(300,300,20,20);

      //new DrawEnemy(g);
  }




}
