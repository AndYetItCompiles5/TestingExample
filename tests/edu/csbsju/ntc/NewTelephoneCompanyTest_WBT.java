package edu.csbsju.ntc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NewTelephoneCompanyTest_WBT {

	private NewTelephoneCompany ntc;
	 @Before
	  public void setUp() throws Exception {
	    ntc = new NewTelephoneCompany();
	  }
	  
	
	@Test
	public void testGetStartTime() {
		ntc.setStartTime(500);
		assertTrue("Time should be 500",ntc.getStartTime()==500);
	}

	@Test
	public void testSetStartTime(){
		ntc.setStartTime(500);
		assertTrue("Time should be set to 500",ntc.getStartTime()==500);
	}

	@Test
	public void testGetDuration() {
		ntc.setDuration(30);
		assertTrue("Duration should be 30",ntc.getDuration()==30);
	}

	@Test
	public void testSetDuration() {
		ntc.setDuration(30);
		assertTrue("Duration should be set to 30",ntc.getDuration()==30);
	}

	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidStartTime() {
		ntc.setStartTime(-5);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidStartTime2() {
		ntc.setStartTime(-1);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidStartTime3() {
		ntc.setStartTime(2544);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidStartTime4() {
		ntc.setStartTime(2400);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidStartTime5() {
		ntc.setStartTime(2401);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidStartTime6() {
		ntc.setStartTime(1578);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidStartTime7() {
		ntc.setStartTime(-1160);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidStarTime8() {
		ntc.setStartTime(1161);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidStartTime9() {
		ntc.setStartTime(799);
		ntc.setDuration(-5);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidDuration() {
		ntc.setStartTime(1800);
		ntc.setDuration(0);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testComputeChargeInvalidDuration2() {
		ntc.setStartTime(1801);
		ntc.setDuration(-1);
		ntc.computeCharge();
	}
	
	@Test
	public void testComputeChargeDiscStartTimeAndDur() {
		ntc.setStartTime(500);
		ntc.setDuration(100);
		assertTrue("Output should be 1768.0",ntc.computeCharge()==1768.0);
	}
	
	@Test
	public void testComputeChargeDiscStartTimeAndDur2() {
		ntc.setStartTime(759);
		ntc.setDuration(61);
		assertTrue("Output should be 1078.48",ntc.computeCharge()==1078.48);
	}
	
	@Test
	public void testComputeChargeDiscStartTimeAndDur3() {
		ntc.setStartTime(1959);
		ntc.setDuration(61);
		assertTrue("Output should be 1078.48",ntc.computeCharge()==1078.48);
	}
	
	@Test
	public void testComputeChargeDiscStartTimeAndDur4() {
		ntc.setStartTime(2359);
		ntc.setDuration(65);
		assertTrue("Output should be 1149.2",ntc.computeCharge()==1149.2);
	}
	
	@Test
	public void testComputeChargeDiscStartTime() {
		ntc.setStartTime(0);
		ntc.setDuration(60);
		assertTrue("Output should be 1248.00",ntc.computeCharge()==1248.00);
	}
	
	@Test
	public void testComputeChargeDiscStartTime2() {
		ntc.setStartTime(400);
		ntc.setDuration(59);
		assertTrue("Output should be 1227.2",ntc.computeCharge()==1227.2);
	}
	
	@Test
	public void testComputeChargeDiscStartTime3() {
		ntc.setStartTime(759);
		ntc.setDuration(1);
		assertTrue("Output should be 20.8",ntc.computeCharge()==20.8);
	}
	
	@Test
	public void testComputeChargeDiscStartTime4() {
		ntc.setStartTime(1800);
		ntc.setDuration(10);
		assertTrue("Output should be 208.00",ntc.computeCharge()==208.00);
	}
	
	@Test
	public void testComputeChargeDiscStartTime5() {
		ntc.setStartTime(1801);
		ntc.setDuration(10);
		assertTrue("Output should be 208.0",ntc.computeCharge()==208.0);
	}
	
	@Test
	public void testComputeChargeDiscStartTime6() {
		ntc.setStartTime(2359);
		ntc.setDuration(10);
		assertTrue("Output should be 208.0",ntc.computeCharge()==208.0);
	}
	
	@Test
	public void testComputeChargeDiscDur() {
		ntc.setStartTime(800);
		ntc.setDuration(65);
		assertTrue("Output should be 2298.4",ntc.computeCharge()==2298.4);
	}
	
	@Test
	public void testComputeChargeDiscDur2() {
		ntc.setStartTime(900);
		ntc.setDuration(61);
		assertTrue("Output should be 2156.96",ntc.computeCharge()==2156.96);
	}
	
	@Test
	public void testComputeChargeNoDisc() {
		ntc.setStartTime(1000);
		ntc.setDuration(40);
		assertTrue("Output should be 1664.00",ntc.computeCharge()==1664.00);
	}
	
	@Test
	public void testComputeChargeNoDisc2() {
		ntc.setStartTime(800);
		ntc.setDuration(1);
		assertTrue("Output should be 41.6",ntc.computeCharge()==41.6);
	}
	
	@Test
	public void testComputeChargeNoDisc3() {
		ntc.setStartTime(801);
		ntc.setDuration(59);
		assertTrue("Output should be 2454.4",ntc.computeCharge()==2454.4);
	}
	
	@Test
	public void testComputeChargeNoDisc4() {
		ntc.setStartTime(1759);
		ntc.setDuration(60);
		assertTrue("Output should be 2496.0",ntc.computeCharge()==2496.0);
	}

}
