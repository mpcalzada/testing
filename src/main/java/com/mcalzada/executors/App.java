/**
 * The <code>App</code> class
 * <p>
 * com.mcalzada.executors
 * <p>
 * Created on 11/01/2019.
 *
 * @author MarcoCalzada
 */

package com.mcalzada.executors;

import java.util.concurrent.*;

public class App
{
    public static void main(String[] args) throws InterruptedException
    {
        ExecutorService executors = Executors.newSingleThreadExecutor();

        FutureTask futureT = (FutureTask) executors.submit(new ThreadTask());
        Future<Boolean> callableFuture = executors.submit(new CallableTask());

        Thread.sleep(1000);

        futureT.run();

        System.out.println(executors.isTerminated());

        System.out.println(executors.isShutdown());

        executors.shutdown();

        System.out.println(executors.isShutdown());
    }
}
