/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package principal.conversordemonedas;
import calcular.buscarMoneda;
import calcular.calcularMoneda;
import modelo.Moneda;
import java.util.Scanner;

/**
 *
 * @author Gutierrez Medina Anthony Kent  <U18100033@utp.edu.pe> 
 */
public class ConversorDeMonedas {

    public static void main(String[] args) {
        Scanner entradaDato = new Scanner(System.in);
        while(true){
            mostrarMensajes();

            try {

                int opcion=Integer.valueOf(entradaDato.next());
                if(opcion == 13){
                    break;
                }
                String abreviaturaMoneda;
                buscarMoneda buscarmoneda = new buscarMoneda();
                calcularMoneda calcularmoneda = new calcularMoneda();
                Moneda monedaBuscada;
                switch (opcion) {

                    case 1:
                        abreviaturaMoneda="PEN";
                        monedaBuscada = buscarmoneda.buscar(abreviaturaMoneda);
                        calcularmoneda.calcularDolaresAMonedas(monedaBuscada.getValor(),abreviaturaMoneda);
                        break;
                    case 2:
                        abreviaturaMoneda="PEN";
                        monedaBuscada = buscarmoneda.buscar(abreviaturaMoneda);
                        calcularmoneda.calcularMonedasADolares(monedaBuscada.getValor(),abreviaturaMoneda);
                        break;
                    case 3:
                        abreviaturaMoneda="ARS";
                        monedaBuscada = buscarmoneda.buscar(abreviaturaMoneda);
                        calcularmoneda.calcularDolaresAMonedas(monedaBuscada.getValor(),abreviaturaMoneda);
                        break;
                    case 4:
                        abreviaturaMoneda="ARS";
                        monedaBuscada = buscarmoneda.buscar(abreviaturaMoneda);
                        calcularmoneda.calcularMonedasADolares(monedaBuscada.getValor(),abreviaturaMoneda);
                        break;
                    case 5:
                        abreviaturaMoneda="BRL";
                        monedaBuscada = buscarmoneda.buscar(abreviaturaMoneda);
                        calcularmoneda.calcularDolaresAMonedas(monedaBuscada.getValor(),abreviaturaMoneda);
                        break;
                    case 6:
                        abreviaturaMoneda="BRL";
                        monedaBuscada = buscarmoneda.buscar(abreviaturaMoneda);
                        calcularmoneda.calcularMonedasADolares(monedaBuscada.getValor(),abreviaturaMoneda);
                        break;
                    case 7:
                        abreviaturaMoneda="COP";
                        monedaBuscada = buscarmoneda.buscar(abreviaturaMoneda);
                        calcularmoneda.calcularDolaresAMonedas(monedaBuscada.getValor(),abreviaturaMoneda);
                        break;
                    case 8:
                        abreviaturaMoneda="COP";
                        monedaBuscada = buscarmoneda.buscar(abreviaturaMoneda);
                        calcularmoneda.calcularMonedasADolares(monedaBuscada.getValor(),abreviaturaMoneda);
                        break;
                    case 9:
                        abreviaturaMoneda="MXN";
                        monedaBuscada = buscarmoneda.buscar(abreviaturaMoneda);
                        calcularmoneda.calcularDolaresAMonedas(monedaBuscada.getValor(),abreviaturaMoneda);
                        break;
                    case 10:
                        abreviaturaMoneda="MXN";
                        monedaBuscada = buscarmoneda.buscar(abreviaturaMoneda);
                        calcularmoneda.calcularMonedasADolares(monedaBuscada.getValor(),abreviaturaMoneda);
                        break;
                    case 11:
                        abreviaturaMoneda="CRC";
                        monedaBuscada = buscarmoneda.buscar(abreviaturaMoneda);
                        calcularmoneda.calcularDolaresAMonedas(monedaBuscada.getValor(),abreviaturaMoneda);
                        break;
                    case 12:
                        abreviaturaMoneda="CRC";
                        monedaBuscada = buscarmoneda.buscar(abreviaturaMoneda);
                        calcularmoneda.calcularMonedasADolares(monedaBuscada.getValor(),abreviaturaMoneda);
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida");
                        break;
                }

            }catch (Exception e){
                System.out.println(e.getMessage());
            }

            System.out.println("*******************************************************************\n");

        }

    }

   public static void mostrarMensajes(){
        System.out.println("********Eliga  ua Opcion de moneda a convertir*******");
        System.out.println(""" 
                               1). Dolar ===> moneda peruana
                               2). moneda peruana ====> dolar
                               3). Dolar ===> peso argentino
                               4). Peso argentino ====> dolar1
                               5). Dolar ===> real brasileño
                               6). real brasileño ====> dolar
                               7). Dolar ===> peso colombiano
                               8). peso colombiano ====> dolar
                               9). Dolar ===> peso mexicano
                               10).peso mexicano ====> dolar
                               11).Dolar ===> Colón costarricense
                               12).Colón costarricense ====> dolar
                               13).salir 
                               """);
        System.out.println("******************************************************");



    }
}
