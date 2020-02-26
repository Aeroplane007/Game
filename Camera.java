public class Camera{

  private float x;
  private float y;

  private Collision col;
  private Mover move;

  public Camera(int x, int y, Mover move){
    this.x = x;
    this.y = y;
    this.move = move;
    col = new Collision();
  }

  public void tick(Skeleton hero, Skeleton plane, Skeleton renderB,Skeleton viewbox){
    if(col.collidedinsider(hero,viewbox)){
      x-=move.getspeed();
      viewbox.setposx(viewbox.getposx()+move.getspeed());
      plane.setposx(plane.getposx()+move.getspeed());
      renderB.setposx(renderB.getposx()+move.getspeed());
    }

    if(col.collidedinsidel(hero,viewbox)){
      x+=move.getspeed();
      viewbox.setposx(viewbox.getposx()-move.getspeed());
      plane.setposx(plane.getposx()-move.getspeed());
      renderB.setposx(renderB.getposx()-move.getspeed());
    }

    if(col.collidedinsideu(hero,viewbox)){
      y+=move.getspeed();
      viewbox.setposy(viewbox.getposy()-move.getspeed());
      plane.setposy(plane.getposy()-move.getspeed());
      renderB.setposy(renderB.getposy()-move.getspeed());
    }

    if(col.collidedinsided(hero,viewbox)){
      y-=move.getspeed();
      viewbox.setposy(viewbox.getposy()+move.getspeed());
      plane.setposy(plane.getposy()+move.getspeed());
      renderB.setposy(renderB.getposy()+move.getspeed());
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
