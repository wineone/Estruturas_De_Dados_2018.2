package adt.heap.extended;

import java.util.PriorityQueue;

import adt.heap.extended.HeapSum;


/**
 * A classe HeapSumImpl herda de PriorityQueue, que funciona como uma min heap.
 * 
 * @author adalbertocajueiro
 *
 */
public class HeapSumImpl extends PriorityQueue<Integer> implements HeapSum {

	@Override
	public Integer sumRangeOrderStatistics(Integer k1, Integer k2) {
		for(int i = 0; i < k1 - 1; i++) {
			this.poll();
		}
		
		int soma = 0;
		for(int i = 0; i <= k2 - k1; i++) {
			if(!this.isEmpty())
				soma += this.poll();
		}
		
		return soma;
	}

	@Override
	public Integer sumRangeBetween(Integer v1, Integer v2) {
		while(!this.isEmpty() && this.peek() < v1) {
			this.poll();
		}
		int soma = 0;
		while(!this.isEmpty() && this.peek() <= v2) {
			soma += this.poll();
		}
		return soma;
	}

	@Override
	public Integer sumRangeAtLevel(int level) {
		
		int soma = 0;
		int comeco = (int) (Math.pow(2,level) - 1);
		int end = (int) (Math.pow(2, level + 1) - 1);
		
		Integer[] array = (Integer[]) this.toArray(new Integer[0]);
		
		for(int i = comeco; i < end; i++) {
			if(i < array.length)
				soma += array[i];
		}
		return soma;
	}
	
}
