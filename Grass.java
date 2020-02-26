import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;


public class Grass extends Skeleton{


  private String ID = "GRASS";
  private Collision col = new Collision();
  static BufferedImage imgF,imgC;
  String ImgNameF = "Grass.jpg";
  String ImgNameC = "GrassOp.jpg";
  Skeleton hero;


  public Grass(Hero hero){
    super(0,0,50,30);
    this.hero = hero;
    super.SetID(ID);
  }
  public Grass(){
    super(0,0,50,30);
  }

  public void loadimg(){
    try{
      imgF = ImageIO.read(new File(ImgNameF));
      imgC = ImageIO.read(new File(ImgNameC));
    }catch(IOException e){
      System.out.println("Could not load image: " + ImgNameF + " and or " + ImgNameC);
    }
  }

   public void render(Graphics g){
     if(!col.collided(hero,this)){
       g.drawImage(imgF, getposx(), getposy(),getwidth(),getheight(), null);
     }else{
       g.drawImage(imgC, getposx(), getposy(), getwidth(), getheight(), null);
     }
    }

    public void tick(){

    }


}
