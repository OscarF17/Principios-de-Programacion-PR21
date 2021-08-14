//Oscar Flores 570390
//Objetivo: Programa que calcula el seno o coseno de un número
import java.io.*;
import java.util.*;
class Funcion{
   public static void main(String args[]){
      Scanner input=new Scanner(System.in);
      char opcion=' ';
      do{
         System.out.println("Ingrese c si evaluara un coseno y s si evaluara un seno");
         opcion=input.next().charAt(0);
      }while(!(opcion=='c' || opcion=='s' || opcion=='C' || opcion=='S'));
   }
}