/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorts;

import java.util.Arrays;
import java.util.Collections;
import static sorts.InsertionSort.InsertionSort;

/**
 *
 * @author Jose Alberto Pejuan
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("SelectionSort: Con un arreglo de tamaño 10");
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
            selectionSort(copia);
            long fin = System.nanoTime();
            System.out.println(fin - inicio +" nanosegundos");
        }
    }

    public static int[] selectionSort(int[] data) {
        int lenD = data.length;
        int j = 0;
        int tmp = 0;
        for (int i = 0; i < lenD; i++) {
            j = i;
            for (int k = i; k < lenD; k++) {
                if (data[j] > data[k]) {
                    j = k;
                }
            }
            tmp = data[i];
            data[i] = data[j];
            data[j] = tmp;
        }
        return data;
    }
}
