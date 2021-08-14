//Oscar Luciano Flores Leija
//570390
//Objetivo: Calcular el promedio de 3 calificaciones de un alumno y asignarle una letra de la A a la F dependiendo del valor.
import java.io.*;
import java.util.*;
class Alumno{
   public static void main(String args[]){
      Scanner input=new Scanner(System.in);
      byte cali1, cali2, cali3;
      float promedio;
      char letra;
      System.out.println("Ingrese la calificacion 1: ");
      cali1=input.nextByte();
      System.out.println("Ingrese la calificacion 2: ");
      cali2=input.nextByte();   
      System.out.println("Ingrese la calificacion 3: ");
      cali3=input.nextByte();
      promedio=(cali1+cali2+cali3)/3;
      if (promedio<60)
         letra='F';
      else if (promedio<70)
         letra='D';
      else if (promedio<80)
         letra='C';
      else if (promedio<90)
         letra='B';
      else
         letra='A';
      System.out.println("Su calificacion final es: "+letra);   
   }
}