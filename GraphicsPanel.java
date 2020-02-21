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
      //plane.LoadPlane(g);
      this.setBackground(Color.BLACK);
      g.fillRect(0,0,Frame.Wwidth,Frame.Wheight);
      hero.drawhero(g);

      //new DrawEnemy(g);
  }




}
