import java.io.*;
import java.util.*;
class RuletaRandom {
    public static void main(String[] arg){
      byte pares=0, impares=0, ceros=0;
      for(int i=0; i<5; i++){
         long numero=Math.round(Math.random()*(37));
         System.out.println(numero);
         if(numero==0)
            ceros++;
         else if(numero%2==0)
            pares++;
         else
            impares++;
         }
      float porPar=(pares*100)/5.0f;
      float porIm=(impares*100)/5.0f;
      float porCer=(ceros*100)/5.0f;
      System.out.println("Porcentaje de pares "+porPar+"%");
      System.out.println("Porcentaje de impares "+porIm+"%");
      System.out.println("Porcentaje de ceros "+porCer+"%");
      }
      }