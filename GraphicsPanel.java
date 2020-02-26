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
  private static HashMap<String, Skeleton> gameobjects = new LinkedHashMap<String, Skeleton>();
  private Collision col = new Collision();
  private double grassgenc = 0.25;


  public void paint(Graphics g, Skeleton hero,Skeleton renderB) {

      super.paint(g);
      for(Skeleton c : gameobjects){
        if(c.getId()!="HERO"){
          if(col.isInside(c,renderB)){
            c.render(g);
          }

        }
      //  System.out.println((renderB.getposx()+renderB.getwidth())+" , "+(renderB.getposy()+renderB.getheight()));
      }
      hero.render(g);

      g.setColor(Color.BLACK);
      g.fillRect(600,300,20,20);

      //new DrawEnemy(g);
  }

  public void tick(){

  }


  public void addObj(String key, Skeleton obj){
    gameobjects.put(obj);
  }
  public Skeleton getObj(String key){
    return gameobjects.get(key);
  }
  public int getsizeofGameobj(){
    return gameobjects.size();
  }








}
