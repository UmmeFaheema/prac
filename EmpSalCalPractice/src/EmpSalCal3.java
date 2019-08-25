import java.util.Scanner;

public class EmpSalCal3 {

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
		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("Enter employee name : ");
		nameOfEmployee = myscanner.nextLine();
		
		System.out.println("Enter number of hours worked : ");
		numberOfHourWorked = myscanner.nextDouble();
		
		System.out.println("Enter hourly rate : ");
		hourlyPayRate = myscanner.nextDouble();
		
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
		getInput();
		calculateGrossPay();
		calculateNetPay();
		displayOutput();
		
	}

}
