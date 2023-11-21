import java.util.ArrayList;
import java.util.Arrays;

public class BasicJavaTest {
    public static void main(String[] args) {
        
        BasicJava basic = new BasicJava();

        // 1 Imprimir 1 - 255
        basic.Imprimir();
        //2 Imprimir los Números Impares Entre 1 - 255
        basic.Impares();

        // 3 ImprimirLaSuma
        basic.ImprimirLaSuma();

        // 4 Recorrer un Arreglo
        ArrayList<Object> arr = new ArrayList<Object>();
        arr.add(1.0);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        basic.RecorrerArreglo(arr);
        // 5 Encontrar el Máximo
        basic.max();
        // 6 Obtener el Promedio
        basic.Promedio();
        // 7 Arreglo con Números Impares
        basic.ArregloImpar();
        //8 Mayor que Y
        basic.MayorQueY();
        //9 Valores al Cuadrado
        basic.Cuadrado();
        // 10 Eliminar Números Negativos
        basic.Negativos();
        // 11 Mínimo, Máximo y Promedio
        basic.MinMaxAvg();
        // 12 Cambiando los Valores del Arreglo
        int []  array2 ={1,5,10,7,-2};
         basic.Cambiando(array2);
         System.out.println(Arrays.toString(array2));
    }
 }