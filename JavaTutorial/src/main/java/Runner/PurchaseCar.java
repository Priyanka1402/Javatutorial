package Runner;

import java.util.Scanner;

import cars.Car;
import cars.SwiftCar;

public class PurchaseCar {

	public static void main(String[] args) {


//		System.out.println("Good Morning. Whats your name?");
//
//		Scanner sc=new Scanner(System.in);
//
//		String name=sc.next();
//
//		System.out.println("Hi "+name+", What kind of Car you want to purchase? (1) Swift, (2) Ignis, (3) Celerio");
//		
//		int choice= sc.nextInt();
		
		Car car = new SwiftCar("Yellow", "Diesel", "Manual");//1. object car is assigned to instance of SwifCar
		
		car.applyBreak(130);
		
		car=new Car("Yellow", "Diesel", "Manual");// 2. object car is assigned to instance of Car class.
		
		
		car.applyBreak(130);
		


	}
}