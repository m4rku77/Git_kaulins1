package gitkaulins1;

import java.util.Random;

public class Kaulins {
	static void mestKaulinu(int reizes) {
		int skaitlis;
		
		Random rand = new Random();
		for(int i=0; i<reizes; i++) {
			skaitlis = rand.nextInt(6)+1;
			System.out.println("Tu uzmeti: "+skaitlis);
		}
	}
	
	
	public static void main(String[] args) {
		mestKaulinu(5);
		
	
	}

}
