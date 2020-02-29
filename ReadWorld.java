import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.lang.ClassNotFoundException;

public class ReadWorld{

  GraphicsPanel graphics = new GraphicsPanel();

  public ReadWorld(String name){
    System.out.println(name);
    int i = 0;
    try{

      File file = new File("Save/"+name);

      ObjectInputStream objectOut = new ObjectInputStream(new FileInputStream(file));
      Skeleton obj = (Skeleton) objectOut.readObject();
      obj.getId();

    }catch(FileNotFoundException e){
      System.out.println("File not found");
    }catch(IOException e){
      System.out.println("File not found");
    }catch(ClassNotFoundException e){
      System.out.println("Class not found");
    }

  }



}
