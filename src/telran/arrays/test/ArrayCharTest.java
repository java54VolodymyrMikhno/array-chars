package telran.arrays.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.arrays.ArrayChar;

class ArrayCharTest {

	@Test
	void compareToTest() {
		char[] ar1 = { '1', '2', '3' };
		char[] ar2 = { '9' };
		char[] ar3 = { '1', '2', '3' };
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		ArrayChar arrayChar3 = new ArrayChar(ar3);

		assertEquals(8, arrayChar2.compareTo(arrayChar1));
		assertEquals(-8, arrayChar1.compareTo(arrayChar2));
		assertEquals(1, new ArrayChar(new char[] { 'a', 'a' }).compareTo(new ArrayChar(new char[] { 'a' })));
		assertEquals(-1, new ArrayChar(new char[] { 'a' }).compareTo(new ArrayChar(new char[] { 'a', 'a' })));
		assertEquals(0, arrayChar1.compareTo(arrayChar3));
	}

	@Test
	void indexOfTest() {
		char[] ar1 = { '1', '2', '3', '2' };
		ArrayChar arrayChar1 = new ArrayChar(ar1);

		assertEquals(1, arrayChar1.indexOf('2'));
		assertEquals(-1, arrayChar1.indexOf('4'));
	}

	@Test
	void lastIndexOfTest() {
		char[] ar1 = { '1', '2', '3', '2' };
		ArrayChar arrayChar1 = new ArrayChar(ar1);

		assertEquals(3, arrayChar1.lastIndexOf('2'));
		assertEquals(-1, arrayChar1.lastIndexOf('4'));
	}

	@Test
	void compareToIgnporeCaseTest() {
		char[] ar1 = { '1', '2', '3', 'A' };
		char[] ar2 = { '9' };
		char[] ar4 = { };
		char[] ar3 = { '1', '2', '3', 'a' };
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		ArrayChar arrayChar3 = new ArrayChar(ar3);
		ArrayChar arrayChar4 = new ArrayChar(ar4);

		assertEquals(4, arrayChar1.compareToIgnoreCase(arrayChar4));
		assertTrue(new ArrayChar(new char[]{'L'}).compareToIgnoreCase(new ArrayChar(new char[]{'a'})) > 0);
		assertEquals(-4, arrayChar4.compareToIgnoreCase(arrayChar1));
		assertEquals(8, arrayChar2.compareToIgnoreCase(arrayChar1));
		assertEquals(-8, arrayChar1.compareToIgnoreCase(arrayChar2));
		assertEquals(1, new ArrayChar(new char[] { 'A', 'a' }).compareToIgnoreCase(new ArrayChar(new char[] { 'a' })));
		assertEquals(-1,
				new ArrayChar(new char[] { 'A' }).compareToIgnoreCase(new ArrayChar(new char[] { 'a', 'a' })));
		assertEquals(0, arrayChar1.compareToIgnoreCase(arrayChar3));
	}

	@Test
	void count() {
		char[] ar1 = { '1', '2', '3', 'A', '1', '1', '2' };
		ArrayChar arrayChar1 = new ArrayChar(ar1);

		assertEquals(3, arrayChar1.count('1'));
		assertEquals(2, arrayChar1.count('2'));
		assertEquals(0, arrayChar1.count('T'));
		assertEquals(0, new ArrayChar(new char[] {}).count('T'));
	}

	@Test
	void containsTest() {
		char[] ar1 = { '1', '2', '3', 'A', '1', '1', '2' };
		ArrayChar arrayChar1 = new ArrayChar(ar1);

		assertTrue(arrayChar1.contains('1'));
		assertTrue(arrayChar1.contains('2'));
		assertFalse(arrayChar1.contains('T'));
	}

	@Test
	void equals() {
		char[] ar1 = { '1', '2', '3' };
		char[] ar2 = { '9' };
		char[] ar3 = { '1', '2', '3' };
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		ArrayChar arrayChar3 = new ArrayChar(ar3);

		assertFalse(arrayChar2.equals(arrayChar1));
		assertFalse(arrayChar1.equals(arrayChar2));
		assertTrue(arrayChar1.equals(arrayChar3));
	}

	@Test
	void equalsIgnoreCase() {
		char[] ar1 = { 'h', 'e', '3' };
		char[] ar2 = { '9' };
		char[] ar3 = { 'H', 'E', '3' };
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		ArrayChar arrayChar3 = new ArrayChar(ar3);
		
		assertFalse(arrayChar2.equalsIgnoreCase(arrayChar1));
		assertFalse(arrayChar1.equalsIgnoreCase(arrayChar2));
		assertTrue(arrayChar1.equalsIgnoreCase(arrayChar3));
	}
	
	@Test
	void bugTest() {
		char[] array = {'1', '2', '3', '2'};
	    ArrayChar arrayChar = new ArrayChar(array);
	    assertEquals(2, arrayChar.count('2'));
	    assertEquals(0, arrayChar.count('S'));
	    assertEquals(0, new ArrayChar(new char[] {}).count('Q'));
	    assertFalse(arrayChar.contains('a'));
	    array[3] = 'a';
//	    assertEquals(1,arrayChar.count('2'));
//	    assertTrue(arrayChar.contains('a'));
	    assertEquals(2,arrayChar.count('2'));
	    assertFalse(arrayChar.contains('a'));
	}

}