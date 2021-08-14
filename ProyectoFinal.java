//Eduardo Flores 568379 Oscar Flores 570390
//Programa para graficar resultados y obtener estad�sticas

import java.io.*;
import java.util.*;
import java.text.*;
//Importar librer�a de gr�ficas JFreeChart
import javax.swing.JFrame; 
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.RefineryUtilities;

class ProyectoFinal{
  //C�digo Main
  public static void main(String args[]){
    byte n = pedirN();//N�mero de preguntas
    byte m = pedirM();//N�mero de respuestas
    //Los arreglos bidimensionales se manejan de arriba a abajo y luego de derecha a izquierda, igual que el Excel donde guardamos las respuestas
    byte respuestas[][] = new byte[m][n];//Respuestas de cada pregunta
    String preguntas[] = new String[n];//T�tulos de las preguntas
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
  //M�todo para pedir el n�mero de preguntas
  public static byte pedirN(){
    Scanner input=new Scanner(System.in);
    System.out.println("Ingrese n�mero de preguntas");
    return input.nextByte();
  }
  //M�todo para pedir el n�mero de alumnos/respuestas que se van a dar
  public static byte pedirM(){
    Scanner input=new Scanner(System.in);
    System.out.println("Ingrese n�mero de respuestas por pregunta");
    return input.nextByte();
  }
  //M�todo para ingresar los t�tulos de las preguntas
  public static String[] pedirPreguntas(String a[], byte n){
    Scanner input=new Scanner(System.in);
    for(int i=0; i<n; i++){
      System.out.println("Ingrese titulo de la pregunta "+(i+1));
      a[i]=input.nextLine();
    }               
    return a;
  }
  //M�todo para ingresar respuestas
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
            System.out.println("Ingrese un valor v�lido");
        } while (res < 1 || res > 5);
    }
    return a;
  }
  //**Todos los m�todos para calcular datos estad�sticos los calculan y despliegan**
  //M�todo para calcular media
  public static float calcularMedia(byte a[][], byte m, byte n){
    DecimalFormat df = new DecimalFormat("0.00");
    float acumulador = 0;
    for (int i = 0; i < a.length; i++)
      for (int j = 0; j < a[i].length; j++)
        acumulador += a[i][j];
    System.out.println("Media: " + df.format(acumulador/(m*n))); //Dividir entre el n�mero de respuestas totales
    return acumulador/(m*n);
  }
  //M�todo para calcular moda
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
        if (respuestasJuntas[i] == -1) //Si ese n�mero ya se chec�, se lo salta
          arregloModa[i] = 0;
        else{
          for (int j = i + 1; j < respuestasJuntas.length; j++){
            if (respuestasJuntas[i] == respuestasJuntas[j]){
              contadorModa++;
              respuestasJuntas[j] = -1; //Sustituir los otros n�meros que sean iguales al que ya se chec� por un -1
            }
          }
          arregloModa[i] = contadorModa; //El arregloModa guarda cu�ntas veces apareci� el n�mero
        }
      }
      moda = arregloModa[0];
      for (int i = 1; i < respuestasJuntas.length; i++) {
        if (arregloModa[i] > moda)
          moda = arregloModa[i]; //Si un n�mero aparece m�s veces que la antigua moda, se reemplaza la nueva moda
      }
    System.out.print("Moda(s): ");
    for (int i = 0; i < respuestasJuntas.length; i++){
      if (arregloModa[i] == moda) //Todos los n�meros que sean igual a la moda, se imprimen, en caso de tener m�s de una moda
        System.out.print(respuestasJuntas[i] + " ");
    }
  }
  //M�todo para calcular mediana
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
      mediana = ((float)respuestasJuntas[respuestasJuntas.length / 2] + ((float)respuestasJuntas[(respuestasJuntas.length / 2) - 1])) / 2; //Si hay dos n�meros en el medio, se suman  y se dividen entre 2
    else
      mediana = (float)respuestasJuntas[respuestasJuntas.length / 2]; //Si s�lo hay un n�mero en medio, simplemente se agarra dividiendo la longitud de las respuestas entre 2
    System.out.println("\nMediana: " + df.format(mediana));
  }
  //M�todo para calcular desviaci�n estandar y varianza
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
  //M�todo para calular frecuencias
  public static byte[][] calcularFrecuencias(byte a[][], byte m, byte n){
    byte frecuencias[][]=new byte[5][n];//Inicializaci�n del arreglo de frecuencias, sus valores por defecto son 0 al ser declarado
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
  //M�todo para imprimir frecuencias
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
  //M�todo para imprimir gr�ficas usando JFree
  public static void imprimirGraficas(String preguntas[], byte frecuencias[][], byte m, byte n){
    //Ciclo que imprime gr�fica con su t�tulo y frecuencias usando arreglos
    for(int j=0; j<n; j++){
      //Ingresar datos de ventana
      DefaultCategoryDataset dataset = new DefaultCategoryDataset();
      dataset.addValue(frecuencias[0][j], "Frecuencia", "1");
      dataset.addValue(frecuencias[1][j], "Frecuencia", "2");
      dataset.addValue(frecuencias[2][j], "Frecuencia", "3");
      dataset.addValue(frecuencias[3][j], "Frecuencia", "4");
      dataset.addValue(frecuencias[4][j], "Frecuencia", "5");
      JFreeChart lineChart = ChartFactory.createLineChart(preguntas[j], "Calificaci�n", "Frecuencia", dataset, PlotOrientation.VERTICAL, true, true, false);
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