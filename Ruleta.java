import java.io.*;
import java.util.*;
class Ruleta {
    public static void main(String[] arg){
      Scanner input=new Scanner(System.in);
      byte impares=0, pares=0, docena=0, mayor=0;
      for(int i=1; i<=10; i++){
         System.out.println("Ingrese un numero entre 0 y 36");
         byte numero=input.nextByte();
         if(numero%2==0 && !(numero==0))
            pares++;
         else
            impares++;
         if(numero>=13 && numero<=24)
            docena++;
         if(numero>mayor)
            mayor=numero;
         }
      System.out.println("Cantidad de numeros pares: "+pares);
      System.out.println("Cantidad de numeros impares: "+impares);
      System.out.println("Cantidad de numeros en la segunda docena: "+docena);
      System.out.println("Mayor numero ingresado: "+mayor);
      }
}