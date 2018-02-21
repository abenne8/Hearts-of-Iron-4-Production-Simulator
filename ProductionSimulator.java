import java.util.Scanner;

public class ProductionSimulator {

	
	
	public static void main(String[] args) {
		
		//import java.util.Scanner;
		int numberofmilfactories = 10;
		int days=77; //days
		int day=0;
		
		double totalproduction = 0;
		MilitaryFactory[] Factories = new MilitaryFactory[700];
		
		Equipment one = new Equipment().new Infantry(1);
		
		int constpackage=0;
		int counter=0; 
		
		for (int i=0; i<numberofmilfactories; i++) { ///////////////Setup initial factories
			Factories[i]= new MilitaryFactory(true, one, 1);
			
		}
		
		/////////////Time simulator
		for (int i=0; i<days; i++) {
			for (int j=0; j<numberofmilfactories; j++) {
				Factories[j].onedayofproduction();
				
			}
			day++;
			
			/////////////for building new factories
			if (constpackage==1) {
				if (day > 0 && day%45==0) {
					//let's start with 2 military factories every 45 days, or 
					Factories[numberofmilfactories]= new MilitaryFactory(true, one, 1);
					Factories[numberofmilfactories+1]= new MilitaryFactory(true, one, 1);
					numberofmilfactories+=2;
				}
			}
			
			/////Manually adding factories
			if (constpackage==0 && counter==0) {
				Scanner scanner = new Scanner(System.in);
			    System.out.print("Wanna build factories?");
			    String answer = scanner.next();
			    if(answer.equals("yes")) {
			    	System.out.print("How many?");
			    	String number = scanner.next();
			    	int counts= Integer.parseInt(number);
			    	for (int k=0; k<counts; k++) {
			    		Factories[numberofmilfactories]= new MilitaryFactory(true, one, 1);
			    		numberofmilfactories++;
			    	}
			    	System.out.print("How long 'til next factory? (days)");
			    	String timestring = scanner.next();
			    	counter= Integer.parseInt(timestring);
			    }
			    else {
			    	
			    	
			    }
			    //System.out.println("Your favorite color is: " + name);
			    //scanner.close();
			}
			
			counter--;
			MilitaryFactory.techup(day);
		}
		
		////////////////Sum up the production
		double infequip=0;
		for (int j=0; j<numberofmilfactories; j++) {
			totalproduction += Factories[j].getTotalProduction();
			infequip+= Factories[j].getequipmentnumbers();
			//System.out.println(infequip);
		}
		//infequip=Factories[0].getequipmentnumbers();
		
		
		double maxeff=MilitaryFactory.getmaxeff();		
		
		
		/////////////////////////////////Printing
		System.out.println("Hey it works");
		System.out.println(totalproduction);
		System.out.println(numberofmilfactories);
		System.out.println(day);
		System.out.println(maxeff);
		System.out.println(infequip);
		/////////////////////////////////
	}

}
