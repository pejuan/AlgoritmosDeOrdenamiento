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
public class MergeSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("MergeSort: Con un arreglo de tamaño 10");
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
            mergeSort(copia);
            long fin = System.nanoTime();
            System.out.println(fin - inicio +" nanosegundos");
        }
    }

    public static int[] mergeSort(int[] data) {
        int lenD = data.length;
        if (lenD <= 1) {
            return data;
        } else {
            int[] sorted = new int[lenD];
            int middle = lenD / 2;
            int rem = lenD - middle;
            int[] L = new int[middle];
            int[] R = new int[rem];
            System.arraycopy(data, 0, L, 0, middle);
            System.arraycopy(data, middle, R, 0, rem);
            L = mergeSort(L);
            R = mergeSort(R);
            sorted = merge(L, R);
            return sorted;
        }
    }

    public static int[] merge(int[] L, int[] R) {
        int lenL = L.length;
        int lenR = R.length;
        int[] merged = new int[lenL + lenR];
        int i = 0;
        int j = 0;
        while (i < lenL || j < lenR) {
            if (i < lenL & j < lenR) {
                if (L[i] <= R[j]) {
                    merged[i + j] = L[i];
                    i++;
                } else {
                    merged[i + j] = R[j];
                    j++;
                }
            } else if (i < lenL) {
                merged[i + j] = L[i];
                i++;
            } else if (j < lenR) {
                merged[i + j] = R[j];
                j++;
            }
        }
        return merged;
    }
}
