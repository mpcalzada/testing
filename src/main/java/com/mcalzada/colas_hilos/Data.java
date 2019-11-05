package com.mcalzada.colas_hilos;

/**
 * {@link Data}
 *
 * @author MarcoCalzada
 * @version 1
 * @since MarcoCalzada
 */
public class Data
{
  private String monto;
  private String tarjeta;
  private String auth;

  public Data(String monto, String tarjeta, String auth)
  {
    this.monto = monto;
    this.tarjeta = tarjeta;
    this.auth = auth;
  }

  public String getMonto()
  {
    return monto;
  }

  public String getTarjeta()
  {
    return tarjeta;
  }

  public String getAuth()
  {
    return auth;
  }
}
