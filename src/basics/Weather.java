package basics;

public class Weather {
public static void main(String[] args) {
	
	//THis program will give suggestions of what to wear based on the weather(temperature)
	
	int temperature= 80;
	String sunCondition = "overcast";
	
	if(temperature>80) {
		System.out.println("Dont go outside");
	} else if((temperature>60) && (sunCondition=="Sunny")) {
		System.out.println("too hot");
	} else if((temperature>50) || (sunCondition=="overcast")){
		System.out.println("a cool day and dont forget to wear sweater");
	} else {
	  System.out.println("looks a bit cold oujtisde");
	}
	System.out.println("The program is ending");
}
}
