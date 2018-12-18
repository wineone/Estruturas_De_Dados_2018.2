package adt.stack.parenthesis;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LongestValidParenthesisSubstringImplTest {

	LongestValidParenthesisSubstringImpl aux;
	
	@Before
	public void antes() {
		aux = new LongestValidParenthesisSubstringImpl();
	}

	
	@Test
	public void test() {
		assertEquals(new String("()()()"),aux.findLongest(new String("()()()))))")));
		assertEquals(new String("()()()()"),aux.findLongest(new String("((())))()()()()")));
		assertEquals(new String("((()))"),aux.findLongest(new String("()))((())))))()")));
		assertEquals(null,aux.findLongest(new String("(((((")));
		assertEquals(null,aux.findLongest(new String("))))))")));
		assertEquals(null,aux.findLongest(new String(")))))((((((")));
		assertEquals(new String("((())((())))"),aux.findLongest(new String("((())((())))(")));
	}

}
