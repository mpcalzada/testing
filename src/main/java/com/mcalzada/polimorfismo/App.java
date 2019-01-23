/**
 * The <code>App</code> class
 * <p>
 * com.mcalzada.polimorfismo
 * <p>
 * Created on 17/01/2019.
 *
 * @author MarcoCalzada
 */

package com.mcalzada.polimorfismo;

import com.ks.lib.tcp.Cliente;
import com.ks.lib.tcp.Servidor;
import com.ks.lib.tcp.Tcp;

public class App
{
    public static void main(String[] args) throws Exception
    {
        boolean isCliente = true;

        Tcp tcp;

        if (isCliente)
        {
            tcp = new Cliente();
            tcp.setIP("localhost");
        }
        else
        {
            tcp = new Servidor();
        }
        tcp.setPuerto(8080);
        tcp.conectar();
        tcp.setEventos(Conexion.getInstance());

        Conexion.getInstance().setConexion(tcp);
    }
}
