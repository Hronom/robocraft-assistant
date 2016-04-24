package com.github.hronom.robocraft.assistant.app.views;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.DocumentListener;

public class ShootView extends JPanel {
    private static final Logger logger = LogManager.getLogger();

    private final JLabel shootDelayLabel;
    private final JTextField shootDelayTextField;

    private final JLabel shootCountLabel;
    private final JTextField shootCountTextField;

    private final JLabel keyLabel;
    private final JTextField keyTextField;

    private final JButton applySettingsButton;

    public ShootView() {
        this.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));

        GridBagLayout layout = new GridBagLayout();
        this.setLayout(layout);

        GridBagConstraints constraint = new GridBagConstraints();
        constraint.insets = new Insets(3, 3, 3, 3);
        constraint.weightx = 1;
        constraint.weighty = 0;
        constraint.gridwidth = 1;
        constraint.anchor = GridBagConstraints.CENTER;

        {
            shootDelayLabel = new JLabel("Shoot delay:");

            constraint.weightx = 0;
            constraint.weighty = 0;
            constraint.gridx = 0;
            constraint.gridy = 0;
            constraint.gridwidth = 1;
            constraint.gridheight = 1;
            constraint.fill = GridBagConstraints.BOTH;
            this.add(shootDelayLabel, constraint);
        }

        {
            shootDelayTextField = new JTextField("1000");

            constraint.weightx = 1;
            constraint.weighty = 0;
            constraint.gridx = 1;
            constraint.gridy = 0;
            constraint.gridwidth = 1;
            constraint.gridheight = 1;
            constraint.fill = GridBagConstraints.BOTH;
            this.add(shootDelayTextField, constraint);
        }

        {
            shootCountLabel = new JLabel("Shoot count:");

            constraint.weightx = 0;
            constraint.weighty = 0;
            constraint.gridx = 0;
            constraint.gridy = 1;
            constraint.gridwidth = 1;
            constraint.gridheight = 1;
            constraint.fill = GridBagConstraints.BOTH;
            this.add(shootCountLabel, constraint);
        }

        {
            shootCountTextField = new JTextField("5");

            constraint.weightx = 1;
            constraint.weighty = 0;
            constraint.gridx = 1;
            constraint.gridy = 1;
            constraint.gridwidth = 1;
            constraint.gridheight = 1;
            constraint.fill = GridBagConstraints.BOTH;
            this.add(shootCountTextField, constraint);
        }

        {
            keyLabel = new JLabel("Key:");

            constraint.weightx = 0;
            constraint.weighty = 0;
            constraint.gridx = 0;
            constraint.gridy = 2;
            constraint.gridwidth = 1;
            constraint.gridheight = 1;
            constraint.fill = GridBagConstraints.BOTH;
            this.add(keyLabel, constraint);
        }

        {
            keyTextField = new JTextField("R");

            constraint.weightx = 1;
            constraint.weighty = 0;
            constraint.gridx = 1;
            constraint.gridy = 2;
            constraint.gridwidth = 1;
            constraint.gridheight = 1;
            constraint.fill = GridBagConstraints.BOTH;
            this.add(keyTextField, constraint);
        }

        {
            applySettingsButton = new JButton("Apply settings");

            constraint.weightx = 1;
            constraint.weighty = 0;
            constraint.gridx = 0;
            constraint.gridy = 3;
            constraint.gridwidth = 2;
            constraint.gridheight = 1;
            constraint.fill = GridBagConstraints.BOTH;
            this.add(applySettingsButton, constraint);
        }
    }

    public String shootDelay() {
        return shootDelayTextField.getText();
    }

    public String shootCount() {
        return shootCountTextField.getText();
    }

    public String key() {
        return keyTextField.getText();
    }

    public void addApplySettingsButtonActionListener(ActionListener actionListener) {
        applySettingsButton.addActionListener(actionListener);
    }
}
