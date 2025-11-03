package bbc;

import javax.swing.JFrame;
 
public class CatFrame {

    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setTitle("Bootleg Battle Cats");
        f.setSize(1000, 1000);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Background bg = new Background();
        f.add(bg);

        f.setVisible(true);

        int result = bg.changeBackground(1);
        System.out.println("Current background: " + result);
    }
}