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
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("QuickSort: Con un arreglo de tamaño 10");
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
            QuickSort(copia,0,copia.length-1);
            long fin = System.nanoTime();
            System.out.println(fin - inicio +" nanosegundos");
            
        }
    }

    public static int[] QuickSort(int[] data, int izq, int der) {

        int i = izq;
        int j = der;
        int pivot = data[(izq+der)/2];
        while (i <= j){
            while(data[i]<pivot){
                i++;
            }
            while(data[j] > pivot){
                j--;
            }
            if (i <= j) {
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
                i++;
                j--;
            }
        }
        if (izq < i - 1) {
            QuickSort(data,izq,i-1);
        }
        if (i < der) {
            QuickSort(data,i,der);
        }
        
        return data;
    }

    

}
