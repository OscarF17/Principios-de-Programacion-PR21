//Oscar Luciano Flores Leija
//570390
//Objetvio: 
import java.io.*;
import java.util.*;
import java.text.*;
class ArregloVentas{
   public static void main(String args[]){
      Scanner x=new Scanner (System.in);
      DecimalFormat d=new DecimalFormat("0.00");
      double acum=0;
      float a[]=new float[10];
      for(int i=0; i<10; i++){
         System.out.println("Inserte el valor de la venta en el almacen: "+(i+1));
         a[i]=x.nextFloat();
         acum+=a[i];
      }
      double prom=acum/10;
      System.out.println("\t\t Almacen                         Ventas");
      for(int i=0; i<10; i++)
         System.out.println("\t\t"+(i+1)+"\t\t\t$"+d.format(a[i]));
      System.out.println("\t\tMedia de las Ventas=\t\t$"+prom);
      System.out.println("Almacenes cuyas ventas fueron superiores");
      System.out.println("          a la media de las ventas");
      for(int i=0; i<10; i++){
         if(a[i]>prom)
            System.out.println("\t\t"+(i+1)+"\t\t\t$"+d.format(a[i]));
      }
      }
}