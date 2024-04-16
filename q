[1mdiff --git a/bin/gitkaulins1/Kaulins.class b/bin/gitkaulins1/Kaulins.class[m
[1mindex 87f919e..1ac0305 100644[m
Binary files a/bin/gitkaulins1/Kaulins.class and b/bin/gitkaulins1/Kaulins.class differ
[1mdiff --git a/src/gitkaulins1/Kaulins.java b/src/gitkaulins1/Kaulins.java[m
[1mindex 443995b..5227437 100644[m
[1m--- a/src/gitkaulins1/Kaulins.java[m
[1m+++ b/src/gitkaulins1/Kaulins.java[m
[36m@@ -1,10 +1,15 @@[m
 package gitkaulins1;[m
 [m
[32m+[m[32mimport java.util.Random;[m
[32m+[m
 public class Kaulins {[m
 [m
 	public static void main(String[] args) {[m
[31m-		// TODO Auto-generated method stub[m
[31m-[m
[32m+[m		[32mint skaitlis;[m
[32m+[m[41m		[m
[32m+[m		[32mRandom rand = new Random();[m
[32m+[m		[32mskaitlis = rand.nextInt(6)+1;[m
[32m+[m		[32mSystem.out.print("Tu uzmeti: "+skaitlis);[m
 	}[m
 [m
 }[m
