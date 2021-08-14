//Oscar Luciano Flores Leija
//570390
//Objetivo: Programa que calcula el costo de consumo de gas en un mes.
import java.io.*;
import java.util.*;
class Factura {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Ingrese consumo del mes anterior");
        short m1=input.nextShort();
        System.out.println("Ingrese consumo del mes actual");
        short m2=input.nextShort();
        int consumo=m2-m1;
        double pago;
        if (consumo<=60)
            pago=15;
        else if (consumo<=160)
            pago=(consumo-60)*0.5+15;
        else if(consumo<=260)
            pago=(consumo-160)*0.025+(0.5*100)+15; //Ya sabemos que se compraron 100 metros cubicos por $0.5
        else
            pago=(consumo-260)*0.015+(100*0.025)+(100*0.5)+15;
        System.out.println("El pago total es de: $"+pago);
    }
}
