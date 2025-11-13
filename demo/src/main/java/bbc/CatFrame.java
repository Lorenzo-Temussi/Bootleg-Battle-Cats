package bbc;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.xml.crypto.Data;

import org.apache.poi.hssf.record.cf.DataBarFormatting;
 
public class CatFrame {

    public static void main(String[] args) {

      /*
        JFrame f = new JFrame();
        f.setTitle("Bootleg Battle Cats");
        f.setSize(1000, 1000);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null); // We’ll position things manually

        Background bg = new Background();
        bg.setBounds(0, 0, f.getWidth(), f.getHeight());
        f.add(bg);

        CatPoints catPoints = new CatPoints();
        catPoints.setOpaque(false);            // Let the background show through
        catPoints.setBounds(0, 20, 200, 100);   // Position top-left
        f.add(catPoints);

        f.setComponentZOrder(catPoints, 0);
        f.setComponentZOrder(bg, 1);

        f.setVisible(true);

        int result = bg.changeBackground(0);
        Scanner scan = new Scanner(System.in);

        while (true) {
          System.out.print("Input arg\n");
          result = bg.changeBackground(scan.nextInt());
          System.out.println("Current background: " + result);
        }*/

        //test database reader:
        Trooper cat = new Trooper(0);
        

    }
}