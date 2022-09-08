package studio1;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("What year do you wish to see is a leap year?");
		int year = scnr.nextInt();
		double d = 4;
		double y = 100;
		double y400 = 400;
		double test = year%d;
		double test2 = year%100;
		double test3 = year%y400;
		boolean leapYear = (test==0) && (test2!=0) || (test3==0);
		System.out.println(leapYear);
		

	}

}
