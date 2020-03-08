import java.awt.Graphics;
import java.awt.Color;
import java.util.List;
import java.util.LinkedList;

public class HERO extends Skeleton{


  private String ID = "HERO";


  public HERO(){
    super(200,200,20,20);
    super.SetID(ID);
  }

  public void render(Graphics g){
    g.setColor(Color.BLUE);
    g.fillRect(getposx(),getposy(),getwidth(),getheight());
    if(getHasObj() && getItem() != null){
      getItem().setposx(super.getposx()+25);
      getItem().setposy(super.getposy());
      getItem().render(g);
    }

  }

  public void tick(){
    super.setposx(super.getposx()+super.getSpeedx());
    super.setposy(super.getposy()+super.getSpeedy());
  }








}
