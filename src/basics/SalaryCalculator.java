package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
	//let's create a variable to define our career
	
	//declare a  variable
	String career;
	System.out.println("Program is starting......");
	
	//Defined a variable
	career = "software developer";
	System.out.println("my career is: "+ career);
	
	//Declare & Define
	int hoursPerWeek = 40;
	int weeksPerYear = 50;
	double rate      = 42.50;
	
	double Salary = hoursPerWeek*weeksPerYear*rate;
	System.out.println("My salary as a "+career+ " is: "+Salary);
	
	//Compute our annual salary
	
	//rate *hoursPerWeek * weeksPerYear
	}
}
