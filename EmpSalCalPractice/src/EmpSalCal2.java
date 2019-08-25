import java.util.Scanner;

public class EmpSalCal2 {

	//Global Variables
	static String nameOfEmployee;
	static double numberOfHourWorked;
	static double hourlyPayRate;
	static double grossPay;
	
	//Module 1
	public static void welcome() {
		System.out.println("*Employee Calculator*");
		System.out.println("Please follow the instructions");
		
	}
	
	public static void getInput() {
		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("Enter employee name : ");
		nameOfEmployee = myscanner.nextLine();
		
		System.out.println("Enter number of hours worked : ");
		numberOfHourWorked = myscanner.nextDouble();
		
		System.out.println("Enter hourly rate : ");
		hourlyPayRate = myscanner.nextDouble();
		
	}
	
	public static void process() {
		grossPay = numberOfHourWorked * hourlyPayRate;

	}
	
	public static void displayOutput() {
		
		System.out.println("");
		
		System.out.println("*Pay Slip*");
		System.out.println("Employee name is : " + nameOfEmployee);
		System.out.println("Number of hours worked is : " + numberOfHourWorked);
		System.out.println("Hourly rate is : " + hourlyPayRate);
		System.out.println("Gross pay is : " + grossPay);
	
	}
	
	
	public static void main(String[] args) {

		welcome();
		getInput();
		process();
		displayOutput();
		
	}

}
