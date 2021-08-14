//
//
import java.io.*;
import java.util.*;
import java.text.*;
class ClaseSalon{
  public static void main(String arg[])
  {
    int n=ClaseSalon.leerN();
    double c[]=new double[n+1];
    c=ClaseSalon.leerSumar(n);
    double prom=ClaseSalon.calcularProm(c[n],n);
    ClaseSalon.imprimir(prom,c,n);
  }
  public static int leerN()
  {
    Scanner s=new Scanner(System.in);
    System.out.println("ingrese la cantidad total de datos a capturar");
    return s.nextInt();
  }
  public static double[] leerSumar(int n)
  {
    Scanner s=new Scanner(System.in);
    double c[]=new double[n+1];
   double acum=0;
    for(int i=0;i<n;i++)
    {
      System.out.println("ingrese la calificacion:"+(i+1));
      c[i]=s.nextDouble();
      acum+=c[i];
    }
    c[n]=acum;
     return c;
     }
     public static void imprimir(double prom,double c[],int n)
     
     {
         DecimalFormat d=new DecimalFormat("0.00");

         for(int i=0;i<n;i++)
          System.out.println(d.format(c[i]));

           System.out.println("promedio es:"+d.format(prom));
     }
     }//cierra la clase
