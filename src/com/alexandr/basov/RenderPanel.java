package com.alexandr.basov;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class RenderPanel extends JPanel {

    private ImageComparator imageComparator;

    private BufferedImage differences;

    public RenderPanel(BufferedImage image1, BufferedImage image2) throws IOException {

        imageComparator = new ImageComparator();
        differences = imageComparator.getDifferencesImage(image1, image2);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(differences, 0, 0, null);
    }
}
