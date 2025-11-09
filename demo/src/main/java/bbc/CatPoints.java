package bbc;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;
import javax.swing.Timer;

public class CatPoints extends JPanel {

    private int catPoints = 0;
    private BufferedImage staticBackground; // pre-rendered black box image

    public CatPoints() {
        setOpaque(false);
        setBounds(0, 0, 200, 100);

        // Pre-render the black box ONCE or your soul will be sold to space demon
        staticBackground = new BufferedImage(200, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = staticBackground.createGraphics();
        g2.setColor(new Color(0, 0, 0, 150));
        g2.fillRoundRect(10, 10, 160, 40, 10, 10);
        g2.dispose();

        // Timer that adds 1 points every 0.1 seconds
        Timer timer = new Timer(100, e -> {
            catPoints += 1;
            repaint(10, 10, 160, 40); // repaint only the small region where text is
        });
        timer.start();
    }

    public void addPoints(int amount) {     // cless to be filled with logic for pointgaining when enemis perish
        catPoints += amount;
        repaint(10, 10, 160, 40);
    }

    public void subtractPoints(int amount) {   // cless to be filled with logic for pointgaining when cats are summoned
        catPoints -= amount;
        if (catPoints < 0) catPoints = 0;
        repaint(10, 10, 160, 40);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(staticBackground, 0, 0, null);

        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("CatPoints: " + catPoints, 20, 37);
    }
}