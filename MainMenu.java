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
    JButton ReadButton = new JButton("Read Game");
    JButton CreateButton = new JButton("Create World");
    ReadButton.setFocusable(false);
    CreateButton.setFocusable(false);

    //JButton CancelButton = new JButton("Cancel");
    ReadButton.addActionListener(e -> ReadButtonPress());
    CreateButton.addActionListener(e -> CreateButtonPress());

    panel.add(ReadButton,BorderLayout.CENTER);
    panel.add(CreateButton,BorderLayout.CENTER);
    inmenu=true;
    return panel;
  }

  public void paint(Graphics g) {
    g.setColor(Color.BLACK);
    g.drawRect(50,50,50,50);
  }

  public String imenu(){
    while(inmenu){
      try{
      Thread.sleep(10);

    }catch(Exception e){}

    }
    String saveN = JOptionPane.showInputDialog(panel,"What is your name?", null);
    return saveN;
  }

  public void CreateButtonPress() {
    inmenu = false;


  }
  public void ReadButtonPress(){
    inmenu = false;
    //new ReadWorld();
  }

  // public void cancelButtonPress() {
  //
  // }

}
