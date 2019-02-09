package homwork_2_1;

public class TestLaptop {

	public static void main(String[] args) {
		Laptop joe = new Laptop(15.6);
		joe.setLaptopSize(15.6);
		joe.getLaptopSize();
				
		Laptop joe2 = new Laptop("Toshiba");
		joe2.setLaptopBrand("Dell");
		joe2.getLaptopBrand();
		
		System.out.println(" ");
		
		
		Laptop kan = new Laptop(17.2);
		kan.setLaptopSize(17.2);
		kan.getLaptopSize();
		
		Laptop kan2 = new Laptop("Toshiba");
		kan2.setLaptopBrand("Lenovo");
		kan2.getLaptopBrand();

		System.out.println(" ");
	
		Laptop.turnOnLaptop();
		
	}

}
