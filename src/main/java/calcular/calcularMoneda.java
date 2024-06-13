/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcular;
import java.util.Scanner;

/**
 *
 * @author Gutierrez Medina Anthony Kent  <U18100033@utp.edu.pe>
 */
public class calcularMoneda {
    private double conversionMoneda;
    private double cantidadAConvertir;

    public double getConversionMoneda(){
        return conversionMoneda;

    }
    Scanner entradaDato= new Scanner(System.in);
    public void calcularDolaresAMonedas(double valorMoneda,String abreviatura){
        cantidadAConvertir = ingresoCantidadAContervir();
        conversionMoneda = valorMoneda*cantidadAConvertir;
        System.out.println("El valor de " +cantidadAConvertir+ " [USD],  corresponde a el valor de " + conversionMoneda+ "["+abreviatura+"]");
    }
    public void calcularMonedasADolares(double valorMoneda, String abreviatura){
        double cantidadAConvertir = ingresoCantidadAContervir();

        conversionMoneda = cantidadAConvertir/valorMoneda;
        System.out.println("El valor de " +cantidadAConvertir+ "["+abreviatura+"], corresponde a el valor de " + conversionMoneda +"[USD] \n");
    }

    public double ingresoCantidadAContervir(){
        try {
            System.out.println("Ingrese el valor que desea convertir");
            cantidadAConvertir = Double.valueOf(entradaDato.next());

        }catch (NumberFormatException n){
            System.out.println("Ocurrio un error: " + n.getMessage());
        }catch (Exception e){
            System.out.println("Ocurrio un error : "+e.getMessage());
        }
        return cantidadAConvertir;
    }

}
