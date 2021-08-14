//
//
//
import java.io.*;
import java.util.*;
class Estadisticas{
   public static void main(String args[]){
    String carr[]={"IMA","IIS","ITC","ITR","IMT","IDA"};
    int a[][]=new int [5][6];
    a=Estadisticas.alumDia(carr);  
    int t[]=new int[6];
    t=Estadisticas.masDemanda(a, carr);
    Estadisticas.totalCarrera(t, carr);
   }
   public static int[][] alumDia(String carr[]){
      Scanner s=new Scanner(System.in);
      int a[][]=new int [5][6];
      for(int i=0; i<5; i++){
         System.out.println("Ingrese el total de alumnos en el día "+(i+1));
         for(int j=0; j<6; j++){
            System.out.println("Para la carrera "+carr[j]);
            a[i][j]=s.nextInt();
         }
      }
      return a;
   }
   public static int[] masDemanda(int a[][], String carr[]){
      int c=0;
      int t[]=new int[6];
      for(int j=0; j<6; j++){
         t[j]=0;
         for(int i=0; i<5; i++)
            t[j]+=a[i][j];
      }
      int mayor=t[0];
      for(int j=1; j<6; j++){
         if(t[j]>mayor){
            mayor=t[j];
            c=j;
         }
      }
      System.out.println("La o las carreras con mayor numero de alumnos son:");
      for(int j=0; j<6; j++){
         if(t[j]==t[c])
            System.out.println(carr[j]+" con "+mayor+" alumnos");
      }
      return t;
   }
   public static void totalCarrera(int t[], String carr[]){
      for(int j=0; j<6; j++)
         System.out.println("La cantidad de alumnos en la carrera: "+carr[j]+" es: "+t[j]);
   }
}