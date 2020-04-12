/**
 * 
 */
/**
 * @author Priyanka_Devnani
 *
 */
package Dog;
public class Dog {
	
	//String Breed;
	String size;
	int lifeExpectancy;
	String color;
	
	public int runSpeed() {
		int speed = 0;
		
		return  speed;
	}
	
	
	public Dog() {
		
	}
	
	public Dog(String size,int le,String col) {
		this.size=size;
		this.lifeExpectancy=le;
		this.color=col;
		
		
	}
	
	public void getInfo() {
		
		System.out.println(size+" "+color+ " Dog would live for "+lifeExpectancy+" years");
		
		
	}
	
	
	
	
	
	
	
//	public String getInfo() {
//		return ("Breed is "+Breed+" Size is "+size+" Color is "+color+" Age is "+age+"" );
//	} 
//	
//	public static void main(String[] args) {
//		Dog maltese = new Dog();
//		maltese.age = 2;
//		maltese.Breed = "Maltese";
//		maltese.size = "small";
//		maltese.color = "white";
//		System.out.println(maltese.getInfo());
//		}
	
}