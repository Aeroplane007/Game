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
      g.setColor(Color.RED);
      setback(Color.BLACK);
      loadimg("green.jpg",g,img);
      drawhero(herox.get(),heroy.get(),20,20,g);
  }

  public void drawhero(int width, int height, int x, int y, Graphics g){
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
