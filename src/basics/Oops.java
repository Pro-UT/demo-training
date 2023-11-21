package basics;


class Person {
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name+" is walking");
	}
	
	void eat() {
		System.out.println(email);
	}
	
	void sleep() {
		System.out.println(name+" is sleeping");
	}
}

public class Oops {

	public static void main(String[] args) {
		
		//instantiating an object
		Person person1 = new Person();
		
		//Define some properties
		person1.name = "Ronaldo";
		person1.email= "CR7@gmail.com";
		person1.phone ="7777777777";
		
		
		//Abstraction
		person1.walk();
		//person1.eat();
		//person1.sleep();
		
		
		Person person2 = new Person();
		
		person2.name= "Sarah";
		person2.sleep();
		
		
		/*
		//Person
		
		//attributes,variables, adjectives, descriptors
		String name = "Utkarsh";
		String email = "utkarshs777@gmail.com";
		String phone = "7982655906";
		
		//Action, Activity,Behavior
		//System.out.println(name+" is walking");
		walking(name);
		System.out.println(name+" is eating");
		
		//What if we wanted to do this for another person?
		String name2 = "Utkarsh22222";
		String email2 = "utkarshs777@gmail.com";
		String phone2 = "7982655906";
		
		//Action, Activity,Behavior
		walking(name2);
		System.out.println(name2+" is eating");
		
		
		//What about binding properties and attributes together?
		
	}
	
	static void walking(String name ) {
		System.out.println(name+" is talking");

	*/
	}

}
