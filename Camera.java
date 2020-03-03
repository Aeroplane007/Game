public class Camera{

  private float x;
  private float y;

  private Mover move;

  public Camera(int x, int y, Mover move){
    this.x = x;
    this.y = y;
    this.move = move;
  }

  public void tick(Skeleton hero, GraphicsPanel graphics){
    if(Collision.collidedinsider(hero,graphics.getObj("VIEWBOX"))){
      x-=move.getspeed();
      graphics.getObj("VIEWBOX").setposx(graphics.getObj("VIEWBOX").getposx()+move.getspeed());
      graphics.getObj("PLANE").setposx(graphics.getObj("PLANE").getposx()+move.getspeed());
      graphics.getObj("RENDERBOX").setposx(graphics.getObj("RENDERBOX").getposx()+move.getspeed());
      graphics.getObj("INVENTORY").setposx(graphics.getObj("INVENTORY").getposx()+move.getspeed());
      for(String c : graphics.getGameObjs().keySet()){
        if(graphics.getObj(c).getId()=="INVENTORYBOX"){
          graphics.getObj(c).setposx(graphics.getObj(c).getposx()+move.getspeed());

        }
      }
    }

    if(Collision.collidedinsidel(hero,graphics.getObj("VIEWBOX"))){
      x+=move.getspeed();
      graphics.getObj("VIEWBOX").setposx(graphics.getObj("VIEWBOX").getposx()-move.getspeed());
      graphics.getObj("PLANE").setposx(graphics.getObj("PLANE").getposx()-move.getspeed());
      graphics.getObj("RENDERBOX").setposx(graphics.getObj("RENDERBOX").getposx()-move.getspeed());
      graphics.getObj("INVENTORY").setposx(graphics.getObj("INVENTORY").getposx()-move.getspeed());
      for(String c : graphics.getGameObjs().keySet()){
        if(graphics.getObj(c).getId()=="INVENTORYBOX"){
          graphics.getObj(c).setposx(graphics.getObj(c).getposx()-move.getspeed());

        }
      }
    }

    if(Collision.collidedinsideu(hero,graphics.getObj("VIEWBOX"))){
      y+=move.getspeed();
      graphics.getObj("VIEWBOX").setposy(graphics.getObj("VIEWBOX").getposy()-move.getspeed());
      graphics.getObj("PLANE").setposy(graphics.getObj("PLANE").getposy()-move.getspeed());
      graphics.getObj("RENDERBOX").setposy(graphics.getObj("RENDERBOX").getposy()-move.getspeed());
      graphics.getObj("INVENTORY").setposy(graphics.getObj("INVENTORY").getposy()-move.getspeed());
      for(String c : graphics.getGameObjs().keySet()){
        if(graphics.getObj(c).getId()=="INVENTORYBOX"){
          graphics.getObj(c).setposy(graphics.getObj(c).getposy()-move.getspeed());

        }
      }
    }

    if(Collision.collidedinsided(hero,graphics.getObj("VIEWBOX"))){
      y-=move.getspeed();
      graphics.getObj("VIEWBOX").setposy(graphics.getObj("VIEWBOX").getposy()+move.getspeed());
      graphics.getObj("PLANE").setposy(graphics.getObj("PLANE").getposy()+move.getspeed());
      graphics.getObj("RENDERBOX").setposy(graphics.getObj("RENDERBOX").getposy()+move.getspeed());
      graphics.getObj("INVENTORY").setposy(graphics.getObj("INVENTORY").getposy()+move.getspeed());
      for(String c : graphics.getGameObjs().keySet()){
        if(graphics.getObj(c).getId()=="INVENTORYBOX"){
          graphics.getObj(c).setposy(graphics.getObj(c).getposy()+move.getspeed());

        }
      }
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
