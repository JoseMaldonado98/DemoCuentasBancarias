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
public class CuentaDeCheques extends CuentaBasica {
    private int chequesExtra;
    public int chequesRebotados;
    public int chequesRebotados2;
    public int chequesEmitidos;
    public double comisionChequesE;
    public double comisionChequesR;
    public double saldo2;
    
    public CuentaDeCheques (int numerodecuenta, String cliente, int saldo)
    {
        super(numerodecuenta,cliente,saldo);   
    }

   public  boolean retirar (double cantidad){    
       boolean SeRealizoRetiro = super. retirar (cantidad);

if (SeRealizoRetiro){
    this.chequesEmitidos++;
 
   }else{
       this. chequesRebotados++;
}
   return SeRealizoRetiro;  
}
   
public double chequesEmitidos (int chequesEmitidos){
        if (chequesEmitidos>5){
            chequesExtra= chequesEmitidos -5;
            comisionChequesE= 10 * chequesExtra;
        }
        else
        {
            comisionChequesE=0;
        }   
     
        return comisionChequesE;
    }
    
    public double ChequesRebotados (int chequesRebotados){
        chequesRebotados2=chequesRebotados;
        comisionChequesR= chequesRebotados2*200;
        return comisionChequesR;
    }
    
    public double CorteMensual ()
    {
       saldo2=saldo;
       saldo = saldo-(comisionChequesE+comisionChequesR);
       return saldo;
    }
    
}
