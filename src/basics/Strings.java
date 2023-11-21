package basics;

public class Strings {

	public static void main(String[] args) {
		String wordChoice;
		String bookTitle= "ring";
		
		wordChoice = "Lords of the ringso";
		if(wordChoice.contains(bookTitle)){
			System.out.println("this contains the word "+bookTitle);
		} else {
			System.out.println("this doesn't contains the word "+bookTitle);
		}
		
		String browser = "Chupa";
		//if (browser=="chrome")
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("This browser is chrome.");
		} else {
			System.out.println("nothing");
		}
		
		String firstName = "utkarsh";
		String lastName = "tiwari";
		String ssn = "7982655906";
		
		System.out.println("There are "+ssn.length()+" digits in your ssn.");
		
		//Print the initials plus last four digits of ssn
		System.out.println(firstName.substring(0,4)); //this 0 is the starting index number of a string eg: u-->0 and k--->3
		System.out.println(lastName.substring(0,5));
		System.out.println(ssn.substring(6));
		
		

	}

}