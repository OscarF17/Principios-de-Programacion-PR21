import java.io.*;
import java.util.*;
class Cartel{
   public static void main(String args[]){
      Scanner input=new Scanner(System.in);
      long n=Math.round(Math.random()*1000);
      System.out.println(n);
      if(n%5==0 && n<=25)
         System.out.println("Correcto");
      }
}
