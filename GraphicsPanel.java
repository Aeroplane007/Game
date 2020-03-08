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
import java.util.Iterator;
import java.util.Collections;


public class GraphicsPanel extends JPanel{


  BufferedImage img = null;
  private static HashMap<String, Skeleton> gameobjects = new LinkedHashMap<String, Skeleton>();
  private static List<Skeleton> inventory = new LinkedList<Skeleton>(Collections.nCopies(9, null));//faster add and remove
  private int activeInv = 0;


  public void paint(Graphics g) {

      super.paint(g);
      Iterator<String> iterator = gameobjects.keySet().iterator();
      while(iterator.hasNext()){
        String c = iterator.next();

        if(!Collision.isInside(getObj(c),getObj("RENDERBOX"))) {continue;}
        if(getObj(c).getId()!="HERO"){

            getObj(c).render(g);

          if(inventory.size()<10){
            if(getObj(c).getPickble()){
              if(Collision.collided(getObj("HERO"),getObj(c))){
                setInv(activeInv,getObj(c));
                getObj("INVENTORYBOX"  + Integer.toString(activeInv)).setImgId(getObj(c).getId());
                if(!getObj("HERO").getHasObj()){
                  getObj("HERO").setItem(getInv(activeInv));
                  getObj("HERO").setHasObj();
                }
                iterator.remove();

                activeInv++;
              }

            }
        }


        }
      }

      getObj("HERO").render(g);


  }

  public void tick(){
      gameobjects.get("HERO").tick();

  }


  public void addObj(String key, Skeleton obj){
    gameobjects.put(key,obj);
  }
  public void remObj(String key){
    gameobjects.remove(key);
  }
  public void setGame(Map<String, Skeleton> gameobjects){
    this.gameobjects = (HashMap<String, Skeleton>) gameobjects;
  }
  public Map<String, Skeleton> getGameObjs(){
    return gameobjects;
  }
  public Skeleton getObj(String key){
    return gameobjects.get(key);
  }
  public int getsizeofGameobj(){
    return gameobjects.size();
  }

  public Skeleton getInv(int i){
    return inventory.get(i);
  }
  public void setInv(int i,Skeleton obj){
    inventory.set(i,obj);
  }
  public void removeInv(int i){
    inventory.remove(i);
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
