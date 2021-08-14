//Eduardo Flores 568379 Oscar Flores 570390
//Programa para graficar resultados y obtener estadísticas

import java.io.*;
import java.util.*;
import java.text.*;
//Importar librería de gráficas JFreeChart
import javax.swing.JFrame; 
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.RefineryUtilities;

class ProyectoFinal{
  //Código Main
  public static void main(String args[]){
    byte n = pedirN();//Número de preguntas
    byte m = pedirM();//Número de respuestas
    //Los arreglos bidimensionales se manejan de arriba a abajo y luego de derecha a izquierda, igual que el Excel donde guardamos las respuestas
    byte respuestas[][] = new byte[m][n];//Respuestas de cada pregunta
    String preguntas[] = new String[n];//Títulos de las preguntas
    byte frecuencias[][] = new byte[5][n];//Frecuencias de las respuestas por preguntas
    preguntas = pedirPreguntas(preguntas, n);
    respuestas = pedirRespuestas(respuestas, m, n, preguntas);
    float media;
    media = calcularMedia(respuestas, m, n);
    calcularModa(respuestas, m, n);
    calcularMediana(respuestas, m, n);
    calcularDesviacionVarianza(respuestas, media, m, n);
    frecuencias = calcularFrecuencias(respuestas, m, n);
    imprimirFrecuencias(frecuencias, n);
    imprimirGraficas(preguntas, frecuencias, m, n);
  }
  //Método para pedir el número de preguntas
  public static byte pedirN(){
    Scanner input=new Scanner(System.in);
    System.out.println("Ingrese número de preguntas");
    return input.nextByte();
  }
  //Método para pedir el número de alumnos/respuestas que se van a dar
  public static byte pedirM(){
    Scanner input=new Scanner(System.in);
    System.out.println("Ingrese número de respuestas por pregunta");
    return input.nextByte();
  }
  //Método para ingresar los títulos de las preguntas
  public static String[] pedirPreguntas(String a[], byte n){
    Scanner input=new Scanner(System.in);
    for(int i=0; i<n; i++){
      System.out.println("Ingrese titulo de la pregunta "+(i+1));
      a[i]=input.nextLine();
    }               
    return a;
  }
  //Método para ingresar respuestas
  public static byte[][] pedirRespuestas(byte a[][], byte m, byte n, String preguntas[]){
    Scanner input=new Scanner(System.in);
    byte res;
    //Los ciclos de respuestas y frecuencias se mueven de arriba a abajo y luego de derecha a izquierda
    for(int j=0; j<n; j++)
      for(int i=0; i<m; i++){
        do{
          System.out.println("Ingrese respuesta "+(i+1)+" para la pregunta "+(j+1)+" [ "+preguntas[j]+" ]");
          res=input.nextByte();
          if(res>=1 && res<=5)
            a[i][j]=res;
          else
            System.out.println("Ingrese un valor válido");
        } while (res < 1 || res > 5);
    }
    return a;
  }
  //**Todos los métodos para calcular datos estadísticos los calculan y despliegan**
  //Método para calcular media
  public static float calcularMedia(byte a[][], byte m, byte n){
    DecimalFormat df = new DecimalFormat("0.00");
    float acumulador = 0;
    for (int i = 0; i < a.length; i++)
      for (int j = 0; j < a[i].length; j++)
        acumulador += a[i][j];
    System.out.println("Media: " + df.format(acumulador/(m*n))); //Dividir entre el número de respuestas totales
    return acumulador/(m*n);
  }
  //Método para calcular moda
  public static void calcularModa(byte a[][], byte m, byte n){
    byte respuestasJuntas[] = new byte[m * n];
    byte arregloModa[] = new byte[m * n];
    byte contadorModa, moda;
    short contador = 0;
    for (int i = 0; i < a.length; i++)
      for (int j = 0; j < a[i].length; j++){
        respuestasJuntas[contador] = a[i][j];
        contador++;
      }
      for (int i = 0; i < respuestasJuntas.length; i++){
        contadorModa = 1;
        if (respuestasJuntas[i] == -1) //Si ese número ya se checó, se lo salta
          arregloModa[i] = 0;
        else{
          for (int j = i + 1; j < respuestasJuntas.length; j++){
            if (respuestasJuntas[i] == respuestasJuntas[j]){
              contadorModa++;
              respuestasJuntas[j] = -1; //Sustituir los otros números que sean iguales al que ya se checó por un -1
            }
          }
          arregloModa[i] = contadorModa; //El arregloModa guarda cuántas veces apareció el número
        }
      }
      moda = arregloModa[0];
      for (int i = 1; i < respuestasJuntas.length; i++) {
        if (arregloModa[i] > moda)
          moda = arregloModa[i]; //Si un número aparece más veces que la antigua moda, se reemplaza la nueva moda
      }
    System.out.print("Moda(s): ");
    for (int i = 0; i < respuestasJuntas.length; i++){
      if (arregloModa[i] == moda) //Todos los números que sean igual a la moda, se imprimen, en caso de tener más de una moda
        System.out.print(respuestasJuntas[i] + " ");
    }
  }
  //Método para calcular mediana
  public static void calcularMediana(byte a[][], byte m, byte n){
    DecimalFormat df = new DecimalFormat("0.00");
    byte respuestasJuntas[] = new byte[m * n];
    short contador = 0; 
    float mediana;
    for (int i = 0; i < a.length; i++)
      for (int j = 0; j < a[i].length; j++) {
        respuestasJuntas[contador] = a[i][j]; //Se juntan todas las respuestas en un mismo arreglo para poder aplicar un sort
        contador++;
      }
    Arrays.sort(respuestasJuntas);
    if (respuestasJuntas.length % 2 == 0) 
      mediana = ((float)respuestasJuntas[respuestasJuntas.length / 2] + ((float)respuestasJuntas[(respuestasJuntas.length / 2) - 1])) / 2; //Si hay dos números en el medio, se suman  y se dividen entre 2
    else
      mediana = (float)respuestasJuntas[respuestasJuntas.length / 2]; //Si sólo hay un número en medio, simplemente se agarra dividiendo la longitud de las respuestas entre 2
    System.out.println("\nMediana: " + df.format(mediana));
  }
  //Método para calcular desviación estandar y varianza
  public static void calcularDesviacionVarianza(byte a[][], float media, byte m, byte n){
    DecimalFormat df = new DecimalFormat("0.00");
    double arregloDesviacion[] = new double[m * n]; 
    short contador = 0;
    double acumulador = 0, desviacion;
    for (int i = 0; i < a.length; i++){
      for (int j = 0; j < a[i].length; j++){
        arregloDesviacion[contador] =  Math.pow((a[i][j] - media), 2); //Se eleva al cuadrado la diferencia entre la respuesta y la media
        acumulador += arregloDesviacion[contador];
        contador++;
      }
    }
    desviacion = Math.sqrt(acumulador / (m * n));
    System.out.println("Desviacion: " + df.format(desviacion));
    System.out.println("Varianza: " + df.format(Math.pow(desviacion, 2))); //La varianza es la desviacion al cuadrado
  }
  //Método para calular frecuencias
  public static byte[][] calcularFrecuencias(byte a[][], byte m, byte n){
    byte frecuencias[][]=new byte[5][n];//Inicialización del arreglo de frecuencias, sus valores por defecto son 0 al ser declarado
    //Ciclo que suma las frecuencias de cada respuesta por pregunta. 
    //Las columnas llevan la cuenta de las preguntas y las filas guardan las frecuencias por respuesta (el ciclo de sueve de arriba a abajo y luego de derecha a izquierda)
    for(int j = 0; j < n; j++){
      for(int i = 0; i < m; i++){
        switch(a[i][j]){//Se revisan las respuestas dadas en el arreglo respuestas
          case 1: //Dependiendo de valor, se suma 1 a la casilla de fila correspondiente
            frecuencias[0][j] += 1;
            break;
          case 2:
            frecuencias[1][j] += 1;
            break;
          case 3:
            frecuencias[2][j] += 1;
            break;
          case 4:
            frecuencias[3][j] += 1;
            break;
          case 5:
            frecuencias[4][j] += 1;
            break;
        }
      }
    }
    return frecuencias;
  }
  //Método para imprimir frecuencias
  public static void imprimirFrecuencias(byte[][]a, byte n){
    System.out.println("\nFrecuencia: 1 2 3 4 5");
    System.out.println("----------------------");
    for(int j = 0; j < n; j++){
      System.out.print("Pregunta " + (j + 1) + ": ");
      for(int i = 0; i < 5; i++){
        System.out.print(a[i][j] + " ");
      }
      System.out.println("");
    }
  }
  //Método para imprimir gráficas usando JFree
  public static void imprimirGraficas(String preguntas[], byte frecuencias[][], byte m, byte n){
    //Ciclo que imprime gráfica con su título y frecuencias usando arreglos
    for(int j=0; j<n; j++){
      //Ingresar datos de ventana
      DefaultCategoryDataset dataset = new DefaultCategoryDataset();
      dataset.addValue(frecuencias[0][j], "Frecuencia", "1");
      dataset.addValue(frecuencias[1][j], "Frecuencia", "2");
      dataset.addValue(frecuencias[2][j], "Frecuencia", "3");
      dataset.addValue(frecuencias[3][j], "Frecuencia", "4");
      dataset.addValue(frecuencias[4][j], "Frecuencia", "5");
      JFreeChart lineChart = ChartFactory.createLineChart(preguntas[j], "Calificación", "Frecuencia", dataset, PlotOrientation.VERTICAL, true, true, false);
      ChartPanel panel = new ChartPanel(lineChart);
      // Iniciar ventana
      JFrame ventana = new JFrame("Pregunta " + (j + 1));
      ventana.setVisible(true);
      ventana.setSize(800, 600);
      ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      ventana.add(panel);
    }
  }
}