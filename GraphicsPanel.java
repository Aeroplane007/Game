import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class GraphicsPanel extends Canvas{


  BufferedImage img = null;
  private Hero hero = new Hero();
  private Plane plane = new Plane();
  private ViewBox viewbox = new ViewBox();
  int x = 0;

  public void paint(Graphics g) {

      super.paint(g);
      plane.render(g);
      hero.render(g);
      viewbox.render(g);
      g.setColor(Color.BLACK);
      g.fillRect(600,300,20,20);

      //new DrawEnemy(g);
  }




}
