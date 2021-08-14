//Oscar Luciano Flores Leija
//570390
//Objetivo: Programa que calcula el costo de un coche aplicando descuento dependiendo de la marca.
import java.io.*;
import java.util.*;
import java.text.*;
class VentaCoche{
      public static void main(String args[]){
      float costoFinal, descuento=0; //Descuento inicializado en 0 para que el programa funcione si se ingresa otra marca.
      DecimalFormat format = new DecimalFormat("0.00");
      Scanner input=new Scanner(System.in);
      System.out.println("Ingrese nombre del comprador"); //Originalmente nombre y apellido eran 1 variable pero al ingresar 2 nombres separados por espacio el programa se saltaba el siguiente input.
      String nombre=input.next();
      System.out.println("Ingrese apellido del comprador");
      String apellido=input.next();      
      System.out.println("Ingrese marca del coche");
      String marca=input.next();
      System.out.println("Ingrese costo del coche");
      float costo=input.nextFloat();
      if(marca.equals("Mercedes"))
         descuento=costo*0.05f;
      else if(marca.equals("Toyota"))
         descuento=costo*0.10f;
      else if(marca.equals("Chrysler"))
         descuento=costo*0.08f;   
      costoFinal=costo-descuento;
      System.out.println("Comprador: "+nombre+" "+apellido+"\t Marca: "+marca+"\t Venta: "+format.format(costo)+"\t Descuento: "+format.format(descuento)+"\t Total pagar:$"+format.format(costoFinal));
   }
}