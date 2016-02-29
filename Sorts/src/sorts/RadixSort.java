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
public class RadixSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("RadixSort: Con un arreglo de tamaño 10");
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
            RadixSort(copia);
            long fin = System.nanoTime();
            System.out.println(fin - inicio +" nanosegundos");
        }
    }

    public static int[] RadixSort(int[] old) {

        for (int shift = Integer.SIZE - 1; shift > -1; shift--) {

            int[] tmp = new int[old.length];
            int j = 0;

            for (int i = 0; i < old.length; i++) {
                boolean move = old[i] << shift >= 0;
                if (shift == 0 ? !move : move) {
                    tmp[j] = old[i];
                    j++;
                } else {
                    old[i - j] = old[i];
                }
            }
            for (int i = j; i < tmp.length; i++) {
                tmp[i] = old[i - j];
            }
            old = tmp;
        }
        return old;
    }
}
