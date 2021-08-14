import java.io.*;
import java.util.*;
class RepasoTemperaturas {
    public static void main(String[] arg){
      Scanner input=new Scanner(System.in);
      double t1, t2, sumat1=0, sumat2=0;
      for(int i=1; i<=10; i++){
         System.out.println("Ingrese temperatura T1 "+i);
         t1=input.nextDouble();
         sumat1+=t1;
         System.out.println("Ingrese temperatura T2 "+i);
         t2=input.nextDouble();         
         sumat2+=t2;
      }
      System.out.println("Promedio de las t1: "+sumat1/10);
      System.out.println("Promedio de las t2: "+sumat2/10);      
      }
}
         
         