
public class CaviteFactory extends CarDealership{
	
	public CarFactory chooseBrand(String brand){
		if(brand.equals("Honda")){
			System.out.println("Car ordered from Cavite");
			return new HondaCar();
		}
		else if(brand.equals("Toyota")){
			System.out.println("Car ordered from Cavite");
			return new ToyotaCar();
		}
		else if(brand.equals("Hyundai")){
			System.out.println("Car ordered from Cavite");
			return new HyundaiCar();
		}
		else if(brand.equals("Ford")){
			System.out.println("Car ordered from Cavite");
			return new FordCar();
		}
		return null;
	}
	
}
