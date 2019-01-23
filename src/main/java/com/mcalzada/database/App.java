/**
 * The <code>App</code> class
 * <p>
 * com.mcalzada.database
 * <p>
 * Created on 23/01/2019.
 *
 * @author MarcoCalzada
 */

package com.mcalzada.database;

import java.sql.SQLException;

public class App
{
    public static void main(String[] args) throws InterruptedException
    {
        Database.initialize();

        long inicio = System.currentTimeMillis();


        System.out.println("Iniciando");

        for (int i = 0; i <= 10000; i++)
        {
            new Thread(() -> new Database().selectQuery()).start();
        }


        long fin = System.currentTimeMillis();


        System.out.println(fin - inicio);

        Thread.sleep(10000);
        while (true)
        {
            Thread.sleep(100);

        }

    }
}
