//Oscar Luciano Flores Leija
//570390
//Objetivo: Programa que calcula el costso de un producto aplicando descuento cuando aplique
import java.io.*;
import java.util.*;
class Practica {
    public static void main(String[] arg){
        Scanner input=new Scanner(System.in);
        DecimalFormat df= new DecimalFormat("0.00");
        byte producto;
        short unidades;
        float costo, precioUnitario=0.0f, costoFinal, descuento=0.0f;
        System.out.println("Ingrese numero del producto");
        producto=input.nextByte();
        switch (producto){
            case 10:
               precioUnitario=24.3f;
               break;
            case 20:
               precioUnitario=105.0f;
               break;
            case 30:
               precioUnitario=10.35f;
               break;
            case 40:
               precioUnitario=200.0f;
               break;
            default:
                System.out.println("Ingrese un numero de producto valido") ;
        }
        System.out.println("Ingrese cantidad de unidades del producto");
        unidades=input.nextShort();
        costo=unidades*precioUnitario;
        if (costo>=1000)
            descuento=0.02f;
        else if (costo>=800)
            descuento=0.01f;
        costoFinal=costo-(costo*descuento);
        System.out.println("El costo final del pedido es de: $"+df.format(costoFinal));
}
}
