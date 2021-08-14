import java.io.*;
import java.util.*;
class PracticaEncontrarDigitos {
    public static void main(String[] arg){
      Scanner input=new Scanner(System.in);
      System.out.println("Ingrese numero de hasta 4 digitos");
      int numero=input.nextInt();
      int original=numero;
      if(!(numero/1000==0))
         System.out.println("4");
      else if(!(numero/100==0))
         System.out.println("3");
      else if(!(numero/10==0))
         System.out.println("2");
      else if(!(numero/1==0))
         System.out.println("1");
      else
         System.out.println("0");
      }
}

