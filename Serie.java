//Oscar Flores 570390
//Objetivo: Sumtaria de una serie
import java.io.*;
import java.util.*;
class Serie{
   public static void main(String args[]){
      Scanner input=new Scanner(System.in);
      int a=0, limite=0;
      double an=0;
      int acum=0;
      do{
         System.out.println("Ingrese a, este debe de ser un valor mayor o igual a 0");
         a=input.nextInt();
      }while(a<0);
      do{
         System.out.println("Ingrese limite");
         limite=input.nextInt();
      }while(limite<1);
      for(int i=1; i<=limite; i++){
         an=Math.pow(-1,i)*a;
         acum+=an;
      }
      System.out.println("El valor final de a es: "+acum);
      
   }
}