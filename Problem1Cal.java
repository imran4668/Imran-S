package programmingRound;

import java.util.Scanner;

public class Problem1Cal {
	
	
public static String add(double a , double b) {
		
		double c=a+b;
		return a +" "+b+" ="+c;
	}
public static String sub(double a , double b) {
		
		double c=a-b;
		return a +" "+b+" ="+c;
	}
public static String mul(double a , double b) {
	
	double c=a*b;
	return a +" "+b+" ="+c;
}
public static String div(double a , double b) {
	
	double c=a/b;
	return a +" "+b+" ="+c;
}

public static void main(String[] args) {
	
	boolean flag=true;
	while(true) {
		
		
		System.out.println("Welcome to calculator");
		Scanner get=new Scanner(System.in);
		
				
		System.out.println("ENter the Value of a");
		double a=get.nextInt();
		System.out.println("ENter the Value of b");
		double b=get.nextInt();
		
		System.out.println("select the option \n1.add \n2.sub \n3.mul \n4.div \n5.close");
		int choose=get.nextInt();
		
		switch(choose) {
		case 1: System.out.println(add(a,b)); break;
		case 2: System.out.println(sub(a,b)); break;
		case 3: System.out.println(mul(a,b)); break;
		case 4: System.out.println(div(a,b)); break;
		case 5: System.out.println("closed");flag=false;break;
		default: System.out.println("Invalid option");
		}
		
}
		
}
}
