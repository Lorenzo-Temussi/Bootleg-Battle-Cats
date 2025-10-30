package bbc;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Background extends JPanel{
 
  private int currentBackground; // 0 to 36
  private int maxIndex = 36;
  private int rowSize = 16;
  private int currentRow = 0;

  private int bgWidth = 1000;
  private int bgHeight = 690;

  BufferedImage spriteSheet;
  BufferedImage[] sprites;

  public Background() {
    try {
      System.out.println(System.getProperty("user.dir") + "\\Pictures\\Backgrounds.png");
      this.spriteSheet = ImageIO.read(new File(System.getProperty("user.dir") + "\\Pictures\\Backgrounds.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }

    this.sprites = new BufferedImage[maxIndex];

    int index = 0;
    

    for(int currentRow = 0; currentRow < maxIndex/rowSize; currentRow++) {
      if(index >= maxIndex) {
          break;
        }
      for (int positionInRow = 0; positionInRow < rowSize; positionInRow++) {
        if(index >= maxIndex) {
          break;
        }
        sprites[index] = spriteSheet.getSubimage(
            positionInRow * bgWidth,
            currentRow * bgHeight,
            bgWidth,
            bgHeight
        );
        index++;
      }    
    }

  }

  public int changeBackground(int target) {
    if(target < 0 || target > maxIndex) {
      return -1;
    }
    this.currentBackground = target;
    return target;
  }
}
