package cars;

import java.util.ArrayList;

public class Car {

	public String color ="Whilte";
	private String engineType ="Petrol";
	public String gearType = "manual";

	
	
	
	
	


	public String getEngineType() {

		return this.engineType;
	}





	//Car car = new Car("yellow", "Manual", "Petrol");

	public  Car(String colour, String engine, String gear) {
		
		this.color=colour;
		this.engineType=engine;
		this.gearType=gear;
		congrats();
		
		


	}

	public void applyBreak(int speed) {

		if(speed>120) {
			System.out.println("Put down the accelerator and then apply break.\n");
		}
		else {
			System.out.println("Breaks applied");
			
		}
		

	}

	public void shiftGear(int baseGear, int finalGear) {


		System.out.println("Gear has been shifted from " + baseGear +" to "+finalGear);


	}

	public void congrats() {

		System.out.println("Congratulations on your new car purchase. Visit again\n");

	}



}
