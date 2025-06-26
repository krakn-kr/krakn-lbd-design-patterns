package org.krashokkumarnaidu.designpatterns.Structural.Proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyWebServer implements WebServer{
    private RealWebServer realWebServer;
    private List<String> blockedsites = new ArrayList<>();

    public ProxyWebServer() {
        this.realWebServer = new RealWebServer();
    }

    public void blockWebsite(String url){
        blockedsites.add(url);
    }

    @Override
    public void makeRequest(String url) {
        if(!blockedsites.contains(url)){
            realWebServer.makeRequest(url);
        }else{
            System.out.println("Website \""+url+"\" is blocked. Contact your administrator");
        }

    }
}
