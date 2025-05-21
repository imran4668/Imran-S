package programmingRound;

import java.util.Scanner;

public class program3 {
	public static void main(String[] args) {
		Scanner get=new Scanner(System.in);
		System.out.println("Enter the No");
		int x=get.nextInt();
		x=x%2==0?x-1:x;
		for(int i=1;x!=0;i++) {
			if(i%2==1) {
				System.out.print(i+",");x--;
			}

				
				
			}
		}
		
		
	}


