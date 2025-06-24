package org.krashokkumarnaidu.designpatterns.Structural.Adapter.exampleOne;
/*
Adapter Design Pattern Explained
The Adapter design pattern is a structural pattern that enables objects with incompatible interfaces to work together. It acts as a bridge between two interfaces, allowing integration without modifying existing code. This is especially useful when you need to use legacy or third-party code that doesn't match your application's expected interface.

Key Components
Target: The interface your client expects to work with.

Adaptee: The existing class with an incompatible interface.

Adapter: Implements the Target interface and internally uses the Adaptee.

Client: Uses the Target interface and interacts with the Adapter, unaware of the Adaptee
 */
//Step 4: Client Usage
public class Client {
    public static void main(String[] args) {
        XMLProvider xmlProvider = new XMLProvider();
        JSONProvider adapter = new XMLToJSONAdapter(xmlProvider);

        String jsonData = adapter.provideJSON();
        System.out.println("JSON Data: " + jsonData);
    }
}
