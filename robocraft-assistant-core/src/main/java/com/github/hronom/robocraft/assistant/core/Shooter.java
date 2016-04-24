package com.github.hronom.robocraft.assistant.core;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.swing.*;

public class Shooter {
    private final int mask = InputEvent.BUTTON1_DOWN_MASK;

    private final AtomicBoolean enabled = new AtomicBoolean(false);
    private int shootCount;

    private final Robot robot;
    private final Timer timer;

    public Shooter() throws AWTException {
        robot = new Robot();
        ActionListener taskPerformer = createTaskPerformer();
        timer = new Timer(-1, taskPerformer);
        timer.setRepeats(true);
    }

    public void resetAndStart(int shootDelayArg, int shootCountArg) {
        shootCount = shootCountArg;
        timer.stop();
        timer.setDelay(shootDelayArg);
        timer.start();
    }

    public void toggle() {
        enabled.set(!enabled.get());
    }

    private ActionListener createTaskPerformer() {
        return new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (enabled.get()) {
                    for (int i = 0; i < shootCount; i++) {
                        robot.mousePress(mask);
                        robot.delay(10);
                        robot.mouseRelease(mask);

                        if (i + 1 != shootCount) {
                            robot.delay(100);
                        }
                    }

                    System.out.println("Shoot!!!");
                }
            }
        };
    }
}
