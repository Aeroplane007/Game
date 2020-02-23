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
  private List<Grass> grass;
  private Collision col = new Collision();

  public void paint(Graphics g) {

      super.paint(g);
      plane.render(g);
      hero.render(g);
      if(grass!=null){

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
    if(chance<=0.25){
      System.out.println(chance*120);
     for(int i = 0;i < (int)chance*120;i++){
       grass.add(new Grass());
       grass.get(i).setposx((int) Frame.Wwidth+((int) chance*4*200));
       grass.get(i).setposy((int) chance*4*Frame.Wheight);
       System.out.println("HELLOOOOO");
       System.out.println((int) Frame.Wwidth+((int) chance*4*200) + "HELLOOOOO" + (int) chance*4*Frame.Wheight);
     }



    }

  }




}
