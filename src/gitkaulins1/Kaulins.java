package gitkaulins1;

import java.util.Random;
import java.util.Scanner;

public class Kaulins {
<<<<<<< HEAD

	public static void main(String[] args) {
		int skaitlis, reizes;
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("Cik reizes mes kauliņi?");
		reizes = scan.nextInt();
		
=======
	static void mestKaulinu(int reizes) {
		int skaitlis;
		
		Random rand = new Random();
>>>>>>> idejuZars
		for(int i=0; i<reizes; i++) {
			skaitlis = rand.nextInt(6)+1;
			System.out.println("Tu uzmeti: "+skaitlis);
		}
<<<<<<< HEAD
=======
	}
	
	
	public static void main(String[] args) {
		mestKaulinu(5);
		
	
>>>>>>> idejuZars
	}

}
