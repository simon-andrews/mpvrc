package org.simonandrews.mpvrc;

import java.awt.*;
import java.awt.event.KeyEvent;

public class MpvController {
    private Robot robot;
    public MpvController() throws AWTException{
        robot = new Robot();
    }
    public String seekForward5() {
        pressAndRelease(KeyEvent.VK_RIGHT);
        return ControlServer.SUCCESS_MESSAGE;
    }
    public String seekBackward5() {
        pressAndRelease(KeyEvent.VK_LEFT);
        return ControlServer.SUCCESS_MESSAGE;
    }
    public String seekForward60() {
        pressAndRelease(KeyEvent.VK_UP);
        return ControlServer.SUCCESS_MESSAGE;
    }
    public String seekBackward60() {
        pressAndRelease(KeyEvent.VK_DOWN);
        return ControlServer.SUCCESS_MESSAGE;
    }
    public String togglePlayback() {
        pressAndRelease(KeyEvent.VK_SPACE);
        return ControlServer.SUCCESS_MESSAGE;
    }
    private void pressAndRelease(int keycode) {
        System.out.printf("pressing key with scancode %d\n", keycode);
        robot.keyPress(keycode);
        System.out.printf("releasing key with scancode %d\n", keycode);
        robot.keyRelease(keycode);
    }
}
