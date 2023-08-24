
public class CarProducer {
	
	public static CarDealership getFactory(boolean manila){
		
		if(manila){
			return new ManilaFactory();
		}
		else{
			return new CaviteFactory();
		}
	}
}
