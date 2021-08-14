//Oscar Luciano Flores Leija
//570390
//Objetivo: Programa que utiliza estructura condicional para calcular costo de gasolina.
import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
class PagoGasolina
{
    public static void main(String args[])
    {
        DecimalFormat df=new DecimalFormat("0.00");
        float precioGasolina, precioTotal;
        Scanner x=new Scanner(System.in);
        System.out.println("Ingrese litros de gasolina a comprar: ");
        float litros=x.nextFloat();
        System.out.println("Ingrese tipo de gasolina: "+"\n"+"1 si es verde"+"\n"+"2 si es roja");
        char tipo=x.next().charAt(0);
        if (tipo=='1'){
            precioGasolina=litros*20.12f;
        }else{
            precioGasolina=litros*21.48f;
        }
        System.out.println("El costo total de su compra es de: $"+df.format(precioGasolina));
    }
}
    