import java.awt.*;



public class INVENTORY extends Skeleton{

  String ID = "INVENTORY";


  public INVENTORY(){
    super(50,Frame.Wheight-70,Frame.Wwidth-100,50);
    super.SetID(ID);

  }



   public void render(Graphics g){
       g.setColor(new Color(161, 84, 37));
       g.fillRect(super.getposx(),super.getposy(),super.getwidth(),super.getheight());



    }

    public void tick(){

    }




}
