import java.io.*;
import java.util.*;
class Aplicacion{
   public static void main(String args[]){
      Scanner x=new Scanner(System.in);
      String a[][]=new String [999][6];
      int cont=0;
      char salir='s';
      byte opcion;
      while (salir=='S' || salir=='s'){
         System.out.println("Ingrese: \n1 si desea registrar un reporte \n2 si desea ver incidentes levantados \n3 para editar acciones de un incidente \n4 para eliminar un incidente \n5 para cambiar el estatus de un incidente \n6 para visualizar incidentes");
         opcion=x.nextByte();
         switch (opcion){
            case 1:
               while(salir=='s' || salir=='S'){
                 System.out.println("Ingrese fecha del incidente");
                 a[cont][0]=x.next(); 
                 System.out.println("Ingrese descripcion del incidente");
                 a[cont][1]=x.nextLine(); 
                 System.out.println("Ingrese su nombre");
                 a[cont][2]=x.nextLine();
                 System.out.println("Ingrese las acciones tomadas durante el incidente");
                 a[cont][3]=x.nextLine();  
                 System.out.println("Ingrese el estatus del incidente");
                 a[cont][4]=x.nextLine(); 
                 cont++;
                 System.out.println("Ingrese s si desea ingresar otro incidente");
                 salir=x.nextLine().charAt(0); 
               }
               break;
            case 2:
            
               break;
            case 3:
            
               break;
            case 4:
            
               break;
            case 5:
            
               break;
            case 6:
            
               break;
            default:
               System.out.println("Ingrese una opcion valida");
         }
         System.out.println("¿Desea realizar otra accion? Ingrese s si si");
         salir=x.next().charAt(0);
      }
   }
}