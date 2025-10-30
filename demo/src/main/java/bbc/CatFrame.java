package bbc;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CatFrame{
  public int WIDTH = 800;
  public int HEIGHT = 600;
  public String TITLE = "Bootleg Battle Cats";
  

  public CatFrame() {
    /*this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
        
    this.setSize(WIDTH, HEIGHT);
    this.setTitle(TITLE);*/
  }

  public static void main(String[] args) {  

    JFrame f = new JFrame();
    f.setTitle("Bootleg Battle Cats");
    f.setSize(1000, 1000);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Background bg = new Background();
    System.out.println(bg.changeBackground(12));
  }
}
