package ro.tema.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import ro.tema.clase.Car;
import ro.tema.exceptions.SetHorsepowerException;

public class TestCar {
	Car c;
	
	@Before
	public void setUp() throws Exception {
		c = new Car("Audi", 245, 30000);
	}
	
	@Test
	public void testRight() throws SetHorsepowerException
	{
		c = new Car("Audi", 245, 50000);
		assertEquals("test set car manufacture", "Audi", c.getCarManufacture());
		assertEquals("test set horsepower", 245, c.getHorsePower());
		//ssertEquals("test set price", 50000, c.getPrice());
		assertNotNull("test set car manufacture", c.getCarManufacture());
	}
	
}
