//Oscar Luciano Flores Leija
//570390
//Objetivo: Programa que determina el costo final de una compra dependinedo de si se hace el pago de contado o a credito.
import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
class PagoCredito{
    public static void main(String args[]){
        byte meses;
        float costoFinal, pagoMensual;
        Scanner input=new Scanner(System.in);
        System.out.println("Ingrese costo de su compra: ");
        float costo=input.nextFloat();
        System.out.println("Ingrese el numero del metodo de pago que desea: "+"\n"+"1 para pago de contado"+"\n"+"2 para pago a 3 meses"+"\n"+"3 para pago a 6 meses"+"\n"+"4 para pago a 12 meses");
        char metodo=input.next().charAt(0);
        switch (metodo){
            case '1':
                System.out.println("El costo final de su compra es de: $"+costo);
                break;
            case '2':
                costoFinal=costo*1.10f;//Se cobra intere©s por hacer pagos a cr√©dito
                pagoMensual=costoFinal/3;
                meses=3;
                System.out.println("El costo final de su compra es de $"+costoFinal+" con pagos mensuales de $"+pagoMensual+" cada "+meses+" meses");
                break;
            case '3':
                costoFinal=costo*1.20f;
                pagoMensual=costoFinal/6;
                meses=6;
                System.out.println("El costo final de su compra es de $"+costoFinal+" con pagos mensuales de $"+pagoMensual+" cada "+meses+" meses");
                break;
            case '4':
                costoFinal=costo*1.30f;
                pagoMensual=costoFinal/12;
                meses=12;
                System.out.println("El costo final de su compra es de $"+costoFinal+" con pagos mensuales de $"+pagoMensual+" cada "+meses+" meses");
                break;
            default:
                System.out.println("Ingreso un numero no valido, ingrese numero del 1 al 4");
        }
    }
}