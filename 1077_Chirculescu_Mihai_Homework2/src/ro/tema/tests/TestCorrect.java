package ro.tema.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sun.javafx.util.Utils;

import ro.tema.clase.Car;
import ro.tema.clase.ParkAuto;
import ro.tema.clase.Utilities;
import ro.tema.exceptions.CarException;

public class TestCorrect {
	
	@Before
	public void setUpBeforeClass() {
		Car c= new Car("Audi",150,45000);
	}
	
	@Test
	public void TestOrdering() throws Exception {
		Car c1 = new Car("Audi a1", 120, 25000);
		Car c2 = new Car("Audi a3", 150, 35000);
		Car c3 = new Car("Audi a5", 250, 50000);
		
		int power1 = c1.getHorsePower();
		int power2 = c2.getHorsePower();
		int power3 = c3.getHorsePower();
		
		int[] powerVector = {power1, power2, power3};
		
		int expectedValue = 250;
		int actualValue = Utilities.getMax(powerVector);
		assertEquals(expectedValue, actualValue);
	}
}
