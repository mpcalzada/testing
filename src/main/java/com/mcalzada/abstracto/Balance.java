/**
 * The <code>Balance</code> class
 * <p>
 * com.mcalzada.abstracto
 * <p>
 * Created on 20/02/2019.
 *
 * @author MarcoCalzada
 */

package com.mcalzada.abstracto;

public class Balance extends Transaction
{
    @Override
    public String process() throws Exception
    {
        //CONSULTA A BD
        return new String("");
    }
}
