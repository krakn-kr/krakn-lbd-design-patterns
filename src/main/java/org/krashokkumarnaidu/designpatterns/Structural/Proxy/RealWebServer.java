package org.krashokkumarnaidu.designpatterns.Structural.Proxy;

public class RealWebServer implements WebServer{

    @Override
    public void makeRequest(String url) {
        // Actual logic to connect to the URL
        System.out.println("Accessing: "+url);
    }
}
