//Oscar Luciano Flores Leija
//570390
//Programa que calcula el costo de enviar un paquete en base a su peso.
import java.io.*;
import java.util.*;
class EnvioPaquete{
    public static void main(String args[]){
        float peso;
        final String MENSAJE="El costo de su pedido es de: $";
        Scanner input=new Scanner(System.in);
        System.out.println("Ingrese peso de su paquete en gramos");
        peso=input.nextFloat();
        if (peso<=1000){
            System.out.println(MENSAJE+50);
        }else if (peso<=2000){
            System.out.println(MENSAJE+80.50);
        }else if (peso<=3000){
            System.out.println(MENSAJE+86);
        }else if (peso<=4000){
            System.out.println(MENSAJE+91);
        }else{
            System.out.println(MENSAJE+96.50);  
        }
    }
}