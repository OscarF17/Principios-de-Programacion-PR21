import java.io.*;
import java.util.*;
class ArregloFrecuencias{
   public static void main(String args[]){
      byte a[]=new byte[10];
      byte frecuencias[]=new byte[6];
      llenarArreglo(a);
      frecuencias=contarFrecuencias(a, frecuencias);
      imprimirFrecuencias(frecuencias);
   }
   public static byte[] llenarArreglo(byte[] a){
      for(int i=0; i<10; i++){
         a[i]=(byte) (Math.random()*6+1); 
      }
      return a;
   }
   public static byte[] contarFrecuencias(byte[] a, byte[]b){
      for(int i=0; i<10; i++)
         switch(a[i]){
            case 1:
               b[0]+=1;
               break;
            case 2:
               b[1]+=1;
               break;
            case 3:
               b[2]+=1;
               break;
            case 4:
               b[3]+=1;
               break;
            case 5:
               b[4]+=1;
               break;
            case 6:
               b[5]+=1;
               break;
            }
         return b;
   }
   public static void imprimirFrecuencias(byte b[]){
      for(int i=0;i<6; i++)
         System.out.println("Frecuencia de los "+(i+1)+": "+(b[i]));
   }
}