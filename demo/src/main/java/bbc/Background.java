package bbc;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Background extends JPanel{
 
  private int currentBackground; // 0 to maxIndex

  private int maxIndex = 36;
  private int rowSize = 16;

  private int bgWidth = 1000;
  private int bgHeight = 690;

  BufferedImage spriteSheet;
  BufferedImage[] sprites;

  public Background() {
    try {
      InputStream is = Background.class.getResourceAsStream("/Pictures/Backgrounds.png");
      this.spriteSheet = ImageIO.read(is);
    } catch (IOException e) {
      e.printStackTrace();
    }

    this.sprites = new BufferedImage[maxIndex];

    int index = 0;
    

    for(int currentRow = 0; true; currentRow++) {
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
