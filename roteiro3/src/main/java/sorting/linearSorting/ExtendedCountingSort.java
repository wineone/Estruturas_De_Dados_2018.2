package sorting.linearSorting;

import sorting.AbstractSorting;

/**
 * Classe que implementa do Counting Sort vista em sala. Desta vez este
 * algoritmo deve satisfazer os seguitnes requisitos: - Alocar o tamanho minimo
 * possivel para o array de contadores (C) - Ser capaz de ordenar arrays
 * contendo numeros negativos
 */
public class ExtendedCountingSort extends AbstractSorting<Integer> {

	@Override
	public void sort(Integer[] array, int leftIndex, int rightIndex) {
		if(array.length > leftIndex) {
			Integer floor = array[leftIndex];
			Integer ceil = array[leftIndex];
			
			for(int i = leftIndex; i <= rightIndex; i++) {
				if(array[i] < floor) floor = array[i];
				if(array[i] > ceil) ceil = array[i];
			}
				
			
			int[] arrayContadores = new int[ceil - floor + 1];
			Integer[] respostas = new Integer[rightIndex - leftIndex + 1];
			
			for(int i = leftIndex; i <= rightIndex; i++) 
				arrayContadores[array[i] - floor]++;
			
			for(int i = 1; i <= (ceil - floor); i++)
				arrayContadores[i] += arrayContadores[i - 1];
			
			for(int i = rightIndex; i >= leftIndex; i--) {
				arrayContadores[array[i] - floor]--;
				respostas[arrayContadores[array[i] - floor]] = array[i];
			}
			
			for(int i = leftIndex; i <= rightIndex; i++)
				array[i] = respostas[i - leftIndex];	
		}
	}

}
