import java.awt.*;

public class Hero extends Skeleton{


  private String ID = "HERO";

  public Hero(){
    super(200,200,20,20);
    super.SetID(ID);
  }

  public void render(Graphics g){
    g.setColor(Color.BLUE);
    g.fillRect(getposx(),getposy(),getwidth(),getheight());

  }
  
  public void tick(){
    super.setposx(super.getposx()+super.getSpeedx());
    super.setposy(super.getposy()+super.getSpeedy());
  }






}
