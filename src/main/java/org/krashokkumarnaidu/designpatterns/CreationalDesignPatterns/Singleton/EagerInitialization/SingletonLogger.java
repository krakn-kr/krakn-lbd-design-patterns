package org.krashokkumarnaidu.designpatterns.CreationalDesignPatterns.Singleton.EagerInitialization;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SingletonLogger {
    private static SingletonLogger instance = new SingletonLogger();
    private SingletonLogger(){

    }
    public static SingletonLogger getInstance(){
        return instance;
    }
    public void log(String messsage,LogLevel logLevel){
        String timeStamp = LocalDateTime.now().format(DateTimeFormatter
                .ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(timeStamp+" "+logLevel+":"+messsage);
    }
}
