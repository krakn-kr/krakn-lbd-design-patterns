package org.krashokkumarnaidu.designpatterns.Structural.composite.ProblemStatement;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    private String directoryName;
    private List<Object> objectList;

    public Directory(String name) {
        this.directoryName = name;
        this.objectList = new ArrayList<>();
    }
    public void ls(){
        System.out.println("Directory: "+this.directoryName);
        for(Object obj : objectList){
            if(obj instanceof File) {
                ((File) obj).ls();
            } else if (obj instanceof Directory) {
                ((Directory) obj).ls();
            }
        }
    }
    public void add(Object obj){
        this.objectList.add(obj);
    }

}
