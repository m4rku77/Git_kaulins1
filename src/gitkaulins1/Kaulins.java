package gitkaulins1;

import java.util.Random;

public class Kaulins {
	static void mestKaulinu() {
		int skaitlis;
		
		Random rand = new Random();
		skaitlis = rand.nextInt(6)+1;
		System.out.print("Tu uzmeti: "+skaitlis);

	}
	
	
	public static void main(String[] args) {
		mestKaulinu();
		
	
	}

}
