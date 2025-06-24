package org.krashokkumarnaidu.designpatterns.Creational.Singleton.LazyInitialization;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SingletonLogger {
    private static SingletonLogger instance;
    private SingletonLogger(){

    }
    public static SingletonLogger getInstance(){
        if(instance == null){
            instance = new SingletonLogger();
        }
        return instance;
    }
    public void log(String messsage, LogLevel logLevel){
        String timeStamp = LocalDateTime.now().format(DateTimeFormatter
                .ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(instance+"  "+timeStamp+" "+logLevel+":"+" is running on " + Thread.currentThread().getName()+messsage);
    }
}
