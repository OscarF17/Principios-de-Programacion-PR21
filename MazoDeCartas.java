import java.io.*;
import java.util.*;
class MazoDeCartas {
    public static void main(String[] arg){
      byte iguales=0, diferentes=0;
      for(int i=0; i<15; i++){
         byte cartaJose=(byte)(Math.random()*15);
         System.out.println(cartaJose);
         byte cartaPedro=(byte)(Math.random()*15);
         System.out.println(cartaPedro);
         if(cartaJose==cartaPedro){
            System.out.println("Juan y Pedro \"iguales\"");
            iguales++;
            }
         else{
            System.out.println("Juan y Pedro \"diferentes\"");
            diferentes++;
            }
      }
      System.out.println("\n \n"+iguales+" fueron iguales, "+diferentes+" fueron diferentes.");
    }
}
