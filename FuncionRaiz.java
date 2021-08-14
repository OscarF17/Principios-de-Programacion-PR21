import java.io.*;
import java.util.*;
class FuncionRaiz {
    public static void main(String[] arg){
      double x1, x2;
      Scanner input=new Scanner(System.in);
      System.out.println("Ingrese a");
      double a=input.nextByte();
      System.out.println("Ingrese b");
      double b=input.nextByte();
      System.out.println("Ingrese c");
      double c=input.nextByte();
      double delta=Math.sqrt(Math.pow(b,2)-4.0*a*c);
      x1=(-b+delta)/(2*a);
      x2=(-b-delta)/(2*a);
      System.out.println("Raiz 1: "+x1);
      System.out.println("Raiz 2: "+x2);      
}
}