public abstract class Pickable extends Skeleton{

  private boolean pickble;

  public Pickable(int posx,int posy,int width, int height){
    super(posx,posy,width,height);
  }


  public boolean getPickble(){return pickble;}

  public void setPickble(){pickble=!pickble;}


}
