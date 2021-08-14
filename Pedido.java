//Oscar Luciano Flores Leija
//570390
//Objetivo: Programa que calcula el costo toal de ordenes en una pizzeria
import java.io.*;
import java.util.*;
class Pedido{
   public static void main(String args[]){
    int costoTotal;  
    final byte FLETE=10; 
    Scanner x=new Scanner(System.in);
    System.out.println("Ingrese numero de pizzas que va a comprar");
    byte pizzas=x.nextByte();
    int costoPizzas=pizzas*130;
    System.out.println("Ingrese numero de ingredientes adicionales");
    byte ingredientes=x.nextByte();
    int costoIngredientes=ingredientes*12;
    System.out.println("Ingrese numero de refrescos que va a comprar");
    byte refrescos=x.nextByte();
    int costoRefrescos=refrescos*10;
    System.out.println("Ingrese numero de litros de nieve que va a comprar");
    byte nieve=x.nextByte();
    int costoNieve=nieve*25;
    costoTotal=costoPizzas+costoIngredientes+costoRefrescos+costoNieve+FLETE;
    System.out.println("El costo total del pedido es de: "+costoTotal);
    }
}