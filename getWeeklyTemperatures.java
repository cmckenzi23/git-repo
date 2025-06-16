package com.csuprojects.model;
import java.util.ArrayList; 
import java.util.Scanner; 
import java.util.*; 
/* Develop a program that will store data in the form of daily average temperatures
 * for one week. Store the day and average temperature in two different arraylists. 
 * Your program should prompt the user for the day of the week
 * (Monday through Sunday) and display both the day and temperature for each day.
 * If "week" is entered, the output for your program should provide the temperature for each 
 * day and the weekly average. use the looping and decision constructs in combination 
 * with the arrays to complete this assignment.  
 */
public class getWeeklyTemperatures 
{
	public static void main (String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int temperatureTotal = 0; 
		int temperatureAverage = 0;
		
		Integer temperatures = 0; 
		String days; 
		String close; 
		
		ArrayList<Integer> temperatureList = new ArrayList<Integer>();
		ArrayList<String> dayList = new ArrayList<String>();
		
		System.out.println("Enter days, type 'D' when done");

		while(true)
			{
				days = scanner.nextLine();
				if(days.equalsIgnoreCase("D"))
				{break;}
				dayList.add(days);
			}
		
			System.out.println("Enter temps, type '0' when done");
		while(true)
			{
				temperatures = scanner.nextInt();
				temperatureList.add(temperatures);
				temperatureTotal = temperatureTotal + temperatures;
				if(temperatures == 0)
				{break;}
				scanner.nextLine();
			}
			System.out.println("Days: " + dayList);
			System.out.println("Temps: " + temperatureList );
		
		while (true) 
			{
				close = scanner.nextLine();
				if(close.equals("week"))
				{
					temperatureAverage += temperatureTotal / temperatureList.size();
					System.out.print("Average temperature: " + temperatureAverage); 
				}
				else
				{System.out.println("You entered: " + close + ". Please enter 'week'");				}
			}
		}
		
}