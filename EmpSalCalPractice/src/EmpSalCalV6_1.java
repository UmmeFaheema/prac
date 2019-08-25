import java.util.Scanner;

public class EmpSalCalV6_1 {

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
	
	public static void calculateSalary() {
		grossPay = calculateGrossPay();
		netPay = calculateNetPay();
	}
	
	//Module 3
	public static double calculateGrossPay() {
		return numberOfHourWorked * hourlyPayRate;

	}
	
	//Module 4
	public static double calculateNetPay() {
		
		double tempNP = 0;
		
		if(calculateGrossPay() > 0 && calculateGrossPay()<1500) {
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
		System.out.println("Gross pay is : " + grossPay);
		System.out.println("Net pay is : " + netPay);
	
	}
	
	public static void displayMenueSelection() {
		Scanner scan; 
		scan = new Scanner(System.in);
		System.out.println("Select an action [Add(A) | Edit(E) | Delete(D)] : \t");
		
		String cMenueSelection = scan.nextLine();
		
		switch(cMenueSelection) {
		
		case "Add" :
			System.out.println("");
			System.out.println("Enter employee name, TotalHour worked & hourly rate information");
			
			getInput();
			calculateSalary();
			displayOutput();
			
		case "Edit" :
			System.out.println("Edit information ");
			
		break;
		
		case "Delete" :
			System.out.println("Delete information ");
			
		break;
		
		default:
			System.out.println(cMenueSelection + "is not valid choose correct action");
		
		
			displayMenueSelection();
		}
		
		
	}
	
	public static boolean doyouwanttocontinue() {
		
		Scanner scan;
		scan = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("Do you want to continue [No (N) | Yes (Y)] \t");
		char cContinue = scan.next().charAt(0);
		if(Character.toUpperCase(cContinue) == 'Y') {
			return true;
		}
		
		return false;
		
	}
	
	
	public static void main(String[] args) {

		welcome();
		
		int counter = 0;
		
		do {
			displayMenueSelection();
			if(doyouwanttocontinue() == false)
				break;
		}
		while(true);
		
		System.out.println("Existing");
		
		
	}

}
