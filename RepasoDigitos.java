import java.io.*;
import java.util.*;
class RepasoDigitos{
   public static void main(String args[]){
      Scanner input=new Scanner(System.in);
      System.out.println("Ingrese numero de hasta 4 digitos");
      int numero=input.nextInt();
      int digito4=numero/1000;
      numero-=digito4*1000;
      int digito3=(numero)/100;
      numero-=digito3*10;
      int digito2=numero/10;
      numero-=digito2*10;
      int digito1=numero/1;
      System.out.println("Digito 1: "+digito4);
      System.out.println("Digito 2: "+digito3);
      System.out.println("Digito 3: "+digito2);
      System.out.println("Digito 4: "+digito1);
   }
}