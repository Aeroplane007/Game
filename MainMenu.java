import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Color;

public class MainMenu{

  private JPanel panel;
  private boolean inmenu;

  public MainMenu(){

  }

  public JPanel menu(){
    panel = new JPanel();
    JButton OKButton = new JButton("start");
    OKButton.setFocusable(false);
    //JButton CancelButton = new JButton("Cancel");
    OKButton.addActionListener(e -> okButtonPress());
    //CancelButton.addActionListener((this) -> cancelButtonPress());
    panel.add(OKButton,BorderLayout.CENTER);
    inmenu=true;
    return panel;
  }

  public void paint(Graphics g) {
    g.setColor(Color.BLACK);
    g.drawRect(50,50,50,50);
  }

  public void imenu(){
    while(inmenu){
      try{
      Thread.sleep(10);

    }catch(Exception e){}
    }
  }

  public void okButtonPress() {
    inmenu = false;
  }

  // public void cancelButtonPress() {
  //
  // }

}
