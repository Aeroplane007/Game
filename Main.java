import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Main extends JFrame{

  static int Wwidth = 550;
  static int Wheight = 500;
  Mover mov = new Mover();
//width och height kännesteckans med den första bokstave i det dem står för först i varibalen
//t.ex. Window width blir Wwidth och Window Height blir WHeight

  public Main(int Wwidth, int Wheight){
    initUI(Wwidth,Wheight);
  }
  public void initUI(int Wwidth, int Wheight){

    add(new GraphicsPanel());
    addKeyListener(mov);
    setSize(Wwidth,Wheight);
    setTitle("Dungeon");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);


  }


  public static void main(String args[]){
    Main ex = new Main(Wwidth,Wheight);
    ex.setVisible(true);



  }

}
