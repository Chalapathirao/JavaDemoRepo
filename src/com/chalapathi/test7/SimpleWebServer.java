package com.chalapathi.test7;

import com.sun.net.httpserver.SimpleFileServer;

import java.net.InetSocketAddress;
import java.nio.file.Path;

public class SimpleWebServer {

    private static void startFileServer() {
        var server = SimpleFileServer.createFileServer(new InetSocketAddress(8080),
                Path.of("C:\\Chalapathi"),
                SimpleFileServer.OutputLevel.VERBOSE);
        server.start();
    }

    public static void main(String[] args) {
        startFileServer();
    }
}
