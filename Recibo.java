import java.io.*;

import java.util.*;


class Recibo{


public static void main (String arg []) {


 Scanner s = new Scanner(System.in);


 System.out.println("Ingresa el monto de la compra");

   double compra = s.nextDouble();


   while(compra>0){


   if (compra>100)

   {


   System.out.println("Ingresa el método de pago (1 para contado, 2 para tarjeta)");

   byte metodo = s.nextByte();


      if (metodo==1)

      compra*=.95;


      else

      compra*=.98;


   }


   System.out.println("El costo total de su compra es: "+compra);


   System.out.println("Ingresa el monto de la compra");

   compra = s.nextDouble();

   }

   }

   }