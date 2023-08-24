
public class SimpleCarDealership{
	
	public CarFactory chooseBrand(String brand){
		
		CarFactory car = null;
		
		if(brand.equals("Honda")){
			car = new HondaCar();
		}
		else if(brand.equals("Toyota")){
			car = new ToyotaCar();
		}
		else if(brand.equals("Hyundai")){
			car = new HyundaiCar();
		}
		else if(brand.equals("Ford")){
			car = new FordCar();
		}
		
		return car;
	}
}
