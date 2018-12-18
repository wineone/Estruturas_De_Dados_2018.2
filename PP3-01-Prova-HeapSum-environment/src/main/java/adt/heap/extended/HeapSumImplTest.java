package adt.heap.extended;

import static org.junit.Assert.*;

import org.junit.Test;

public class HeapSumImplTest {

	HeapSumImpl nova = new HeapSumImpl();
	
	@Test
	public void testSumRange1() {
		for(int i = 1; i < 18; i += 2) 
			nova.add(i);
		
		assertEquals(60,(int)nova.sumRangeOrderStatistics(3, 8));
	}
	
	@Test
	public void testSumRange2() {
		for(int i = 0; i < 15; i++) {
			nova.add(i);
		}
		
		assertEquals(15,(int)nova.sumRangeOrderStatistics(1, 6));
	}

	@Test
	public void testSumRange3() {
		for(int i = 0; i < 15; i++) {
			nova.add(i);
		}
		
		assertEquals(21,(int)nova.sumRangeOrderStatistics(1, 7));
	}
	
	@Test
	public void testSumRange4() {
		for(int i = 0; i < 15; i++) {
			nova.add(i);
		}
		
		assertEquals(0,(int)nova.sumRangeOrderStatistics(1, 1));
	}
	
	@Test
	public void testSumRange5() {
		for(int i = 0; i < 15; i++) {
			nova.add(i);
		}
		
		assertEquals(10,(int)nova.sumRangeOrderStatistics(11, 11));
	}
	
	@Test
	public void testSumRange6() {
		for(int i = 0; i < 15; i++) {
			nova.add(i);
		}
		
		assertEquals(0,(int)nova.sumRangeOrderStatistics(30, 35));
	}
	
	@Test
	public void testSumBetween1() {
		for(int i = 1; i < 18; i += 2) 
			nova.add(i);
		
		assertEquals(55, (int)nova.sumRangeBetween(6, 15));
		
	}
	
	@Test
	public void testSumBetween2() {
		for(int i = 1; i < 30; i += 2) 
			nova.add(i);
		
		assertEquals(35, (int)nova.sumRangeBetween(2, 12));
		
	}

	@Test
	public void testSumBetween3() {
		for(int i = 1; i < 30; i += 2) 
			nova.add(i);
		
		assertEquals(72, (int)nova.sumRangeBetween(14, 22));
	}
	
	@Test
	public void testSumBetween4() {
		for(int i = 1; i < 30; i += 2) 
			nova.add(i);
		
		assertEquals(29, (int)nova.sumRangeBetween(28, 60));
	}
	
	
	@Test
	public void testSumBetween5() {
		for(int i = 1; i < 30; i += 2) 
			nova.add(i);
		
		assertEquals(0, (int)nova.sumRangeBetween(80, 9999));
	}
	
	
	@Test
	public void testSumBetween6() {
		for(int i = 1; i < 30; i += 2) 
			nova.add(i);
		
		assertEquals(0, (int)nova.sumRangeBetween(80, 9999));
	}
	
	
	@Test
	public void testAtLevel1() {
		for(int i = 1; i < 18; i += 2) {
			nova.add(i);
		}
		assertEquals(1, (int) nova.sumRangeAtLevel(0));
		assertEquals(8, (int) nova.sumRangeAtLevel(1));
		assertEquals(40, (int) nova.sumRangeAtLevel(2));
		assertEquals(32, (int) nova.sumRangeAtLevel(3));
	}
	
	@Test
	public void testAtLevel2() {
		for(int i = 0; i < 15; i++) 
			nova.add(i);
		
		assertEquals(0,(int) nova.sumRangeAtLevel(0));
		assertEquals(3,(int) nova.sumRangeAtLevel(1));
		assertEquals(18,(int) nova.sumRangeAtLevel(2));
		assertEquals(84,(int) nova.sumRangeAtLevel(3));
		assertEquals(0,(int) nova.sumRangeAtLevel(5));
		assertEquals(0,(int) nova.sumRangeAtLevel(-1));
	}
	
	@Test
	public void testAtLevel3() {
		for(int i = 0; i < 5; i++) 
			nova.add(i);
		assertEquals(7,(int) nova.sumRangeAtLevel(2));
	}
	
	
	@Test
	public void testAtLevel4() {
		for(int i = 4; i >= 0; i--) 
			nova.add(i);
		assertEquals(6,(int) nova.sumRangeAtLevel(2));
		assertEquals(4,(int) nova.sumRangeAtLevel(1));
		assertEquals(0,(int) nova.sumRangeAtLevel(0));
	}
	
	
	
	
	
	
}
