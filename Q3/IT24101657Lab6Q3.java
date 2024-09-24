import java.util.Scanner;

public class IT24101657Lab6Q3{
	
	public static void main(String[]args){
			
		Scanner input = new Scanner (System.in);
		int count = 0;
		double sumofsquares = 0;
		
		System.out.println("Enter positive integers (terminate with -99):");
		
		while(true){
			int num = input.nextInt();
			
			if(num == -99){
				break;
			}
			
			if (num<0){
				System.out.println("Please enter a positive integer or -99 to terminate");
				continue;
			}
			
			sumofsquares = sumofsquares + Math.pow(num,2);
			count = count + 1;
		}
		if(count>0){
			double rms = Math.sqrt(sumofsquares / count );
			System.out.println("The RootMean Square (RMS) is:" + rms);
		}
		
		else{
			System.out.println("No positive integers were entered.");
		}
		
		input.close();
		
		
	}
}