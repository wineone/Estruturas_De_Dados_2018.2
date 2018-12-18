package sorting.linearSorting;

import sorting.AbstractSorting;

/**
 * Classe que implementa a estratégia de Counting Sort vista em sala. Procure
 * evitar desperdicio de memoria alocando o array de contadores com o tamanho
 * sendo o máximo inteiro presente no array a ser ordenado.
 * 
 */
public class CountingSort extends AbstractSorting<Integer> {

   @Override
   public void sort(Integer[] array, int leftIndex, int rightIndex) {
      if (array.length > leftIndex) {
         Integer ceil = array[leftIndex];

         for (int i = leftIndex; i <= rightIndex; i++) {
            if (array[i] > ceil)
               ceil = array[i];
         }

         int[] arrayContadores = new int[ceil + 1];
         Integer[] saida = new Integer[rightIndex - leftIndex + 1];

         for (int i = leftIndex; i <= rightIndex; i++)
            arrayContadores[array[i]]++;

         for (int i = 1; i <= ceil; i++)
            arrayContadores[i] += arrayContadores[i - 1];

         for (int i = rightIndex; i >= leftIndex; i--) {
            arrayContadores[array[i]]--;
            saida[arrayContadores[array[i]]] = array[i];
         }

         for (int i = leftIndex; i <= rightIndex; i++)
            array[i] = saida[i - leftIndex];
      }
   }

}
