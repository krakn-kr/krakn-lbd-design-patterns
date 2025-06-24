package org.krashokkumarnaidu.designpatterns.Creational.Singleton.ThreadSafeVersion;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);

            for (int i = 0; i <= 10; i++) {
            final int threadNumber = i;
            executor.submit(()->{
                SingletonLogger log = SingletonLogger.getInstance();
                log.log("This is logger test msg", LogLevel.INFO);
                 });
        }
        executor.shutdown();
    }
}
