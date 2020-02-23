public class Camera{

  private float x;
  private float y;
  private Plane plane = new Plane();
  private Hero hero = new Hero();
  private ViewBox viewbox = new ViewBox();
  private Collision col = new Collision();
  private GraphicsPanel graph = new GraphicsPanel();

  public Camera(int x, int y){
    this.x = x;
    this.y = y;
  }

  public void tick(Skeleton obj){
    if(col.collidedinsider(hero,viewbox)){
      x-=3;
      viewbox.setposx(viewbox.getposx()+3);
      plane.setposx(plane.getposx()+3);
      graph.generategrass();
    }

    if(col.collidedinsidel(hero,viewbox)){
      x+=3;
      viewbox.setposx(viewbox.getposx()-3);
      plane.setposx(plane.getposx()-3);
    }

    if(col.collidedinsideu(hero,viewbox)){
      y+=3;
      viewbox.setposy(viewbox.getposy()-3);
      plane.setposy(plane.getposy()-3);
    }

    if(col.collidedinsided(hero,viewbox)){
      y-=3;
      viewbox.setposy(viewbox.getposy()+3);
      plane.setposy(plane.getposy()+3);
    }
  }

  public float getX(){
    return x;
  }
  public float getY(){
    return y;
  }
  public void SetX(float x){
    this.x=x;
  }
  public void SetY(float y){
    this.y=y;
  }



}
