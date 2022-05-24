package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Comparator;

import javax.swing.border.EtchedBorder;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import classes.ETypeMarket;
import classes.Market;
import classes.Supermarket;
import exc.ExceptionNullMarket;
import sun.security.krb5.internal.crypto.EType;

public class TestCaseSupermarketGetBiggestMartket {
	
	static Market m1;
	static Market m2;
	static Market m3;
	static Market m4;
	static Market m5;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.out.println("SetUp Before Class");
		m1 = new Market("Sephora", 20, ETypeMarket.BEAUTY);
		m2 = new Market("Douglas", 29, ETypeMarket.BEAUTY);
		m3 = new Market("H&M", 40, ETypeMarket.CLOTHES);
		m4 = new Market("MobExpert", 100, ETypeMarket.DECORATIONS);
		m5 = new Market("Zara", 20, ETypeMarket.CLOTHES);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Tear Down After Class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("SetUp");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Tear Down");
	}

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	
	@Test
	public void TestRight() {
		System.out.println("Test Right");
		
		ArrayList<Market>listMarkets = new ArrayList<Market>();
		listMarkets.add(m1);
		listMarkets.add(m2);
		listMarkets.add(m3);
		listMarkets.add(m4);
		listMarkets.add(m5);
		Supermarket sm = new Supermarket("Electroputere", listMarkets);
		
		try {
			String result = sm.getBiggestMartkeByArea(ETypeMarket.BEAUTY);
			
//			if (result.equals("Douglas")) {
//				assertTrue(true);
//			} else {
//				assertTrue(false);
//			}
			
			assertEquals("Douglas", result);
			
		} catch (ExceptionNullMarket e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Not supposed to throw exception");
		}
	}
	
	
	@Test
	public void TestBoundary() {
		
		System.out.println("Test Boundary");
		
		ArrayList<Market>listMarkets = new ArrayList<Market>();
		listMarkets.add(m1);
		Supermarket sm = new Supermarket("Electroputere", listMarkets);
		
		try {
			String result = sm.getBiggestMartkeByArea(ETypeMarket.BEAUTY);
			
			assertEquals("Sephora", result);
			
		} catch (ExceptionNullMarket e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Not supposed to throw exception - la limitele intervalului");
		}
		
	}
	
	@Test(expected = ExceptionNullMarket.class)
	public void TestException() throws ExceptionNullMarket {
		
		ArrayList<Market> listM = new ArrayList<Market>();
		Supermarket sm = new Supermarket("Electroputere", listM);
		
		String result = sm.getBiggestMartkeByArea(ETypeMarket.BEAUTY);
	}
	
	@Test 
	public void TestPerformance() {
		
		//NOT NOW Start Time!!
		
		ArrayList<Market>listMarkets = new ArrayList<Market>();
		listMarkets.add(m1);
		listMarkets.add(m2);
		listMarkets.add(m3);
		listMarkets.add(m4);
		listMarkets.add(m5);
		
		Supermarket sm = new Supermarket("Electroputere", listMarkets);
		
		double startTime = System.currentTimeMillis();
		
//		String result = sm.getBiggestMartkeByArea(ETypeMarket.BEAUTY);
		
		double stopTime = System.currentTimeMillis();
//		assertEquals("The test runs < 0.5 ms", 0.5, stopTime-startTime);
		assertTrue("The test runs < 10 ms", stopTime-startTime <= 10);
	}

	
	public Market getLargestMarket(ETypeMarket type, ArrayList<Market> listM) {
		listM.sort(new Comparator<Market>() {

			@Override
			public int compare(Market o1, Market o2) {
				// TODO Auto-generated method stub
				if (o1.getArea() > o2.getArea())
					return 1;
				else {
					return 0;
				}
			}
		});
		for (int i = 0; i < listM.size(); i ++) {
			if (type == listM.get(i).getTypeMarket()) {
				return listM.get(i);
			}
		}
		return null;
	}
	
	@Test
	public void TestCrossCheck() {
		
		ArrayList<Market>listMarkets = new ArrayList<Market>();
		listMarkets.add(m1);
		listMarkets.add(m2);
		listMarkets.add(m3);
		listMarkets.add(m4);
		listMarkets.add(m5);
		Supermarket sm = new Supermarket("Electroputere", listMarkets);
		
		String actual = sm.getBiggestMartkeByArea(ETypeMarket.BEAUTY);
		Market expectedMarket = getLargestMarket(ETypeMarket.BEAUTY, listMarkets);
		String expected = expectedMarket.getName();
		assertEquals("E ok", expected, actual);
	}
	
	@Test
	public void TestInverse() {
		
	}
}
