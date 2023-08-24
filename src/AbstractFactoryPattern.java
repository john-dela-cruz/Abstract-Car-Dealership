
public class AbstractFactoryPattern {

	public static void main(String[] args) {
		
		CarDealership carFactory1 = CarProducer.getFactory(false);
		
		CarFactory car1 = carFactory1.chooseBrand("Honda");
		
		car1.orderCar();
		
		CarFactory car2 = carFactory1.chooseBrand("Hyundai");
		
		car2.orderCar();
		
		CarFactory car3 = carFactory1.chooseBrand("Ford");
		
		car3.orderCar();
		
		CarFactory car4 = carFactory1.chooseBrand("Toyota");
		
		car4.orderCar();
		
		CarDealership carFactory2 = CarProducer.getFactory(true);
		
		CarFactory car5 = carFactory2.chooseBrand("Honda");
		
		car5.orderCar();
		
		CarFactory car6 = carFactory2.chooseBrand("Hyundai");
		
		car6.orderCar();
		
		CarFactory car7 = carFactory2.chooseBrand("Ford");
		
		car7.orderCar();
		
		CarFactory car8 = carFactory2.chooseBrand("Toyota");
		
		car8.orderCar();
		
	}

}
