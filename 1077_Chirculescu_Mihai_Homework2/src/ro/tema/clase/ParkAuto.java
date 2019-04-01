package ro.tema.clase;

import java.util.ArrayList;
import java.util.List;

import ro.tema.exceptions.DeliveryMethodException;
import ro.tema.exceptions.EmptyDeliveryException;
import ro.tema.exceptions.PaymentMethodException;
import ro.tema.utils.DeliveryMethod;
import ro.tema.utils.PaymentMethod;

public class ParkAuto {
	private List<Car> stock;
	private PaymentMethod paymentMethod;
	private DeliveryMethod deliveryMethod;
	
	public ParkAuto()
	{
		this.stock=new ArrayList<Car>();
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public DeliveryMethod getDeliveryMethod() {
		return deliveryMethod;
	}

	public void setDeliveryMethod(DeliveryMethod deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

	public List<Car> getStock() {
		return stock;
	}
	
	public void ClearStock() {
		this.stock.clear();
	}
	
	public void finishDelivery() throws EmptyDeliveryException, 
	PaymentMethodException, 
	DeliveryMethodException
	{
		if(stock.size() == 0)
		{
			throw new EmptyDeliveryException("To get a delivery you have to buy minimum a car!");
		}
		if(this.paymentMethod == null)
		{
			throw new PaymentMethodException("To get the car you have to set the payment method");
		}
		if(this.deliveryMethod == null)
		{
			throw new DeliveryMethodException("Fot finishing the order you have to set the delivery method");
		}
		
		double totalPriceForCars = 0;
		for(Car c : this.stock) {
			totalPriceForCars +=c.getPrice();
		}
		
		System.out.println("You bought cars of " + totalPriceForCars + "euro, and will be delivered by" 
		+ this.deliveryMethod + "beeing payed by: " + this.paymentMethod);
	}
}
