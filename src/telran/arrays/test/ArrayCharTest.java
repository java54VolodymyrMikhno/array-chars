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

		assertEquals(4, arrayChar1.compareToIgnporeCase(arrayChar4));
		assertEquals(-4, arrayChar4.compareToIgnporeCase(arrayChar1));
		assertEquals(8, arrayChar2.compareToIgnporeCase(arrayChar1));
		assertEquals(-8, arrayChar1.compareToIgnporeCase(arrayChar2));
		assertEquals(1, new ArrayChar(new char[] { 'A', 'a' }).compareToIgnporeCase(new ArrayChar(new char[] { 'a' })));
		assertEquals(-1,
				new ArrayChar(new char[] { 'A' }).compareToIgnporeCase(new ArrayChar(new char[] { 'a', 'a' })));
		assertEquals(0, arrayChar1.compareToIgnporeCase(arrayChar3));
	}

	@Test
	void count() {
		char[] ar1 = { '1', '2', '3', 'A', '1', '1', '2' };
		ArrayChar arrayChar1 = new ArrayChar(ar1);

		assertEquals(3, arrayChar1.count('1'));
		assertEquals(2, arrayChar1.count('2'));
		assertEquals(0, arrayChar1.count('T'));
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
}