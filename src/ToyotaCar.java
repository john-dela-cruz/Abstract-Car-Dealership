
public class ToyotaCar implements CarFactory{
	
	CarFactory carFactory;
	
	public ToyotaCar() {
		
	}
	public void orderCar() {
		System.out.println("Toyota Car has been Ordered");
	}
}
