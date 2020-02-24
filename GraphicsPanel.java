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
  private static List<Skeleton> gameobjects = new LinkedList<Skeleton>();
  private Collision col = new Collision();
  private double grassgenc = 0.25;

  public void paint(Graphics g) {

      super.paint(g);
      for(Skeleton c : gameobjects){
        if(c.getId()!="HERO"){
          c.render(g);
        }

      }
      hero.render(g);

      viewbox.render(g);
      g.setColor(Color.BLACK);
      g.fillRect(600,300,20,20);

      //new DrawEnemy(g);
  }

  public void generategrass(){
    double chance = Math.random();
    int size = gameobjects.size();
    if(chance<=grassgenc){
     for(int i = size;i < size+3;i++){
       gameobjects.add(new Grass());
       gameobjects.get(i).setposx((int) (hero.getposx()+(Frame.Wwidth)/2+(Math.round(chance*(1/grassgenc)*200))));
       gameobjects.get(i).setposy((int) Math.round(chance*(1/grassgenc)*(double)Frame.Wheight));
     }



    }

  }
  public void addObj(Skeleton obj){
    gameobjects.add(obj);
  }
  public Skeleton getObj(int i){
    return gameobjects.get(i);
  }
  public int getsizeofGameobj(){
    return gameobjects.size();
  }





}
