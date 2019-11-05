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
        new Thread(new AsyncTask()).start();
        new Thread(new AsyncTask()).start();
        new Thread(new AsyncTask()).start();
    }
}
