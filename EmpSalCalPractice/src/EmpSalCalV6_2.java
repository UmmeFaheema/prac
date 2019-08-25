import java.util.Scanner;

public class EmpSalCalV6_2 {

	//Global Variables
	static final int maxEmployee = 5;
	
	static String[] nameOfEmployee = new String [maxEmployee];
	static double[] numberOfHourWorked = new double [maxEmployee];
	static double[] hourlyPayRate = new double [maxEmployee];
	
	static double grossPay;
	static double netPay;
	
	//Module 1
	public static void welcome() {
		System.out.println("*Employee Calculator*");
		System.out.println("Please follow the instructions");
		
	}
	
	//Module 2
	public static void getInput(int arrayCounter) {
		
		boolean isValid = false;
		
		//Taking input 1 - employee name
		Scanner namescanner = new Scanner(System.in);
		System.out.println("Enter employee name : ");
		nameOfEmployee[arrayCounter] = namescanner.nextLine();
		
		//Taking input 2 - total hour
		isValid = false;
		while(isValid == false) 
		{
			try
			{
		Scanner TotalHourscanner = new Scanner(System.in);
		System.out.println("Enter number of hours worked : ");
		numberOfHourWorked[arrayCounter] = TotalHourscanner.nextDouble();
		if(numberOfHourWorked[arrayCounter] >= 0 && numberOfHourWorked[arrayCounter] <= 80) {
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
		hourlyPayRate[arrayCounter] = HRscanner.nextDouble();
		if(hourlyPayRate[arrayCounter] >= 10 && hourlyPayRate[arrayCounter] <= 50)
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
	
	public static void calculateSalary(int arrayCounter) {
		grossPay = calculateGrossPay(arrayCounter);
		netPay = calculateNetPay();
	}
	
	//Module 3
	public static double calculateGrossPay(int arrayCounter) {
		return numberOfHourWorked[arrayCounter] * hourlyPayRate[arrayCounter];

	}
	
	//Module 4
	public static double calculateNetPay() {
		
		double tempNP = 0;
		
		if(grossPay > 0 && grossPay<1500) {
			tempNP = grossPay - 10;
		}
		else if(grossPay >= 1500 && grossPay < 3000) {
			tempNP = grossPay - 20;
		}
		else if(grossPay >= 3000 && grossPay < 4500) {
			tempNP = grossPay - 30;
		}
		else if(grossPay >= 4500 && grossPay < 6000) {
			tempNP = grossPay - 40;
		}
		else {
			System.out.println("Something is wrong.");
		}
		return tempNP;
		
	}
	
	
	//Module 5
	public static void displayOutput(int arrayCounter) {
		
		System.out.println("");
		
		System.out.println("*Pay Slip*");
		System.out.println("Employee name is : " + nameOfEmployee[arrayCounter]);
		System.out.println("Number of hours worked is : " + numberOfHourWorked[arrayCounter]);
		System.out.println("Hourly rate is : " + hourlyPayRate[arrayCounter]);
		System.out.println("Gross pay is : " + grossPay);
		System.out.println("Net pay is : " + netPay);
	
	}
	
	public static void displayTableHead() {
		
		System.out.println("-----------------");
		System.out.printf("%10s %30s %20s %10s %5s", "Employee name", "Total hour", "hourly rate", "gross pay", "net pay");
		System.out.println("");
		System.out.println("-----------------");
		
	}
	
	public static void displayTableData(int arrayCounter) {
		
		System.out.printf("%10s %30s %20s %10s %10s" , nameOfEmployee[arrayCounter], 
				numberOfHourWorked[arrayCounter], hourlyPayRate[arrayCounter], grossPay, netPay  );
		System.out.println("");
	}
	
	//menu choise to stop
	public static void displayMenueSelection(int arrayCounter) {
		Scanner scan; 
		scan = new Scanner(System.in);
		System.out.println("Select an action [Add(A) | Edit(E) | Delete(D)] : \t");
		
		String cMenueSelection = scan.nextLine();
		
		switch(cMenueSelection) {
		
		case "Add" :
			System.out.println("");
			System.out.println("Enter employee name, TotalHour worked & hourly rate information");
			
			getInput(arrayCounter);
			calculateSalary(arrayCounter);
			displayOutput(arrayCounter);
			break;
			
		case "Edit" :
			System.out.println("Edit information ");
			
		break;
		
		case "Delete" :
			System.out.println("Delete information ");
			
		break;
		
		default:
			System.out.println(cMenueSelection + "is not valid choose correct action");
		
		
			displayMenueSelection(arrayCounter);
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
		
		int arrayCounter = 0; //because array start from 0
		
		do {
			displayMenueSelection(arrayCounter);
			
			arrayCounter++;
			displayTableHead();
			
			
			
			if(doyouwanttocontinue() == false)
				break;
		}
		while(true);
		
		System.out.println("Existing");
		
		
	}

}
