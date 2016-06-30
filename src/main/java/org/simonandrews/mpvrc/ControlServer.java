package org.simonandrews.mpvrc;

import static spark.Spark.get;

public class ControlServer {
    public static void main(String[] args) {
        get(UrlMap.INDEX, (req, res) -> "hello world");
        get(UrlMap.SEEK_FORWARD_5, (req, res) -> "hello world");
        get(UrlMap.SEEK_BACKWARD_5, (req, res) -> "hello world");
        get(UrlMap.SEEK_FORWARD_60, (req, res) -> "hello world");
        get(UrlMap.SEEK_BACKWARD_60, (req, res) -> "hello world");
        get(UrlMap.TOGGLE_PLAYBACK, (req, res) -> "hello world");
    }
}
