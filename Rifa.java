//Oscar Luciano Flores Leija 570390
//Objetivo: Programa que calcula el total de vender boletos pares, impares y total considerano que son 999 boletos y que cada boleto cuesta su respectivo numero.
import java.io.*;
class Rifa{
   public static void main(String args[]){
      int acum=0;     
      int acum2=0;
      for(int i=2; i<=998; i+=2)
           acum+=i;
      for(int j=1; j<=999; j+=2)
           acum2+=j;
   System.out.println(" El total de los boletos pares seria: "+acum+"\n El total de los boletos impares seria: "+acum2+"\n El total de todos los boletos es: "+(acum+acum2));
  }
}
