package ch11_6;

public class Main {

	public static void main(String[] args) {
		
		Employee kent = new Employee(5);
		LaborItem laborItem = new LaborItem(5, kent);
		System.out.println("LaborItem: " + laborItem);
	}
}
