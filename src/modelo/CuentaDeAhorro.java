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
public class CuentaDeAhorro extends CuentaBasica {
     double tasaInteres= 0.3287;
        public double Interes;
        public double comision;
        double comisionporsaldo=50;
        double cantidad;
        double retiro;
        public double Interes2;
        public double comision2;
        public double saldo2;
        private double saldo;
        private double tasaDeInteres;
        private double comisionPorSaldo;

    public CuentaDeAhorro(int numeroDeCuenta, String cliente,int saldo) {
        super( numeroDeCuenta, cliente,saldo);
    }
    public double calcularcomisionporsaldo(double periodo)
        {
            if(saldo<1000)
            {
                comision = comisionporsaldo*periodo;
            }
            else
            {
                if(saldo>=1000)
                {
                    comision=0;
                }
            }
            return comision;
        }
        
        public double cortemensual ()
        {
            saldo2=saldo;
            Interes2=(tasaInteres*saldo)/100;
            
            if(saldo<1000)
            {
                comision2 = comisionporsaldo;
            }
            else
            {
                if(saldo>=1000)
                {
                    comision2=0;
                }
            }
            
            saldo=saldo+Interes2;
            saldo=saldo-comision2;
            
            return saldo;
        }

    public void calcularInteres(int periodo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


    