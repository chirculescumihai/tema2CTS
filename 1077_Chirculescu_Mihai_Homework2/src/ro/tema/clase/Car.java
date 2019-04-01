package ro.tema.clase;

public class Car {
	private String carManufacture;
	private int horsePower;
	private int price;
	
	public Car() {
		
	}
	
	public Car(String carManufacture, int horsePower, int price)
	{
		this.carManufacture=carManufacture;
		this.horsePower=horsePower;
		this.price=price;
	}

	public String getCarManufacture() {
		return carManufacture;
	}

	public void setCarManufacture(String carManufacture) {
		this.carManufacture = carManufacture;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void applyDiscount(double percentage)
	{
		this.price = (int) (this.price - (this.price * percentage));
	}
}
