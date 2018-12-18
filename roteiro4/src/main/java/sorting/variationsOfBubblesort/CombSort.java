package sorting.variationsOfBubblesort;

import sorting.AbstractSorting;
import util.Util;

/**
 * The combsort algoritm.
 */
public class CombSort<T extends Comparable<T>> extends AbstractSorting<T> {
	
	private boolean verifica(T[] array, int leftIndex, int rightIndex) {
		return leftIndex <= rightIndex && array.length > 0 && rightIndex < array.length && leftIndex >= 0;
	}
	
	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if(this.verifica(array, leftIndex, rightIndex)) {
			int gap = rightIndex -leftIndex + 1;
			
			while(gap >= 1) {
				int index = leftIndex;
				gap = (int)(gap / 1.25);
				while(index + gap <= rightIndex) {
					if(array[index].compareTo(array[index + gap]) > 0)
						Util.swap(array, index , index + gap);
					index++;
				}
			}
			
			for(int i = leftIndex; i <= rightIndex; i++) {
				for(int j = leftIndex + 1; j <= rightIndex - i; j++) {
					if(array[j - 1].compareTo(array[j]) > 0)
						Util.swap(array, j, j - 1);
				}
			}
		}
	}
}
