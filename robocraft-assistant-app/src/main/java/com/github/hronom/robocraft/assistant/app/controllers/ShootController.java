package com.github.hronom.robocraft.assistant.app.controllers;

import com.github.hronom.robocraft.assistant.app.models.ShooterModel;
import com.github.hronom.robocraft.assistant.app.views.ShootView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShootController {
    public ShootController(ShooterModel shooterModel, ShootView shootViewArg) {
        shootViewArg.addApplySettingsButtonActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shooterModel.set(
                    shootViewArg.key().toUpperCase().charAt(0),
                    Integer.valueOf(shootViewArg.shootDelay()),
                    Integer.valueOf(shootViewArg.shootCount())
                );
            }
        });
    }
}