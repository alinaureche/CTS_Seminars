package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import classes.Person;
import mock.PersonMock;

public class TestPersonConstructor {

	static PersonMock pm;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		pm=new PersonMock();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	public void testConformance() throws Exception {
		assertTrue(true);
	}
	
	@Test
	public void testOrdering() throws Exception {	//ca rezultatul e acelasi indiferent de ordine
		assertTrue(true);
	}

	// RangeTest: datele de intrare sa fie: costul intre 0 si 2000, iar avg intre 0 si 2000
	
	@Test
	public void testExistence() throws Exception {
		assertTrue(true);
	}
	
	@Test
	public void testCardinality() throws Exception {
		assertTrue(true);
	}

}
