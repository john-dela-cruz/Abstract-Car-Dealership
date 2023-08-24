
public class HondaCar implements CarFactory{
	
	CarFactory carFactory;
	
	public HondaCar() {
		
	}
	public void orderCar() {
		System.out.println("Honda Car has been Ordered");
	}
}
