/**
 * The <code>Prepaid</code> class
 * <p>
 * com.mcalzada.abstracto
 * <p>
 * Created on 20/02/2019.
 *
 * @author MarcoCalzada
 */

package com.mcalzada.abstracto;

public class Prepaid extends Transaction
{
    @Override
    public String process()
    {
        return "1234";
    }
}
