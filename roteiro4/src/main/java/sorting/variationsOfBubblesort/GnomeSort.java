package sorting.variationsOfBubblesort;

import sorting.AbstractSorting;
import util.Util;

/**
 * The implementation of the algorithm must be in-place!
 */
public class GnomeSort<T extends Comparable<T>> extends AbstractSorting<T> {
	
	private boolean verifica(T[] array, int leftIndex, int rightIndex) {
		return leftIndex < rightIndex && array.length > 0 && rightIndex < array.length && leftIndex >= 0;
	}
	
	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if(this.verifica(array, leftIndex, rightIndex)) {
			int index = leftIndex + 1;
			
			while(index <= rightIndex) {
				if(index > leftIndex && array[index].compareTo(array[index -1]) < 0) {
					Util.swap(array, index, index - 1);
					index--;
				}else index++;
			}
		}
	}
}
