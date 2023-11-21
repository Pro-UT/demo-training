package basics;

public class Cities {

	public static void main(String[] args) {
//1.		//Declare and Define an array(implicit Define)
		String[] cities= {"New York","Chicago","Dallas"};
		System.out.println(cities[2]);
		
		
		
//3.		//Declare Array
		String[] countries;
		
		//Define the Array
		countries = new String[2];
		countries[0]="India";
		countries[1]="USA";
		System.out.println(countries[0]);
		
		
		System.out.println("******************************************************");
		
		
//2.		// Declare and Define the array(explicit)(only size)
				String[] states = new String[5]; 
				states[0]="Delhi";
				states[1]="UP";
				states[2]="MP";
				states[3]="HP";
				states[4]="Kerela";
			//	System.out.println(states[3]);		
			 	
				int i=0;
			//  Do Loop: enters the loop THEN tests condition
				do { System.out.println(states[i]);
		         i=i+1;
		         } while(i<5);
		    //  While Loop: tests condition first then enters loop
				int n= 0;
				boolean statefound = false;
				while(!statefound) {
					String state = states[n];
					System.out.println(state);
					if(state=="HP") {
						System.out.println("STATE FOUND");
					statefound = true;
					}
			      n++;
				}
				System.out.println("PRINTING WITH FIR LOOP]n");
		 // For loop: best structure for iterating through an array
				for(int x=0;x<5;x++) {
					System.out.println(states[x]);
				}
				
		}
}

