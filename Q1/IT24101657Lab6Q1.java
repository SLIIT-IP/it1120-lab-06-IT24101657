import java.util.Scanner;

public class IT24101657Lab6Q1{

	public static void main(String[]args){

		Scanner input = new Scanner(System.in);

		int number;
		System.out.print("Enter a number:");
		number = input.nextInt();
		System.out.println(" ");

		double square = (Math.pow(number,2));
		System.out.println("The square of "+ number +" is :"+square);

		double squareRoot = Math.sqrt(number);
		System.out.print("The square root of "+ number +" is :"+squareRoot);
		
		
	}

}
	