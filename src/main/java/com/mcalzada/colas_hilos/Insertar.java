package com.mcalzada.colas_hilos;

import java.util.LinkedList;
import java.util.Queue;

/**
 * {@link Insertar}
 *
 * @author MarcoCalzada
 * @version 1
 * @since MarcoCalzada
 */
public class Insertar
{

  private static Thread thread = new Thread();
  private static Queue<Data> QUEUE_DATA = new LinkedList<>();

  public void addData(Data data)
  {
    QUEUE_DATA.add(data);

    if (!thread.isAlive())
    {
      thread = new Thread(this::asyncProcessing);
      thread.setName("InsertAsincrono");
      thread.start();
    }
  }

  private void asyncProcessing()
  {
    while (!QUEUE_DATA.isEmpty())
    {
      Data data = QUEUE_DATA.poll();

      String query = "UPDATE WHERE " + data.getAuth() + "AND..";

      // ...
    }
  }
}
