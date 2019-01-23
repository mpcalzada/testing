/**
 * The <code>App</code> class
 * <p>
 * com.mcalzada.herencia
 * <p>
 * Created on 11/01/2019.
 *
 * @author MarcoCalzada
 */

package com.mcalzada.herencia;

public class App
{
    public static void main(String[] args)
    {
        Aves aves = new Avestruz();
        aves.cantar();
        aves.volar();

        aves = new Aguila();

        aves.volar();
        aves.cantar();
    }
}
