import java.awt.*;

public class DrawHero extends Skeleton{



  public DrawHero(Graphics g){
    super(200,200,20,20);
    g.setColor(Color.BLUE);
    g.fillRect(super.getposx(),super.getposy(),super.getwidth(),super.getheight());



  }


}
