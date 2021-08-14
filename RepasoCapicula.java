import java.io.*;
import java.util.*;
class RepasoCapicula{
   public static void main(String args[]){
      Scanner input=new Scanner(System.in);
      System.out.println("Ingrese numero de 5 digitos");
      int numero=input.nextInt();
      int original=numero;
      int d1,d2,d3,d4,d5;
      d1=numero/10000;
      numero-=d1*10000;
      d2=numero/1000;
      numero-=d2*1000;
      d3=numero/100;
      numero-=d3*100;
      d4=numero/10;
      numero-=d4*10;
      d5=numero/1;
      int invertido=d5*10000+d4*1000+d3*100+d2*10+d1*1;
      System.out.println(invertido);
      if (original==invertido)
         System.out.println("Es capicula");
      else
         System.out.println("No es capicula");
      }
}