import java.util.ArrayList;
class BasicJava {
    public void Imprimir() {
        for (int i = 1; i <= 255; i++) {
            System.out.println(i);
        }
    }
    public void Impares(){
        for (int i = 1; i <= 255; i++) {
            if (i % 2!= 0) {
                System.out.println(i);
            }
        }
    }

    public void ImprimirLaSuma() {
        int sum = 0;
        for (int i = 1; i <= 255; i++) {
            sum += i;
            System.out.println("Número: " + i + " Suma: " + sum);
        }
    }

    public void RecorrerArreglo(ArrayList<Object> arr) {
        for (Object item : arr) {
            System.out.println(item);
        }
    }
    public void max(){
        int max = Integer.MIN_VALUE;
        int[] miArray = {-3, -5, -7, 6, 10, 11};
        for (int i = 0;i<miArray.length; i++) {
            if (miArray[i] > max) {
                max = miArray[i];
            }
        }
        System.out.println(max);
    }
    public void Promedio(){ 
        int avg = 0;
        int[] miArray = {2, 3, 3, 5, 7, 10};
        for (int i = 0;i<miArray.length; i++) {
            avg += miArray[i];           
        }
        System.out.println(avg/miArray.length);
        }
    public void ArregloImpar(){
        int[] miArray = new int[128];
        int contador = 0;
        for (int i = 1;i<256; i+=2) {
          miArray[contador] = i;
          contador++;
           System.out.println(miArray[contador-1]);
        }
    }   
    public void MayorQueY(){
        int[] miArray = {1,3,5,7};
        int y = 3;
        int mayorqy = 0;
        for (int i = 0;i<miArray.length; i++) {
            if (miArray[i] > y) {
               mayorqy+=1;
            }            
        }
        System.out.println(mayorqy);
    }
    public void Cuadrado(){ 
        int[] miArray = {1,5,10,-2};
        for (int i = 0;i<miArray.length; i++) {
            miArray[i] *= miArray[i];
            System.out.println(miArray[i]);
        }
    }
    public void Negativos(){
        int[] miArray = {1,5,10,-2};
        for (int i = 0;i<miArray.length; i++) {
            if (miArray[i] < 0) {
                miArray[i] = 0;
             }
        System.out.println(miArray[i]);
        }
    }  
    public void MinMaxAvg(){
        int[] miArray = {1,5,10,-2};
        int min = miArray[0];
        int max = miArray[0];
        int avg = miArray[0];
        for (int i = 0;i<miArray.length; i++) {
            if (miArray[i] < min) {
                min = miArray[i];
            }
            if (miArray[i] > max) {
                max = miArray[i];
            }
            avg += miArray[i];
        }
        System.out.println("Min: " + min + " Max: " + max + " Avg: " + avg/miArray.length);
    }
    public static void Cambiando(int[] x) {
        for (int i = 1; i<x.length; i++) { 
            x[i-1] = x[i];
            }
            x[x.length-1] = 0;

    }

}   