package org.krashokkumarnaidu.designpatterns.CreationalDesignPatterns.Singleton.EagerInitialization;

public class Main {
    public static void main(String[] args) {
        SingletonLogger logger = SingletonLogger.getInstance();
        logger.log("This is logger test msg",LogLevel.INFO);
    }
}
