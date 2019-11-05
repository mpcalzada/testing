/**
 * The <code>App</code> class
 * <p>
 * com.mcalzada.not_null_validation
 * <p>
 * Created on 19/03/2019.
 *
 * @author MarcoCalzada
 */

package com.mcalzada.not_null_validation;

public class App
{
    public static void main(String[] args)
    {
        System.out.println(AssertTesting.iDontReceiveNull(new Object()));
        System.out.println(AssertTesting.iDontReceiveNull(null));

    }
}
