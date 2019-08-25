import java.util.Scanner;

public class EmpSalCal5 {

	//Global Variables
	static String nameOfEmployee;
	static double numberOfHourWorked;
	static double hourlyPayRate;
//	static double grossPay;
//	static double netPay;
	
	//Module 1
	public static void welcome() {
		System.out.println("*Employee Calculator*");
		System.out.println("Please follow the instructions");
		
	}
	
	//Module 2
	public static void getInput() {
		
		boolean isValid = false;
		
		//Taking input 1 - employee name
		Scanner namescanner = new Scanner(System.in);
		System.out.println("Enter employee name : ");
		nameOfEmployee = namescanner.nextLine();
		
		//Taking input 2 - total hour
		isValid = false;
		while(isValid == false) 
		{
			try
			{
		Scanner TotalHourscanner = new Scanner(System.in);
		System.out.println("Enter number of hours worked : ");
		numberOfHourWorked = TotalHourscanner.nextDouble();
		if(numberOfHourWorked >= 0 && numberOfHourWorked <= 80) {
			isValid = true;
		}
		else {
			isValid = false;
			System.out.println("The value is not valid. Please enter [0-80]");
			}
		}	
			catch(Exception e) {
				System.out.println("The input is a number. Please enter [0-80]");
			}
		}
		
		//Taking input 3 - hourly pay rate
		isValid = false;
		while(isValid == false)
		{
			try
			{
		
		Scanner HRscanner = new Scanner(System.in);
		System.out.println("Enter hourly rate : ");
		hourlyPayRate = HRscanner.nextDouble();
		if(hourlyPayRate >= 10 && hourlyPayRate <= 50)
		{
			isValid = true;
		}
		else
		{
			isValid = false;
			System.out.println("The value is not valid. Please enter[10-50]");
		}
	}	
			catch(Exception e)
			{
				System.out.println("The input is a number. Please enter [10-50]");
			}
		}	
	}
	
	public static void calculateSalary() {
		calculateGrossPay();
		calculateNetPay();
	}
	
	//Module 3
	public static double calculateGrossPay() {
		return numberOfHourWorked * hourlyPayRate;

	}
	
	//Module 4
	public static double calculateNetPay() {
		
		double tempNP = 0;
		
		if(calculateGrossPay()<1500) {
			tempNP = calculateGrossPay() - 10;
		}
		else if(calculateGrossPay() >= 1500 && calculateGrossPay() < 3000) {
			tempNP = calculateGrossPay() - 20;
		}
		else if(calculateGrossPay() >= 3000 && calculateGrossPay() < 4500) {
			tempNP = calculateGrossPay() - 30;
		}
		else if(calculateGrossPay() >= 4500 && calculateGrossPay() < 6000) {
			tempNP = calculateGrossPay() - 40;
		}
		else {
			System.out.println("Something is wrong.");
		}
		return tempNP;
		
	}
	
	
	//Module 5
	public static void displayOutput() {
		
		System.out.println("");
		
		System.out.println("*Pay Slip*");
		System.out.println("Employee name is : " + nameOfEmployee);
		System.out.println("Number of hours worked is : " + numberOfHourWorked);
		System.out.println("Hourly rate is : " + hourlyPayRate);
		System.out.println("Gross pay is : " + calculateGrossPay());
		System.out.println("Net pay is : " + calculateNetPay());
	
	}
	
	
	public static void main(String[] args) {

		welcome();
		
		int maxEmployee = 5;
		
		for(int i = 1; i<= maxEmployee; i++)
		{
		System.out.println("Calculating salary for employee number("+i+")");
			
		getInput();
		calculateSalary();
		displayOutput();
		
		if(i == maxEmployee) {
			break;
		}
		Scanner scan = new Scanner(System.in);
		String doyouwanttocontinue;
		System.out.println("Do you want to continue (type no to stop) : ");
		doyouwanttocontinue = scan.next();
		if(doyouwanttocontinue.equals("no"));
		{
			break;
		}
		}
		
		System.out.println("Existing");
		
		
	}

}
