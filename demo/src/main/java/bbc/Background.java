package bbc;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Background extends JPanel {

    private int currentBackground; // 0 to maxIndex
    private int maxIndex = 36;     
    private int rowSize = 16;      

    private int bgWidth = 1024;    
    private int bgHeight = 690;
    private int lineWidth = 15;    

    private BufferedImage spriteSheet;
    private BufferedImage[] sprites;

    public Background() {
        try {
            InputStream is = Background.class.getResourceAsStream("/Pictures/Backgrounds.png");
            this.spriteSheet = ImageIO.read(is);
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.sprites = new BufferedImage[maxIndex];

        int index = 0;
        bgWidth = (spriteSheet.getWidth() - 14* lineWidth) / 16; // literal magic formula don't edit
        bgHeight = (spriteSheet.getHeight() - 2* lineWidth) / 3;
        System.out.println(bgWidth);

        for (int currentRow = 0; true; currentRow++) {
            if (index >= maxIndex) break;

            for (int positionInRow = 0; positionInRow < rowSize; positionInRow++) {
                if (index >= maxIndex) break;
                System.out.println(index + 1);
                sprites[index] = spriteSheet.getSubimage(
                    positionInRow * (bgWidth + lineWidth),
                    currentRow * (bgHeight + lineWidth),
                    ((index + 1) % 16 == 0) ? (spriteSheet.getWidth() - positionInRow * (bgWidth + lineWidth)) : bgWidth,
                    bgHeight
                );
                System.out.println("Coordinate pto partenza: x: " + positionInRow * (bgWidth + lineWidth) + "\ny: " + currentRow * bgHeight);
                System.out.println("Coordinate pto arrivo: x: " + (positionInRow * (bgWidth + lineWidth) + bgWidth) + "\ny: " + (currentRow * bgHeight + bgHeight));
                index++;
            }
        }

        currentBackground = 0;
    }

    public int changeBackground(int target) {
        if (target < 0 || target >= maxIndex) {
            return -1;
        }
        this.currentBackground = target;
        repaint(); 
        return target;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (sprites[currentBackground] != null) {
            g.drawImage(sprites[currentBackground], 0, 0, getWidth(), getHeight(), null);
        }
    }
}