//Oscar Luciano Flores Leija
//570390
//Objetvio: Crear un tercer arreglo que diga si 2 arreglos tienen ambos numeros pares, impares o ninguno en una misma posicion.
import java.io.*;
import java.util.*;
class ArregloNumParImpar{
   public static void main(String args[]){
      char c[]= new char[20];
      int a1[]=new int[20];
      int a2[]=new int[20];
      Scanner x=new Scanner(System.in);
      
      for(int i=0; i<20; i++){
         System.out.println("Ingrese un valor para el primer arreglo en la posicion "+(i+1));
         a1[i]=x.nextInt();
         System.out.println("Ingrese un valor para el segundo arreglo en la posicion "+(i+1));
         a2[i]=x.nextInt();
         if(a1[i]%2==0 && a2[i]%2==0)
            c[i]='P';
         else if(a1[i]%2!=0 && a2[i]%2!=0)
            c[i]='I';
         else
            c[i]='N';
         }
      for(int i=0; i<20; i++)
         System.out.println("El tercer arreglo en la posicion "+(i+1)+ " es: "+c[i]);
   }
}