//Oscar Luciano Flores Leija
//570390
//Objetivo: Programa que convierte metro a centímetros, pies y pulgadas
import java.io.*;
import java.util.*;
class ProblemaConversiones{
   public static void main(String args[]){
   Scanner x=new Scanner(System.in);
   System.out.println("Ingrese cantidad de metros");
   float metros=x.nextFloat();
   float centimetros=metros*100f; //Un metro equivale a 100 cm
   float pies=metros*3.281f; //Un metro equivale a 3.281 ft
   float pulgadas=metros*39.37f; //Un metro equivale a 39.37 in
   System.out.println("La cantidad convertida a centimetros es de: "+centimetros);
   System.out.println("La cantidad convertida a pies es de: "+pies);
   System.out.println("La cantidad convertida a pulgadas es de: "+pulgadas);
   }
}
 