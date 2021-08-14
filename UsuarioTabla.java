import java.io.*;
import java.util.*;
class UsuarioTabla{
   public static void main(String args[]){
      char tabla[][]=new char[4][4];
      int m;
      int n;
      char continuar;
      do{
         m=pedirM();
         n=pedirN();
         tabla[m][n]=pedirCar();
         continuar=pedirContinuar();
      }while(continuar=='s');
      desplegarTabla(tabla);
   }
   public static int pedirM(){
      int m;
      Scanner s=new Scanner(System.in);
      System.out.println("Ingrese renglón que desea modificar, considere que empieza desde 1");
      do{
         m=s.nextInt();
         if(m<1 || m>4)
            System.out.println("Ingrese un valor entre 1 y 4");
      }while(m<1 || m>4);
      return (m-1);
   }
   public static int pedirN(){
      int n;
      Scanner s=new Scanner(System.in);
      System.out.println("Ingrese columna que desea modificar, considere que empieza desde 1");
      do{
         n=s.nextInt();
         if(n<1 || n>4)
            System.out.println("Ingrese un valor entre 1 y 4");
      }while(n<1 || n>4);
      return (n-1);
   }
   public static char pedirCar(){
      Scanner s=new Scanner(System.in);
      System.out.println("Ingrese caracter que desea ingresar");
      return s.next().charAt(0);
   }
   public static char pedirContinuar(){
      Scanner s=new Scanner(System.in);
      char continuar;
      System.out.println("Ingrese s si desesa ingresar otro caracter a la tabla o n si desea terminar");
      do{
         continuar=s.next().charAt(0);
         if (!(continuar=='s' || continuar=='n'))
            System.out.println("Ingrese s o n");
      }while(!(continuar=='s' || continuar=='n'));
      return continuar;
   }
   public static void desplegarTabla(char tabla[][]){
      for(int i=0; i<4; i++){
         for(int j=0; j<4; j++){
            System.out.print(tabla[i][j]+" ");
         }
         System.out.print("\n");
      }
   }
}