package org.simonandrews.mpvrc;

import static spark.Spark.get;

public class ControlServer {
    public static void main(String[] args) {
        get("/", (req, res) -> "hello world");
    }
}
