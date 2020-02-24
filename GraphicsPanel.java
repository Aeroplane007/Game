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
<<<<<<< HEAD
  private RenderBox renderB = new RenderBox();

=======
  private double grassgenc = 0.25;
>>>>>>> e58bcbc13d4cf7720ea420f545ab1fb05dcf5773

  public void paint(Graphics g) {

      super.paint(g);
<<<<<<< HEAD
      plane.render(g);
      for(Skeleton c : gameobjects){
        if(c.getId()!="HERO"){
          if(col.isInside(c,renderB)){
            c.render(g);
          }

=======
      for(Skeleton c : gameobjects){
        if(c.getId()!="HERO"){
          c.render(g);
>>>>>>> e58bcbc13d4cf7720ea420f545ab1fb05dcf5773
        }

      }
      hero.render(g);

      viewbox.render(g);
      g.setColor(Color.BLACK);
      g.fillRect(600,300,20,20);

      //new DrawEnemy(g);
  }
<<<<<<< HEAD


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
=======
>>>>>>> e58bcbc13d4cf7720ea420f545ab1fb05dcf5773

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
