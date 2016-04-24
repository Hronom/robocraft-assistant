package com.github.hronom.robocraft.assistant.core;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.swing.*;

public class Shooter {
    private final AtomicBoolean enabled = new AtomicBoolean(false);
    private final Robot robot;

    public Shooter() throws AWTException {
        robot = new Robot();
        int delay = 1000; //milliseconds
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (enabled.get()) {
                    int mask = InputEvent.BUTTON1_DOWN_MASK;

                    robot.mousePress(mask);
                    robot.delay(10);
                    robot.mouseRelease(mask);

                    robot.delay(100);

                    robot.mousePress(mask);
                    robot.delay(10);
                    robot.mouseRelease(mask);

                    robot.delay(100);

                    robot.mousePress(mask);
                    robot.delay(10);
                    robot.mouseRelease(mask);

                    robot.delay(100);

                    robot.mousePress(mask);
                    robot.delay(10);
                    robot.mouseRelease(mask);

                    robot.delay(100);

                    robot.mousePress(mask);
                    robot.delay(10);
                    robot.mouseRelease(mask);

                    /*robot.delay(100);

                    robot.mousePress(mask);
                    robot.delay(10);
                    robot.mouseRelease(mask);*/

                    //System.out.println("Shoot!!!");
                }
            }
        };
        new Timer(delay, taskPerformer).start();
    }

    public void toggle() {
        enabled.set(!enabled.get());
    }
}
