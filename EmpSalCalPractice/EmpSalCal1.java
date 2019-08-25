import java.util.Scanner;

public class EmpSalCal1 {

	public static void main(String[] args) {

		String nameOfEmployee;
		double numberOfHourWorked;
		double hourlyPayRate;
		double grossPay;
		
		System.out.println("*Employee Calculator*");
		System.out.println("Please follow the instructions");
		
		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("Enter employee name : ");
		nameOfEmployee = myscanner.nextLine();
		
		System.out.println("Enter number of hours worked : ");
		numberOfHourWorked = myscanner.nextDouble();
		
		System.out.println("Enter hourly rate : ");
		hourlyPayRate = myscanner.nextDouble();
		grossPay = numberOfHourWorked * hourlyPayRate;
		
		System.out.println("");
		
		System.out.println("*Pay Slip*");
		System.out.println("Employee name is : " + nameOfEmployee);
		System.out.println("Number of hours worked is : " + numberOfHourWorked);
		System.out.println("Hourly rate is : " + hourlyPayRate);
		System.out.println("Gross pay is : " + grossPay);
		
		
		
	}

}
