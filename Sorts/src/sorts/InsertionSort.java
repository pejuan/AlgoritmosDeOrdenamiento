/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorts;

import java.util.Arrays;
import java.util.Collections;
import static sorts.BubbleSort.bubbleSort;

/**
 *
 * @author Jose Alberto Pejuan
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("InsertionSort: Con un arreglo de tamaño 10");
        for (int j = 0; j < 10; j++) {
            Integer arreglo[] = new Integer[100];
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = i;
            }
            Collections.shuffle(Arrays.asList(arreglo));
            int copia[] = new int[arreglo.length];
            for (int i = 0; i < arreglo.length; i++) {
                copia[i] = arreglo[i];
            }
            long inicio = System.nanoTime();
            InsertionSort(copia);
            long fin = System.nanoTime();
            System.out.println(fin - inicio +" nanosegundos");
        }
    }

    public static int[] InsertionSort(int[] data) {
        int len = data.length;
        int key = 0;
        int i = 0;
        for (int j = 1; j < len; j++) {
            key = data[j];
            i = j - 1;
            while (i >= 0 && data[i] > key) {
                data[i + 1] = data[i];
                i = i - 1;
                data[i + 1] = key;
            }
        }
        return data;
    }
}
