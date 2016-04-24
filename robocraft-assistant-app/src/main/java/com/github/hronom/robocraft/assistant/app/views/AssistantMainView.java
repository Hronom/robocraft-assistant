package com.github.hronom.robocraft.assistant.app.views;

import java.awt.*;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.*;

public class AssistantMainView {
    public AssistantMainView(ShootView shootView) {
        JPanel mainPanel = new JPanel();
        mainPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));

        GridBagLayout layout = new GridBagLayout();
        mainPanel.setLayout(layout);

        GridBagConstraints constraint = new GridBagConstraints();
        constraint.insets = new Insets(3, 3, 3, 3);
        constraint.weightx = 1;
        constraint.weighty = 1;
        constraint.gridx = 0;
        constraint.gridy = 0;
        constraint.gridwidth = 1;
        constraint.gridheight = 1;
        constraint.fill = GridBagConstraints.BOTH;
        mainPanel.add(shootView, constraint);

        ArrayList<Image> images = new ArrayList<>();
        images.add(getImage("1461511403_robot_64.png"));

        JFrame frame = new JFrame("Robocraft assistant");
        frame.setIconImages(images);
        frame.setContentPane(mainPanel);
        frame.setPreferredSize(new Dimension(500, 150));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private Image getImage(String fileName) {
        URL url = this.getClass().getResource(fileName);
        ImageIcon imageIcon = new ImageIcon(url);
        return imageIcon.getImage();
    }
}
