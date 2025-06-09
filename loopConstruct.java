import java.util.Scanner;

public class loopingConstruct {

	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		 
		double userValue; 
		double maxValue; 
		double minValue; 
		double valuesSum;
		double numValues;
		double interestAdded; 
		
		System.out.println("Enter values: ");
		
		userValue = scanner.nextDouble();
		maxValue = userValue;
		minValue = userValue; 
		
		valuesSum = 0; 
		numValues = 0; 
		interestAdded = 0; 
		
		while (userValue > 0){
			if (userValue > maxValue) 
			{
				maxValue = userValue;
			}
			if (userValue < minValue)
			{
				minValue = minValue; 
			}
			valuesSum = valuesSum + userValue; 
			numValues = numValues + 1;
			interestAdded = (valuesSum * .20) + valuesSum; 
			userValue = scanner.nextDouble();
		}
		System.out.println("Sum: " + valuesSum);
		System.out.println("Average: " + (valuesSum / numValues));
		System.out.println("Max Value: " + maxValue );
		System.out.println("Min Value: " + minValue );
		System.out.println("Interest on total at 20%: " + interestAdded ); 
	}
}