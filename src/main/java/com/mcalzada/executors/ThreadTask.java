/**
 * The <code>ThreadTask</code> class
 * <p>
 * com.mcalzada.executors
 * <p>
 * Created on 11/01/2019.
 *
 * @author MarcoCalzada
 */

package com.mcalzada.executors;

public class ThreadTask implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("Running the thread");
    }
}
