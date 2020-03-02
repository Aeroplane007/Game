public class Collision{

  private Collision() {

  }

  public static boolean isInside(Skeleton obj1, Skeleton obj2){
    if(obj1.getposx()+obj1.getwidth() < obj2.getposx()+obj2.getwidth() &&
        obj1.getposx() > obj2.getposx() && obj1.getposy() > obj2.getposy() &&
        obj1.getposy()+obj1.getheight() < obj2.getposy()+obj2.getheight()){
      return true;
    }
    return false;
  }

  public static boolean collidedinsider(Skeleton obj1, Skeleton obj2){
    if(obj1.getposx()+obj1.getwidth()>=obj2.getposx()+obj2.getwidth()){
      return true;
    }
    return false;
  }


  public static boolean collidedinsidel(Skeleton obj1, Skeleton obj2){
    if(obj1.getposx()<=obj2.getposx()){
      return true;
    }
    return false;
  }

  public static boolean collidedinsideu(Skeleton obj1, Skeleton obj2){
    if(obj1.getposy()<=obj2.getposy()){
      return true;
    }
    return false;
  }


  public static boolean collidedinsided(Skeleton obj1, Skeleton obj2){
    if(obj1.getposy()+obj1.getheight()>=obj2.getposy()+obj2.getheight()){
      return true;
    }
    return false;
  }


  public static boolean collided(Skeleton obj1, Skeleton obj2){
    if (obj1.getposx() < obj2.getposx() + obj2.getwidth() &&
   obj1.getposx() + obj1.getwidth() > obj2.getposx() &&
   obj1.getposy() < obj2.getposy() + obj2.getheight() &&
   obj1.getposy() + obj1.getheight() > obj2.getposy()) {
    return true;
  }
  return false;

  }



}
