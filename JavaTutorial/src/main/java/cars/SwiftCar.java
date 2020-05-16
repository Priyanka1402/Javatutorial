package cars;

public class SwiftCar extends Car{
	
	
	

	public SwiftCar(String colour, String engine, String gear) {
		super(colour, engine, gear);
		// TODO Auto-generated constructor stub
	}
	
	public void applyBreak(int speed) {
		
		System.out.println("This car has ABS system and you can apply breaks at any speed. Breaks applied\n");
		
	}
	
	
	

}
