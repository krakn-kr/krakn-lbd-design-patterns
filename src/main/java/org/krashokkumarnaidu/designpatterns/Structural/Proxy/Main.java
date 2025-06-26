package org.krashokkumarnaidu.designpatterns.Structural.Proxy;

public class Main {
    public static void main(String[] args) {
        WebServer server = new ProxyWebServer();
        ((ProxyWebServer) server).blockWebsite("www.facebook.com");
        server.makeRequest("www.google.com");
        server.makeRequest("www.facebook.com");
    }

}
