/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democuentasbancarias;

import java.util.Scanner;
import modelo.CuentaBasica;
import modelo.CuentaDeAhorro;

/**
 *
 * @author Jose Maldonado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner entrada = new Scanner (System.in);
        
        CuentaBasica micuenta = new CuentaBasica();
                
        int menu;
        int menu2;
        
        do
        {       
        System.out.println("Selecciona una opcion");
        System.out.println("1.- Consulta de Saldo");
        System.out.println("2.- Deposito");
        System.out.println("3.- Retirar");
        System.out.println("4.- Cuenta de Ahorro");
        System.out.println("5.- Salir");

        menu=entrada.nextInt();
        
        if (menu == 1)
        {
         System.out.println("El saldo de la cuenta es de: " + micuenta.getSaldo());
        }
        else
        {
            if(menu == 2)
            {
                double deposito;
                System.out.print("Ingresa la cantidad a Depositar: $");
                deposito=entrada.nextDouble();
                micuenta.depositar(deposito);
            }
            else
            {
                if (menu == 3)
                {
                    double retirar;
                    System.out.println("Ingresa la cantidad a Retirar: $");
                    retirar=entrada.nextDouble();
                    micuenta.retirar(retirar);
                }
                
            }
        }    
        if(menu==4)
             
        {
         CuentaDeAhorro micuenta2 = new CuentaDeAhorro();   
            
        do
        {

            System.out.println("Selecciona una opcion");
            System.out.println("1.- Consulta de Saldo");
            System.out.println("2.- Deposito");
            System.out.println("3.- Retirar");
            System.out.println("4.- Calcular Interes");
            System.out.println("5.- Comision por saldo");
            System.out.println("6.- Ver Corte Mensual");
            System.out.println("7.- Salir");
            menu2=entrada.nextInt();
            
            if (menu2 == 1)
                {
             System.out.println("El saldo de la cuenta es de: " + micuenta2.getSaldo());
                }
               else
                {
               if(menu2 == 2)
                    {
                double deposito;
                System.out.print("Ingresa la cantidad a Depositar: $");
                deposito=entrada.nextDouble();
                micuenta2.depositar(deposito);
                    }
                 else
                    {
                 if (menu2 == 3)
                    {
                 double retirar;
                 System.out.println("Ingresa la cantidad a Retirar: $");
                 retirar=entrada.nextDouble();
                 micuenta2.retirar(retirar);
                     }
                   else
                     {
                   if(menu2==4)
                     {
                   int periodo;
                  System.out.println("Ingresa el numero de Periodos a calcular (1 Periodo = 30 Dias)");
                  periodo=entrada.nextInt();
                       double calcularInteres = micuenta2.calcularInteres(periodo);
                  System.out.println("El interes es: $" + micuenta2.Interes);
                            }
                     else
                            {
                     if(menu2==5)
                                {
                     int periodo;
                       System.out.println("Ingresa el numero de Periodos a calcular (1 Periodo = 30 Dias)");
                       periodo=entrada.nextInt();
                       micuenta2.calcularcomisionporsaldo(periodo);
                       System.out.println("La comision por saldo es: $" + micuenta2.comision);
                                }
                        else
                                {
                        if(menu2==6)
                                    {
                       System.out.println("Este es el corte de los ultimos 30 dias");
                       micuenta2.cortemensual();
                       System.out.println("Saldo Actual: $" + micuenta2.saldo2);
                       System.out.println("Interes Generado: $" + micuenta2.Interes2);
                       System.out.println("Comision por saldo: $" + micuenta2.comision2);
                       System.out.println("Nuevo Saldo: $" + micuenta2.getSaldo());
                                    }
                                }
                            }
                        }

                    }
                }  
            
         }while (menu2 != 7); 
        }
        
        }while (menu != 5);
      
    }

     
    }

        
        
             
        

