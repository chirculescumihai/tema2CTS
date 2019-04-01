package ro.tema.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import ro.tema.clase.Car;
import ro.tema.exceptions.SetHorsepowerException;

public class TestSetPrice {
	Car c;
	
	@Before
	public void setUp() throws Exception {
		c = new Car("Audi", 150, 30000);
	}
	
	@Test
	public void testRight1() throws SetHorsepowerException
	{
		c.setHorsePower(160);
		assertEquals("test set horsepower",160,c.getHorsePower());
	}
	
	@Test
	public void testRight2() {
		c.setHorsePower(160);
		assertEquals("test set horsepower", 160, c.getHorsePower());
	}
	
	@Test(timeout=1000)
	public void testPerformance()
	{
		c.setHorsePower(180);
	}
}
