package com.github.hronom.robocraft.assistant.app;

import com.github.hronom.robocraft.assistant.core.Shooter;
import com.tulskiy.keymaster.common.HotKey;
import com.tulskiy.keymaster.common.HotKeyListener;
import com.tulskiy.keymaster.common.Provider;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

public class App {
    public static void main(String[] args) throws InterruptedException, AWTException {
        final Shooter shooter = new Shooter();

        Provider provider = Provider.getCurrentProvider(true);
        provider.register(KeyStroke.getKeyStroke(KeyEvent.VK_R, 0), new HotKeyListener() {
            public void onHotKey(HotKey hotKey) {
                shooter.toggle();
            }
        });

        Thread.sleep(TimeUnit.DAYS.toMillis(1000));

        provider.reset();
        provider.stop();
    }
}
