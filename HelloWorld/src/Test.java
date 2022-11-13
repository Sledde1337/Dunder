import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner (System.in);
		System.out.println("What is the employee´s name?");
		String name = myScanner.nextLine();
		String output = "What is their hourly rate?";
		System.out.println(output);
		int hourlyRate = myScanner.nextInt();
		String output2 = "How many hours did they work this month?";
		System.out.println(output2);
		int hours = myScanner.nextInt();
		String output3 = "Calculating...";
		System.out.println(output3);
		PaymentSlip calculator = new PaymentSlip();
		int calculateSalary = calculator.calculateSalary(hourlyRate, hours);
		double calculateNetSalary = calculator.calculateNetSalary(hourlyRate, hours);
		String output4 = "----------\n ## PAYMENT INFORMATION ## \n \n Name: \t \t" + name + "\n Hourly rate: \t" + '$' + hourlyRate + "\n Hours worked: \t" + hours + "\n \n Salary before tax:\t" + '$' + calculateSalary + "\n Salary after tax:\t" + '$' + calculateNetSalary + "\n If you have any questions regarding your salary, contact Bob \n --------" ;
		System.out.println(output4);
		
		
		
		
		
		
		
		
		
	} 

}
