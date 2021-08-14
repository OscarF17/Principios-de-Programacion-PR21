import java.io.*;
import java.util.*;
class Estudiante {
    public static void main(String[] arg){   
      Scanner input=new Scanner(System.in);
      byte contador=0;
      int acumulador=0,cali;    
      do {
         contador++;
         System.out.println("Ingrese la calificacion "+contador);
         cali=input.nextInt();
         acumulador+=cali;
      } while (contador<5);
      float promedio=acumulador/5;
      System.out.println("Su promedio es de: "+promedio);
      }
}
