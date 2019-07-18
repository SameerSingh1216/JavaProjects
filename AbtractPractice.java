
public class AbtractPractice {
	
	public static void main(String []args) {
		Iphone obj = new Iphone();
		//obj.DisplayConfig();
		Samsung obj1 = new Samsung();
		//obj1.DisplayConfig();
		//showIphoneConfig(obj);
		showSamConfig(obj1);
		showSamConfig(obj);
		
	}
	
//	public static void showIphoneConfig(Iphone obj) {
//		obj.DisplayConfig();
//		
//	}
	public static void showSamConfig(Phone obj1) {
		obj1.DisplayConfig();
	}
	
}

abstract class Phone {
	abstract void DisplayConfig();
}

class Iphone extends Phone{
	
	void DisplayConfig() {
		System.out.println("Hi....2GB RAM and 64GB Storage");
	}
	
}

class Samsung extends Phone{
	void DisplayConfig( ) {
		System.out.println("HI...2GB RAM, 128GB Storage");
	}
}
