import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;


public class Frame extends JFrame{

  static int Wwidth = 550;
  static int Wheight = 500;
  Mover mov = new Mover();

  public Frame(){
    add(new GraphicsPanel());
    addKeyListener(mov);
    setSize(Wwidth,Wheight);
    setTitle("Dungeon");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);


  }


}
