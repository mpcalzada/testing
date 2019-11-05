package com.mcalzada.server;

/**
 * {@link App}
 *
 * @author MarcoCalzada
 * @version 1
 * @since MarcoCalzada
 */
public class App
{
    public static void main(String[] args) throws InterruptedException
    {
        new Server("localhost", 5600).conectar();

        while (true)
        {
            Thread.sleep(500);
        }
    }
}
