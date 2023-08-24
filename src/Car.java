
public abstract class Car {
	
	String name;
	String transmission;
	String type;
	
	abstract void makeCar();
	
	public void purchase(){
		System.out.println("Car has been purchased.");
	}
	
	public void payment(){
		System.out.println("Car has been payed.");
	}
	
	public void refund(){
		System.out.println("Car has been refunded.");
	}
	
}
