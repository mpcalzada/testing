/**
 * The <code>Avestruz</code> class
 * <p>
 * com.mcalzada
 * <p>
 * Created on 21/11/2018.
 *
 * @author MarcoCalzada
 */

package com.mcalzada.herencia;

public class Avestruz extends Aves
{
    public void volar()
    {
        System.out.println("No se volar.");
    }

    @Override
    void cantar()
    {
        System.out.println("No se cantar");
    }
}
