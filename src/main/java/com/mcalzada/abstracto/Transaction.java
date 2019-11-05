/**
 * The <code>Transaction</code> class
 * <p>
 * com.mcalzada.abstracto
 * <p>
 * Created on 20/02/2019.
 *
 * @author MarcoCalzada
 */

package com.mcalzada.abstracto;

public abstract class Transaction
{
    public void transact(Object transactionRequest)
    {
        try
        {
            process();
            //Armar respuesta exitosa
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public abstract String process() throws Exception;
}
