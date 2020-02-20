import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class GraphicsPanel extends JPanel{

  moveint herox = new moveint(200);
  moveint heroy = new moveint(200);
  BufferedImage img = null;

  public void repain(){
    this.repaint();
  }

  public void paint(Graphics g) {
      super.paint(g);
      this.setBackground(Color.BLACK);
      new LoadField(g);
      new DrawHero(g);
      //new DrawEnemy(g);
  }

  public void drawhero(int width, int height, int x, int y, Graphics g){
    g.fillRect(width,height,x,y);
  }


  public void loadimg(String file,Graphics g, BufferedImage img){
    try {
        img = ImageIO.read(new File(file));
    } catch (IOException e) {
        System.out.println("Error occured while loading data");
    }
    g.drawImage(img,0,0,null);

  }




}
