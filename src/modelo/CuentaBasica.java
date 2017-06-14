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
    private int numero_de_cuenta; 
    private String cliente = null;
    private double saldo;
    private double cantidad;
    private double retiro;
    
    public void CuentaBasica (int numero_de_cuenta, String cliente, int saldo){
        this.numero_de_cuenta = numero_de_cuenta;
        this.cliente = cliente;
        this.saldo =    saldo;
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
    
    public double retirar (double retirar)
    {
        
        this.retiro=retirar;
        saldo=saldo-retiro;
            
         return saldo;
    }

    
}
