/**
 * The <code>Database</code> class
 * <p>
 * com.mcalzada.database
 * <p>
 * Created on 23/01/2019.
 *
 * @author MarcoCalzada
 */

package com.mcalzada.database;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database
{
    private static Integer cont = 0;
    private static BasicDataSource connectionPool;
    private static boolean isInitialized;
    private static String pass;
    private static String user;
    private static String base;
    private static String server;

    static
    {
        user = "usr";
        pass = "pass";
        base = "db";
        server = "0.0.0.0";
        isInitialized = false;

    }

    public static void initialize()
    {
        connectionPool = new BasicDataSource();
        connectionPool.setUsername(user);
        connectionPool.setPassword(pass);
        connectionPool.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        connectionPool.setUrl("jdbc:sqlserver://" + server + ";databaseName=" + base + ";user=" + user + ";password=" + pass);
        connectionPool.setInitialSize(10);
        connectionPool.setMaxTotal(30);
        connectionPool.setMaxIdle(20);
        connectionPool.setMinIdle(5);
        connectionPool.setMaxWaitMillis(28000);
    }

    public void selectQuery()
    {
        try (Connection connection = connectionPool.getConnection())
        {
            synchronized (cont)
            {
                cont++;
            }
            System.out.println("Inicio " + connection.hashCode() + "\t - " + cont);

            Statement stmt = connection.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM routers");

            Thread.sleep(1000);

            System.out.println("Fin" + connection.hashCode());
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
