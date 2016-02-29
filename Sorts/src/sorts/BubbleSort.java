/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorts;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author Jose Alberto Pejuan
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("BubbleSort: Con un arreglo de tamaño 1,000,000");
        for (int j = 0; j < 10; j++) {
            Integer arreglo[] = new Integer[1000000];
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = i;
            }
            Collections.shuffle(Arrays.asList(arreglo));
            int copia[] = new int[arreglo.length];
            for (int i = 0; i < arreglo.length; i++) {
                copia[i] = arreglo[i];
            }
            long inicio = System.nanoTime();
            bubbleSort(copia);
            long fin = System.nanoTime();
            System.out.println(fin - inicio +" nanosegundos");
        }

    }

    public static int[] bubbleSort(int[] data) {
        int lenD = data.length;
        int tmp = 0;
        for (int i = 0; i < lenD; i++) {
            for (int j = (lenD - 1); j >= (i + 1); j--) {
                if (data[j] < data[j - 1]) {
                    tmp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = tmp;
                }
            }
        }
        return data;
    }
}
