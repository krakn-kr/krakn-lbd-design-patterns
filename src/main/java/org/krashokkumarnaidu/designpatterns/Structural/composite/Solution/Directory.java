package org.krashokkumarnaidu.designpatterns.Structural.composite.Solution;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    private String directoryName;
    private List<FileSystem> fileSystemList;

    public Directory(String name) {
        this.directoryName = name;
        this.fileSystemList = new ArrayList<>();
    }

    @Override
    public void ls(){
        System.out.println("Directory: "+this.directoryName);
        for(FileSystem fileSystem : fileSystemList){
            fileSystem.ls();
        }
    }
    public void add(FileSystem fileSystem){
        this.fileSystemList.add(fileSystem);
    }

}
