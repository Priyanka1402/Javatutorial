/**
 * 
 */
/**
 * @author Priyanka_Devnani
 *
 */
package Dog;
public class Dog {
	
	String Breed;
	String size;
	int age;
	String color;
	
	public String getInfo() {
		return ("Breed is "+Breed+" Size is "+size+" Color is "+color+" Age is "+age+"" );
	} 
	
	public static void main(String[] args) {
		Dog maltese = new Dog();
		maltese.age = 2;
		maltese.Breed = "Maltese";
		maltese.size = "small";
		maltese.color = "white";
		System.out.println(maltese.getInfo());
		}
	
}