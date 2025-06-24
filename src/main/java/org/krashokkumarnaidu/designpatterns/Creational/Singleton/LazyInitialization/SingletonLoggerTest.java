package org.krashokkumarnaidu.designpatterns.Creational.Singleton.LazyInitialization;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public class SingletonLoggerTest {
    public static void main(String[] args) throws InterruptedException {
        int numThreads = 100;
        Set<SingletonLogger> instances = Collections.synchronizedSet(new HashSet<>());
        CountDownLatch latch = new CountDownLatch(numThreads);

        // Create and start multiple threads
        for (int i = 0; i < numThreads; i++) {
            Thread t = new Thread(() -> {
                SingletonLogger instance = SingletonLogger.getInstance();
                instances.add(instance);
                latch.countDown();
            });
            t.start();
        }

        // Wait for all threads to finish
        latch.await();

        // Print the number of unique instances created
        System.out.println("Number of unique SingletonLogger instances: " + instances.size());
        for (SingletonLogger logger : instances) {
            System.out.println(logger);
        }
    }
}

