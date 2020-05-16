package Runner;

public class MyFirst {
	
	

	public static void main(String[] args) {
		
		
		
		if (args.length>0) {
			for (String arg : args  ) {
				
				System.out.println(arg);
				
			}
		}
		
		System.out.println("Theres are "+args.length+" elements in args");
		
		sayHello("DIllip");

	}
	
	
	public static void  sayHello(String name) {
		
		System.out.println("Hello "+name);
		
	}

}
