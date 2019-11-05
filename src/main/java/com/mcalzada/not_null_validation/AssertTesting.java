/**
 * The <code>AssertTesting</code> class
 * <p>
 * com.mcalzada
 * <p>
 * Created on 19/03/2019.
 *
 * @author MarcoCalzada
 */

package com.mcalzada.not_null_validation;


import org.springframework.util.Assert;

public class AssertTesting
{
    public static boolean iDontReceiveNull(Object notNullObject)
    {
        Assert.notNull(notNullObject, "May not be null");
        return true;
    }
}
