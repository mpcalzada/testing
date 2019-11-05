/**
 * The <code>Encrypt</code> class
 * <p>
 * com.mcalzada.security
 * <p>
 * Created on 29/03/2019.
 *
 * @author MarcoCalzada
 */

package com.mcalzada.security;


import com.ks.lib.seguridad.Aes_128;

public class Encrypt
{
    public static String encrypt(String value)
    {
        return Aes_128.encriptar(value);
    }

    public static String decrypt(String value)
    {
        return Aes_128.desencriptar(value);
    }
}
