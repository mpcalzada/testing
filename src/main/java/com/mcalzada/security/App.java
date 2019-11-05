/**
 * The <code>App</code> class
 * <p>
 * com.mcalzada.security
 * <p>
 * Created on 29/03/2019.
 *
 * @author MarcoCalzada
 */

package com.mcalzada.security;

public class App
{
    public static void main(String[] args)
    {
        System.out.println(Encrypt.decrypt("1xLGrxfoQqfK1dtcptFv/A=="));
        System.out.println(Encrypt.encrypt("prueba123"));
    }
}
