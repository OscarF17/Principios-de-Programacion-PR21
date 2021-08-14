import java.io.*;
import java.util.*;
class NumMayor10 {
    public static void main(String[] arg){
      Scanner input=new Scanner(System.in);
      int mayor=0;
      int numero;
      for(int i=1; i<=10; i++)
         {
         System.out.println("Ingrese numero "+i);
         numero=input.nextInt();
         if(numero>mayor)
            mayor=numero;
         }
       System.out.println("El numero mayor de los 10 ingresados es: "+mayor);
       }
}
         
         