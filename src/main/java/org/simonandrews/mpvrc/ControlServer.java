package org.simonandrews.mpvrc;

import java.awt.*;

import static spark.Spark.get;

public class ControlServer {
    public static String SUCCESS_MESSAGE = "OK";
    public static String FAILURE_MESSAGE = "NOT OK";
    public static void main(String[] args) throws AWTException {
        System.out.println("ayy");
        MpvController controller = new MpvController();
        System.out.println("ayy");
        get(UrlMap.INDEX, (req, res) -> FAILURE_MESSAGE);
        get(UrlMap.SEEK_FORWARD_5, (req, res) -> controller.seekForward5());
        get(UrlMap.SEEK_BACKWARD_5, (req, res) -> controller.seekBackward5());
        get(UrlMap.SEEK_FORWARD_60, (req, res) -> controller.seekForward60());
        get(UrlMap.SEEK_BACKWARD_60, (req, res) -> controller.seekBackward60());
        get(UrlMap.TOGGLE_PLAYBACK, (req, res) -> controller.togglePlayback());
        System.out.println("ayy");
    }
}
