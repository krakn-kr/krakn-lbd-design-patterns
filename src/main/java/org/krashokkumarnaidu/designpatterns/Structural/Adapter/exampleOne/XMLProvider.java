package org.krashokkumarnaidu.designpatterns.Structural.Adapter.exampleOne;
//Step 2: Create the Adaptee (Legacy XML Provider)

public class XMLProvider {
    public String provideXML() {
        return "<data>Hello, world!</data>";
    }
}
