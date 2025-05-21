package programmingRound;

import java.util.Scanner;

public class Program2 {
public static void main(String[] args) {
	
	Scanner get=new Scanner(System.in);
	System.out.println("Enter the  X number");
	int x = get.nextInt();
	
	for(int i=1;x!=0;i++) {
		if(i%2==1) {
			System.out.print(i+",");x--;
		}
	}
	
	
}
}
