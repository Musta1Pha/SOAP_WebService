package org.sid;

import jakarta.xml.ws.Endpoint;
import org.sid.ws.BanqueService;

public class Main {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:8888/",new BanqueService());
    }
}