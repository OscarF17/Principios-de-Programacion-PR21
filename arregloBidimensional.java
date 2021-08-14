import java.io.*;
import java.util.*;
class ArregloBidimensional{
   public static void main(String args[]){
      int m=ArregloBidimensional.pedirM();
      int n=ArregloBidimensional.pedirN();
      int a[][]=new int[m][n];
      int b[][]=new int[m][n];
      int c[][]=new int[m][n];
      a=ArregloBidimensional.crearArreglo(m,n);
      b=ArregloBidimensional.crearArreglo(m,n);
      c=ArregloBidimensional.sumarAB(m,n,a,b);
      ArregloBidimensional.desplegarC(c,m,n);
   }
   public static int pedirM(){
      Scanner s=new Scanner(System.in);
      System.out.println("Ingrese cantidad de renglones del arrego");
      return s.nextInt();
   }
   public static int pedirN(){
      Scanner s=new Scanner(System.in);
      System.out.println("Ingrese cantidad de columnas del arrego");
      return s.nextInt();
   }
   public static int[][] crearArreglo(int m, int n){
      Scanner s=new Scanner(System.in);
      int a[][]=new int[m][n];
      for(int i=0; i<m; i++)
         for(int j=0; j<n; i++){
            System.out.println("Ingresa el valor en las coordenadas"+ (i+1)+","+(j+1));
            a[i][j]=s.nextInt();
         }
      return a;
   }
   public static int[][] sumarAB(int m, int n, int[][] a, int[][] b){
      int c[][]=new int[m][n];
      for(int i=0; i<m; i++)
         for(int j=0; j<n; i++)
            c[i][j]=a[i][j]+b[i][j];
      return c;
   }
   public static void desplegarC(int[][] c, int m, int n){
      for(int i=0; i<m; i++){
         for(int j=0; j<n; i++)
            System.out.print(c[i][j]+" ");
         System.out.println("\n");
         }
   }
}