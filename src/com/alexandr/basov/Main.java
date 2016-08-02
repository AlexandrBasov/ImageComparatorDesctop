package com.alexandr.basov;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Main {

    private BufferedImage image1 = ImageIO.read(RenderPanel.class.getResource("/image1.png"));
    private BufferedImage image2 = ImageIO.read(RenderPanel.class.getResource("/image2.png"));

    public Main() throws IOException {
        JFrame frame = new JFrame();
        frame.getContentPane().setLayout(new FlowLayout());
        RenderPanel renderPanel = new RenderPanel(image1, image2);
        Dimension dim = new Dimension(image1.getWidth(),image2.getHeight());
        renderPanel.setSize(dim);
        renderPanel.setMinimumSize(dim);
        renderPanel.setMaximumSize(dim);
        renderPanel.setPreferredSize(dim);

        frame.getContentPane().add(renderPanel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) throws IOException {

        new Main();
    }
}
