import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.lang.Math.*;
import java.util.*;


public class GraphicsPanel extends JPanel{


  BufferedImage img = null;
  private Hero hero = new Hero();
  private Plane plane = new Plane();
  private ViewBox viewbox = new ViewBox();
  private static List<Grass> grass = new LinkedList<Grass>();
  private Collision col = new Collision();
  private double grassgenc = 0.25;

  public void paint(Graphics g) {

      super.paint(g);
      plane.render(g);
      hero.render(g);
      if(!grass.isEmpty()){
        for(Grass c : grass){
          if(!col.collided(hero,c)){
            c.render1(g);

          }else{
            c.render2(g);
          }
        }
      }

      viewbox.render(g);
      g.setColor(Color.BLACK);
      g.fillRect(600,300,20,20);

      //new DrawEnemy(g);
  }

  public void generategrass(){
    double chance = Math.random();
    int size = grass.size();
    if(chance<=grassgenc){
     for(int i = size;i < size+3;i++){
       grass.add(new Grass());
       grass.get(i).setposx((int) (hero.getposx()+(Frame.Wwidth)/2+(Math.round(chance*(1/grassgenc)*200))));
       grass.get(i).setposy((int) Math.round(chance*(1/grassgenc)*(double)Frame.Wheight));
     }



    }

  }




}
