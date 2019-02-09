package homwork_2_1;

public class Laptop {
	
	 double size;
	 String laptopBrand  ;
	 static double hardDriveCapacity = 512;
	
			// Constructor 1
	public Laptop () { 
	}
	
			// Constructor 2
	public Laptop (double size) {    //
		this.size = size;
		System.out.println("your laptop's size is:"+size +"inch");
	}
			// Constructor 3
	public Laptop (String laptopBrain) {
		this.laptopBrand = laptopBrand;
	}
	
	public void setLaptopSize (double size) {
	this.size = size;
	}
	
	public double getLaptopSize () {
		return size;
	}
	
	
	public void setLaptopBrand (String laptopBrand) {
		this.laptopBrand = laptopBrand;
		}
		
		public String getLaptopBrand () {
			System.out.println("Your laptop;s brand is:" +laptopBrand);
			return laptopBrand;
		}
		
	public static void turnOnLaptop() {
		System.out.println("Welcome, the Laptop is ON");
	}
}
