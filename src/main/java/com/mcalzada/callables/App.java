package com.mcalzada.callables;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Hello world!
 */
public class App
{

    public static void main(String[] args) throws InterruptedException
    {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        List<Future<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 10; i++)
        {
            System.out.println("Creating ::" + i);
            Future<Integer> future = executor.submit(new Task());
            list.add(future);
        }

        Thread.sleep(1000);

        System.out.println("Finished creating");

        for (Future<Integer> fut : list)
        {
            try
            {
                while (!fut.isDone())
                {
                    System.out.println("Waiting ");
                }
                System.out.println("Getting ::" + fut.get());
            }
            catch (InterruptedException | ExecutionException e)
            {
                e.printStackTrace();
            }
        }

        executor.shutdown();
    }
}
