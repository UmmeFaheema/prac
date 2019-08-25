import java.util.Scanner;

public class EmpSalCal4 {

	//Global Variables
	static String nameOfEmployee;
	static double numberOfHourWorked;
	static double hourlyPayRate;
	static double grossPay;
	static double netPay;
	
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
	
	//Module 3
	public static void calculateGrossPay() {
		grossPay = numberOfHourWorked * hourlyPayRate;

	}
	
	//Module 4
	public static void calculateNetPay() {
		
		if(grossPay<1500) {
			netPay = grossPay - 10;
		}
		else if(grossPay >= 1500 && grossPay < 3000) {
			netPay = grossPay - 20;
		}
		else if(grossPay >= 3000 && grossPay < 4500) {
			netPay = grossPay - 30;
		}
		else if(grossPay >= 4500 && grossPay < 6000) {
			netPay = grossPay - 40;
		}
		else {
			System.out.println("Something is wrong.");
		}
		
	}
	
	
	//Module 5
	public static void displayOutput() {
		
		System.out.println("");
		
		System.out.println("*Pay Slip*");
		System.out.println("Employee name is : " + nameOfEmployee);
		System.out.println("Number of hours worked is : " + numberOfHourWorked);
		System.out.println("Hourly rate is : " + hourlyPayRate);
		System.out.println("Gross pay is : " + grossPay);
		System.out.println("Net pay is : " + netPay);
	
	}
	
	
	public static void main(String[] args) {

		welcome();
		
		int maxEmployee = 5;
		
		for(int i = 1; i<= maxEmployee; i++)
		{
		System.out.println("Calculating salary for employee number("+i+")");
			
		getInput();
		calculateGrossPay();
		calculateNetPay();
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
