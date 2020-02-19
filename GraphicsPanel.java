import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class GraphicsPanel extends JPanel{

  moveint herox = 200;
  moveint heroy = 200;
  BufferedImage img = null;

  public GraphicsPanel(){}

  public void paint(Graphics g) {
      super.paint(g);
      g.setColor(Color.RED);
      setback(Color.BLACK);
      loadimg("green.jpg",g,img);
      drawrect(herox,heroy,20,20,g);
  }

  public void drawrect(int width, int height, int x, int y, Graphics g){
    g.fillRect(width,height,x,y);
  }


  public void setback(Color color){
    this.setBackground(color);
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
