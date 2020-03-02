import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.lang.ClassNotFoundException;
import java.util.*;

public class WorldReader {

  public static Map<String, Skeleton> readWorld(String name){
    System.out.println(name);
    int i = 0;
    try{

      File file = new File("Save/"+name);
      System.out.println(file.getPath());
      ObjectInputStream objectOut = new ObjectInputStream(new FileInputStream(file));
      return (HashMap<String, Skeleton>) objectOut.readObject();
    }catch(FileNotFoundException e){
      System.out.println("File not found");
    }catch(IOException e){
      e.printStackTrace();
    }catch(ClassNotFoundException e){
      System.out.println("Class not found");
    }
    return null;
  }



}
