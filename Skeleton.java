import javax.swing.*;
import java.awt.*;


public interface Skeleton{

  public void tick();
  public void render(Graphics g);


  public int getposx();
  public int getposy();
  public int getwidth();
  public int getheight();
  public String getId();

  public void setposx(int x);
  public void setposy(int y);
  public void setwidth(int width);
  public void setheight(int height);


}
