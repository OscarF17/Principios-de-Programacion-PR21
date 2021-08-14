//Oscar Luciano Flores Leija 570390
//Objetivo: Programa que calcula el factorial de un numero
import java.io.*;
import java.util.*;
class Proc_Fact
   {
   public static void main(String arg[])
      {
      Scanner x=new Scanner(System.in);
      System.out.println("Ingrese cantidad de numeros para conseguir su factorial");
      int n=x.nextInt();
      int total=0;
      for(int j=0; j<n;j++){
         System.out.println("Ingrese numero");
         int num=x.nextInt();
         int acum=1;
         for(int i=num; i>1; i--)
            acum*=i;
         System.out.println("El factorial de "+num+" es: "+acum);   
         total+=acum;
         }
      System.out.println("La suma de todos los factoriales es: "+total);
      }
   }