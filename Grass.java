import java.awt.*;


public class GRASS extends Skeleton{


  private String ID = "GRASS";

  Skeleton hero;


  public GRASS(HERO hero){
    super(0,0,50,30);
    this.hero = hero;
    super.SetID(ID);
  }
  public GRASS(){
    super(0,0,50,30);
  }


   public void render(Graphics g){
     if(!Collision.collided(hero,this)){
       g.drawImage(getImage("GRASS0"), getposx(), getposy(),getwidth(),getheight(), null);
     }else{
       g.drawImage(getImage("GRASS1"), getposx(), getposy(), getwidth(), getheight(), null);
     }
    }

    public void tick(){

    }


}
