/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Jose Maldonado
 */
public class CuentaBasica {
    private int numeroDeCuenta; 
    private String cliente=null;
    double saldo;
    private double cantidad;
    private double retiro;
    
    
    public CuentaBasica(int numeroDeCuentas, String cliente, int saldo) {
        this.numeroDeCuenta = 1;
        this.cliente = "Gustavo";
        this.saldo = saldo=0;
    }
    
    public double getSaldo()
    {
        return this.saldo;
    }  
    
    public double depositar(double deposito)
    {
        this.cantidad=deposito;
        saldo= saldo + cantidad;
        return saldo;
    }
    
    public boolean retirar (double retirar)
    {
        boolean xSaldo=true;
        this.retiro=retirar;
        if(retiro<=saldo)
        {
            saldo=saldo-retiro;
            xSaldo=true;
        }
        else
        {
            if (retiro>saldo)
            {
                xSaldo=false;
            }
 
        }
        return xSaldo;

    }
    
}