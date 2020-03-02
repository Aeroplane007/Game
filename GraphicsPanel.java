import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.lang.Math.*;
import java.util.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class GraphicsPanel extends JPanel{


  BufferedImage img = null;
  private static HashMap<String, Skeleton> gameobjects = new LinkedHashMap<String, Skeleton>();
  private double grassgenc = 0.25;


  public void paint(Graphics g) {

      super.paint(g);
      for(String c : gameobjects.keySet()){
        if(getObj(c).getId()!="HERO"){
          if(Collision.isInside(getObj(c),getObj("RENDERBOX"))){
            getObj(c).render(g);
          }

        }
      }
      getObj("HERO").render(g);

      g.setColor(Color.BLACK);
      g.fillRect(600,300,20,20);

  }

  public void tick(){
      gameobjects.get("HERO").tick();
  }


  public void addObj(String key, Skeleton obj){
    gameobjects.put(key,obj);
  }
  public void setGame(Map<String, Skeleton> gameobjects){
    this.gameobjects = (HashMap<String, Skeleton>) gameobjects;
  }
  public Skeleton getObj(String key){
    return gameobjects.get(key);
  }
  public int getsizeofGameobj(){
    return gameobjects.size();
  }

  public void savefile(String SaveN){
    int i =0;
    try{
      File file = new File(("Save/"+SaveN + ".txt"));
      boolean created = file.createNewFile();
      while(!created){
        if(file.createNewFile()){
          break;
        }else{
          i++;
          file = new File(("Save/"+SaveN + Integer.toString(i) +".txt"));
        }
    }
    ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(file));

    objectOut.writeObject(gameobjects);


   } catch(Exception e){
      System.err.println(e);
    }
  }








}
