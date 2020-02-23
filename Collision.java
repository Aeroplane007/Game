public class Collision{

  public boolean collidedinside(Skeleton obj1, Skeleton obj2){
    if(obj1.getposx()+obj1.getwidth()>=obj2.getposx()+obj2.getwidth()){
      obj1.setposx(obj2.getposx()+obj2.getwidth()-obj1.getwidth());
      return true;
    }
    return false;
  }

  public boolean collidedinsider(Skeleton obj1, Skeleton obj2){
    if(obj1.getposx()+obj1.getwidth()>=obj2.getposx()+obj2.getwidth()){
      obj1.setposx(obj2.getposx()+obj2.getwidth()-obj1.getwidth());
      return true;
    }
    return false;
  }


  public boolean collidedinsidel(Skeleton obj1, Skeleton obj2){
    if(obj1.getposx()<=obj2.getposx()){
      obj1.setposx(obj2.getposx());
      return true;
    }
    return false;
  }

  public boolean collidedinsideu(Skeleton obj1, Skeleton obj2){
    if(obj1.getposy()<=obj2.getposy()){
      obj1.setposy(obj2.getposy());
      return true;
    }
    return false;
  }


  public boolean collidedinsided(Skeleton obj1, Skeleton obj2){
    if(obj1.getposy()+obj1.getheight()>=obj2.getposy()+obj2.getheight()){
      obj1.setposy(obj2.getposy()+obj2.getheight()-obj1.getheight());
      return true;
    }
    return false;
  }


  public boolean collided(Skeleton obj1, Skeleton obj2){
    if (obj1.getposx() < obj2.getposx() + obj2.getwidth() &&
   obj1.getposx() + obj1.getwidth() > obj2.getposx() &&
   obj1.getposy() < obj2.getposy() + obj2.getheight() &&
   obj1.getposy() + obj1.getheight() > obj2.getposy()) {
    return true;
  }
  return false;

  }



}
