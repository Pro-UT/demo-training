package basics;

public class NumbersCalc {
 public static void main(String[] args) {
	 printName(); //Okay, so this line is going to go call ----look down
	 int num1= 3;
	 int num2= 5;
	 addNumbers(num1,num2);
//	System.out.println("The product of "+num1+" and "+num2+" is "+multiplyNumbers(num1,num2));    
	 //or
	  //multiplyNumbers(num1,num2);
	 //or
	 int product = multiplyNumbers(num1,num2);
	 System.out.println(" the multiple of "+num1+" and "+num2+" is "+multiplyNumbers(num1,num2));
 }
 //We're going to call this static.And instead of returning void.So void means we're not we're not going to return anything, Right?
//So you've seen this void a couple of times.Void means we're going to do some work and get out.
//There's going to be no return for multiple multiplied numbers.
	 
	 //Methods //this function right there.-----
	 static void printName() {         //function with no parameters and no return types.
	  System.out.println("My name is Utkarsh");
	 }
	 
	 
	 
    static void addNumbers(int number1, int number2) { //function with parameters and no return type.
    	//This function will add 2 numbers
    	int sum= number1 + number2;
    	System.out.println("the sum of "+number1+" and "+number2+" is "+sum);
    }
    
    

    static int multiplyNumbers(int numberA,int numberB) { //functions with both  parameter and return type
    	int total= numberA*numberB;
    //you can print here or you can also print it in the MAIN funct
    	//	System.out.println("the multiple of "+numberA+" and "+numberB+ " is "+total );
        return total;
    }
    //return is it's going to take this value and give that back to this expression and this function, right? 
    //So this function is going to evaluate.It's actually going to be simplified to this integer value, which we're going to 
    //pass product into it.
	 
	 
}
