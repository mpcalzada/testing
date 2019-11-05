package com.mcalzada.server;

import com.ks.lib.tcp.Cliente;
import com.ks.lib.tcp.EventosTCP;
import com.ks.lib.tcp.Servidor;
import com.ks.lib.tcp.Tcp;

/**
 * {@link Server}
 *
 * @author MarcoCalzada
 * @version 1
 * @since MarcoCalzada
 */
public class Server extends Servidor implements EventosTCP
{
    public Server(String host, int port)
    {
        this.setIP(host);
        this.setPuerto(port);
        this.setEventos(this);
    }

    @Override
    public void conexionEstablecida(Cliente cliente)
    {
        System.out.println("Conexion establecidad: " + cliente);
    }

    @Override
    public void errorConexion(String s)
    {

    }

    @Override
    public void datosRecibidos(String s, byte[] bytes, Tcp tcp)
    {
        System.out.println(s);
    }

    @Override
    public void cerrarConexion(Cliente cliente)
    {

    }
}
