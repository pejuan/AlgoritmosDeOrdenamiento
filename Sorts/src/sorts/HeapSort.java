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
public class HeapSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("HeapSort: Con un arreglo de tamaño 10");
        for (int j = 0; j < 10; j++) {
            Integer arreglo[] = new Integer[10];
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = i;
            }
            Collections.shuffle(Arrays.asList(arreglo));
            int copia[] = new int[arreglo.length];
            for (int i = 0; i < arreglo.length; i++) {
                copia[i] = arreglo[i];
            }
            long inicio = System.nanoTime();
            HeapSort(copia);
            long fin = System.nanoTime();
            System.out.println(fin - inicio +" nanosegundos");
        }
    }
    public static int[] HeapSort(int data[]) {
        int var = 0;
        for (int i = data.length - 1; i >= 0; i--) {
            if (i == 0) {
                if (var == 0) {
                    break;
                } else {
                    i = data.length - 1;
                    var = 0;
                }
            }
            if (i % 2 == 0 || i == 0) {
                if (data[i] < data[(i - 2) / 2]) {
                    int auxiliar = data[(i - 2) / 2];
                    data[(i - 2) / 2] = data[i];
                    data[i] = auxiliar;
                    var++;
                }
            } else {
                if (data[i] < data[(i - 1) / 2]) {
                    int auxiliar = data[(i - 1) / 2];
                    data[(i - 1) / 2] = data[i];
                    data[i] = auxiliar;
                    var++;
                }
            }
        }
        return data;
    }
}
