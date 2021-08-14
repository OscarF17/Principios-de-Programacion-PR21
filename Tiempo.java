import java.io.*;
import java.util.*;
class Tiempo {
    public static void main(String[] arg){
      Scanner input=new Scanner(System.in);
      System.out.println("Ingrese cantidad de segundos");
      int segundos=input.nextInt();
      int horas, minutos;
      horas=segundos/3600;
      segundos-=horas*3600;
      minutos=segundos/60;
      segundos-=minutos*60;
      System.out.println("Horas: "+horas);
      System.out.println("Minutos: "+minutos);
      System.out.println("Segundos: "+segundos);
      }
}