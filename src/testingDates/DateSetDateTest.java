package testingDates;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.*;

public class DateSetDateTest {

	private Date date;
	
	@Before
    public void setUp() {
        // Initialize the date object before each test
        date = new Date(1, 1, 1000);
    }
	
	@Test
	public void testSetDateLegal1()
	{
		date.setDate("March", 16, 2025);
		assertEquals("March 16, 2025", date.toString());
	}
	
	@Test
	public void testSetDateLegal2()
	{
		date.setDate("December", 12, 2026);
		assertEquals("December 12, 2026", date.toString());
	}
	
	@Test
	public void testSetDateLegal3()
	{
		date.setDate("February", 2, 2024);
		assertEquals("February 2, 2024", date.toString());
	}
	
	@Test
	public void testSetDateIllegal1()
	{
		date.setDate("March", 32, 2025);
		assertEquals("January 1, 1000", date.toString());
	}
	
	@Test
	public void testSetDateIllegal2()
	{
		date.setDate("March", 31, 10000);
		assertEquals("January 1, 1000", date.toString());
	}
	
	@Test
	public void testSetDateIllegal3()
	{
		date.setDate("February", 32, 999);
		assertEquals("January 1, 1000", date.toString());
	}
	
	
	
}
