/**
 * The <code>Conexion</code> class
 * <p>
 * com.mcalzada.polimorfismo
 * <p>
 * Created on 17/01/2019.
 *
 * @author MarcoCalzada
 */

package com.mcalzada.polimorfismo;

import com.ks.lib.tcp.Cliente;
import com.ks.lib.tcp.EventosTCP;
import com.ks.lib.tcp.Tcp;
import org.apache.logging.log4j.Marker;

public class Conexion implements EventosTCP
{
    private static final Conexion _INSTANCE = new Conexion();
    private Tcp conexion;

    public static Conexion getInstance()
    {
        return _INSTANCE;
    }

    @Override
    public void conexionEstablecida(Cliente cliente)
    {

    }

    @Override
    public void errorConexion(String s)
    {

    }

    @Override
    public void datosRecibidos(String s, byte[] bytes, Tcp tcp)
    {

    }

    @Override
    public void cerrarConexion(Cliente cliente)
    {

    }

    public void enviarBFPROLAP(String msj)
    {
        conexion.enviar(msj);
    }


    public void setConexion(Tcp conexion)
    {
        this.conexion = conexion;
    }
}
