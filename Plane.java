import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.*;

public class Plane extends Skeleton{

  private String ID = "PLANE";




  public Plane(){
    super(0,0,550,500);
    super.SetID(ID);
  }


  public void tick(){}
  public void render(Graphics g){
    g.setColor(Color.GREEN);
    g.fillRect(getposx(),getposy(),getwidth(),getheight());
  }








}
