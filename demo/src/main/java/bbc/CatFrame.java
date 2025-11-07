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

        Background bg = new Background();
        f.add(bg);

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