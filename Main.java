import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;
import java.awt.image.BufferStrategy;

public class Main implements Runnable{


  private Thread thread;
  private boolean running = false;
  private GraphicsPanel graphic = new GraphicsPanel();
  private Frame ex = new Frame();
  private Mover mov = new Mover();
  private Camera cam = new Camera(0,0);
  private Hero hero = new Hero();
  private Plane plane = new Plane();
  private ViewBox viewbox = new ViewBox();

  public Main(){
    ex.setVisible(true);
    start();
  }

  public synchronized void start(){
    thread = new Thread(this);
    thread.start();
    running = true;
  }
  public synchronized void stop(){
    try{
    thread.join();
    running = false;
  }catch(Exception e){
    System.out.println("Could not stop thread" + e.getStackTrace());
  }

  }


  public void run(){
    long lastTime = System.nanoTime();
    double amountOfTicks = 60.0;
    double ns = 1000000000 / amountOfTicks;
    double delta = 0;
    long timer = System.currentTimeMillis();
    int frames = 0;
    while(running){
      long now = System.nanoTime();
      delta += (now - lastTime) / ns;
      lastTime = now;
      while(delta >= 1){
        tick();
        delta--;
      }
      if(running){
        render();
      }
      frames++;

      // if(System.currentTimeMillis() - timer > 1000){
      //   timer += 1000;
      //   System.out.println("FPS: " + frames);
      //   frames = 0;
      // }
    }
    stop();

  }

  private void tick(){
    hero.tick();
    cam.tick(hero);
    cam.tick(plane);
  }

  public void render(){
    //skapa minnes plats för ny ruta
    BufferStrategy bs = ex.getBufferStrategy();
    if(bs==null){
      ex.createBufferStrategy(3);
      return;
    }

    Graphics g = bs.getDrawGraphics();
    Graphics2D g2d = (Graphics2D) g;
    g2d.translate(cam.getX(),cam.getY());

    graphic.paint(g);

    g2d.translate(-cam.getX(),-cam.getY());
    g.dispose();
    bs.show();

  }



  public static void main(String args[]){
      new Main();
    // while(true){
    //    ex.repaint();
    //  }


  }

}
