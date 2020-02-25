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
  private RenderBox renderB = new RenderBox();


  private double grassgenc = 0.25;


  public void paint(Graphics g) {

      super.paint(g);
      plane.render(g);
      for(Skeleton c : gameobjects){
        if(c.getId()!="HERO"){
          if(col.isInside(c,renderB)){
            c.render(g);
          }

        }
      //  System.out.println((renderB.getposx()+renderB.getwidth())+" , "+(renderB.getposy()+renderB.getheight()));
      }
      hero.render(g);

      viewbox.render(g);
      g.setColor(Color.BLACK);
      g.fillRect(600,300,20,20);

      //new DrawEnemy(g);
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
  public Skeleton GetOb(int i){
    return gameobjects.get(i);
  }







}
