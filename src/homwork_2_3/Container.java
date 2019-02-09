package homwork_2_3;

import java.util.Scanner;

public class Container {

	public static void main(String[] args) {
		System.out.println("Please, enter the valus you want to fiil up your array:");
		Scanner array = new Scanner(System.in);
		int [] val = new int[8];
		for (int i=0; i<8 ; i++) {
				val[i] = array.nextInt();
		}
		
		System.out.println("Here are your numbers:");
		for (int j=1; j<9 ; j++) {
			System.out.println(j+"-"+val[j]);
			
	}
		array.close();
}
}