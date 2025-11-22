//LeviVinson
import java.util.Scanner;
public class Lab7 {

	public static void main(String[] args) {
		//my arrays 
		double[] days = new double[7];
		
		double total = 0;
		
		Scanner key = new Scanner(System.in);
		
		//enter the gas price across the seven days
		for(int i = 0; i < days.length; i++)
			
		{
			System.out.println("Enter the gas price on day " + (i + 1)+ ":");
			days[i]= key.nextDouble();
			total += days[i];
		}
		
		//average formula
		double average = total/7;
		//print out average 
		System.out.println("\nThe average gas price is $" + String.format("%.2f", average ));
		key.close();
		//print out above average gas prices
		System.out.println("\nDays with above avegrae gas prices:");
		
		for (int i = 0; i < days.length; i++) {
			if (days[i] > average)
			System.out.printf("Day %d: $%.2f%n", (i + 1), days[i]);
		}
		
	}

}
