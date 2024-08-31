import java.util.Scanner;

public class IT24101657Lab6Q2C{
	
	public static void main(String[]args){
		
	Scanner input = new Scanner(System.in);

	int[] numbers = new int[10];
	int sum = 0;
	double average;
	int i=0;
	
	System.out.println("Please enter 10 numbers:");
	
	while(i<10){
		System.out.print("Enter number" + (i+1) + ": " );
		numbers[i]=input.nextInt();
		sum += numbers[i];
		i++;
	}	
	
	average = sum / 10.0;
	System.out.println("The numbers you entered are:");
	i=0;
	
	while(i<10){
		System.out.print(numbers[i]+ " " );
		i++;
		
	} 
	
	System.out.println("\nsum of Numbers: " + sum);
	System.out.println("Average of Numbers: " + average);
	
	}
}
                                                                                                                                                   