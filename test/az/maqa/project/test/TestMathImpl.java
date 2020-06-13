package az.maqa.project.test;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import az.maqa.project.MathImpl;

public class TestMathImpl {

	private static MathImpl math;
	private static final double DELTA = 1e-15;

	@BeforeClass
	public static void setUpBeforeClass() {
		math = new MathImpl();
	}

	@Test
	public void testAdd() {
		int a = 100;
		int b = 200;
		int result = math.add(a, b);

		int expected = 300;

		assertEquals(expected, result);

	}

	@Test
	public void testSubtract() {
		int a = 100;
		int b = 200;
		int result = math.subtract(a, b);

		int expected = -100;

		assertEquals(expected, result);

	}

	@Test
	public void testDivide() {
		double a = 100;
		double b = 200;
		double result = math.divide(a, b);

		double expected = 0.5;

		assertEquals(expected, result, DELTA);

	}

	@Test
	public void testMultiple() {
		double a = 100;
		double b = 200;
		double actual = math.multiple(a, b);

		double expected = 20000;

		assertEquals(expected, actual, DELTA);

	}

	@Test
	public void testRootOfElement() {
		double c = 64;
		double expected = Math.sqrt(c);

		double actual = math.rootOfElement(c);

		assertEquals(expected, actual, DELTA);

	}

	@Test
	public void testPowExamples() {
		double a = 5;
		double b = 2;
		double actual = math.powExample(a, b);

		double expected = 25;

		assertEquals(expected, actual, DELTA);
	}

	@Test
	public void testSumOfElements() {
		int b = 10;
		int a = 12;
		int actual = math.sumOfElements(a, b);
		if (a < b) {
			assertTrue(actual == 33);
		} else {
			assertTrue(actual == 0);
		}

	}

	@AfterClass
	public static void tearDownClass() {
		math = null;
	}
	
	

}
