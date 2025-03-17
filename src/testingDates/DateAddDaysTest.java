package testingDates;


import static org.junit.Assert.*;
import org.junit.*;
public class DateAddDaysTest {

	
	@Test
    public void testAddOneDaySameMonth() {
        Date date1 = new Date("March", 16, 2025);
        Date newDate1 = date1.addOneDay();
        Date expectedDate = new Date("March", 17, 2025);
        assertTrue(newDate1.equals(expectedDate));
    }
	
	@Test
    public void testAddOneDaySameMonth() {
		Date date2 = new Date("February", 5, 2025);
		Date newDate2 = date2.addOneDay();
		Date expectedDate2 = new Date("February", 5, 2025);
		assertTrue(newDate2.equals(expectedDate2));
	}
	
	
	@Test
    public void testAddOneDayMonthBoundary() {
        Date date = new Date("March", 31, 2025);
        Date date2 = new Date("April", 30, 2025);
        
        Date newDate = date.addOneDay();
        Date newDate2 = date2.addOneDay();
        
        Date expectedDate = new Date("April", 1, 2025); 
        Date expectedDate2 = new Date("May", 1, 2025);
        
        assertTrue(newDate.equals(expectedDate));
        assertTrue(newDate2.equals(expectedDate));
    }
	
	
	@Test
    public void testAddOneDayYearBoundary() {
        Date date = new Date("December", 31, 2025); 
        Date newDate = date.addOneDay();
        Date expectedDate = new Date("January", 1, 2026);
        
        assertTrue(newDate.equals(expectedDate));
    }
	
}
