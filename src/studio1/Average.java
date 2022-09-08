package studio1;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scnr = new Scanner(System.in);
		System.out.println("The first of two integers to be averaged");
		int n1 = scnr.nextInt();
		int n2 = scnr.nextInt();
		double D = 2;
		double nmean = (n1 + n2)/D;
		System.out.println("Your average is " + nmean);
	}

}
