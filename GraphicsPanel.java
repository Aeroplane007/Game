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
import java.util.concurrent.ConcurrentHashMap;


public class GraphicsPanel extends JPanel{


  BufferedImage img = null;
  private static HashMap<String, Skeleton> gameobjects = new LinkedHashMap<String, Skeleton>();
  private static List<Skeleton> inventory = new LinkedList<Skeleton>(Collections.nCopies(9, null));//faster add and remove
  private int NextEmptyInv = 0;
  private static Skeleton ActiveInv;



  public void paint(Graphics g) {

      super.paint(g);
      ActiveInv.setColor(Color.YELLOW);
      Iterator<String> iterator = gameobjects.keySet().iterator();


      while(iterator.hasNext()){
        String c = iterator.next();

        if(!Collision.isInside(getObj(c),getObj("RENDERBOX"))) {continue;}

        if(getObj(c).getId()!="HERO"){

            getObj(c).render(g);

        for(int i=0; i < inventory.size(); i++){
        if(getInv(i)!=null){
          getObj("INVENTORYBOX"  + Integer.toString(i)).setImgId(getInv(i).getId());
        }else{
          getObj("INVENTORYBOX"  + Integer.toString(i)).setImgId(null);
        }
        }


          if(inventory.size()<10){
            if(getObj(c).getPickble()){
              if(Collision.collided(getObj("HERO"),getObj(c))){
                setInv(NextEmptyInv,getObj(c));

                if(!getObj("HERO").getHasObj()){
                  getObj("HERO").setItem(getInv(NextEmptyInv));
                  getObj("HERO").setHasObj();
                }
                iterator.remove();

                NextEmptyInv++;
              }

            }
        }


        }
      }

      getObj("HERO").render(g);
      getActiveInv().render(g);

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
  public static Skeleton getObj(String key){
    return gameobjects.get(key);
  }
  public int getsizeofGameobj(){
    return gameobjects.size();
  }

//inventory
  public Skeleton getInv(int i){
    return inventory.get(i);
  }
  public void setInv(int i,Skeleton obj){
    inventory.set(i,obj);
  }
  public void removeInv(Skeleton obj){
    inventory.remove(obj);
  }
  public void setActiveInv(int i){
    try{
    ActiveInv = getObj("INVENTORYBOX" + Integer.toString(i));
  }catch(IndexOutOfBoundsException e){
    System.out.println("not an inventorybox");
  }
  }
  public Skeleton getActiveInv(){
    return ActiveInv;
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
