package com.github.hronom.robocraft.assistant.app.models;

import com.github.hronom.robocraft.assistant.core.Shooter;
import com.tulskiy.keymaster.common.HotKey;
import com.tulskiy.keymaster.common.HotKeyListener;
import com.tulskiy.keymaster.common.Provider;

import java.awt.*;

import javax.swing.*;

public class ShooterModel {
    private final Provider provider = Provider.getCurrentProvider(true);
    private Shooter shooter;

    public ShooterModel() throws AWTException, InterruptedException {
        shooter = new Shooter();
    }

    public void set(Character keyChar, int shootDelay, int shootCount) {
        provider.reset();
        provider.register(KeyStroke.getKeyStroke(String.valueOf(keyChar)), new HotKeyListener() {
            public void onHotKey(HotKey hotKey) {
                shooter.toggle();
            }
        });
        shooter.resetAndStart(shootDelay, shootCount);
    }
}
