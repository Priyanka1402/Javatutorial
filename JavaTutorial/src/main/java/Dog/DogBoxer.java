package Dog;

public class DogBoxer extends Dog{
	
	String temperament = "fearless";

	public DogBoxer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DogBoxer(String size, int le, String col) {
		super(size, le, col);
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void getInfo() {
		
		//super.getInfo();
		System.out.println(temperament+" "+size+" "+color+ " Dog would live for "+lifeExpectancy+" years");
	}

}
