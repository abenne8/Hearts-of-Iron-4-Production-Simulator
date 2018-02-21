
public class MilitaryFactory {
	static int base=5;
	static int day=0;
	double currenteff;
	static double startingeff=10;
	static double retention=10;
	static double maxeff=50;
	double growth;
	
	
	Equipment item;
	int itemlevel=0;
	double itemcost;
	double items=0;
	double[] production;
	double totalproduction;
	
	///////////////////////////tech stuff
	static boolean techestimate=true;
	static boolean basicmachinetools=false;
	static boolean concentrated=true;
	static double outputmod=1;
	
	static int[] techdays = {150, 300, (360*1)+150, (360*3)+150, (360*5)+150, (360*7)+150}; //basic machine tools, industry1/efficiency 1 (1936), 
			//successive one's in 1937, 1939, 1941, 1943 
			// 150 days, 300 days, 150 days after that for 1937 industry
			//then 150 days after 1939 so 960+150 
			//150 days after 1941 so 960+720+150
			//ditto 1943
	////////////////////////////
	
	
	
	/////////////////constructors
	public MilitaryFactory() {
		this.currenteff=startingeff;
		this. totalproduction=0;
		
	}
	public MilitaryFactory(boolean concentrated) {
		this.currenteff=startingeff;
		this.totalproduction=0;
	}
		
	public MilitaryFactory(boolean concentrated, Equipment item) {
		this.currenteff=startingeff;
		this.totalproduction=0;
		this.item=item;
	}
	
	public MilitaryFactory(boolean concentrated, Equipment item, int itemlevel) {
		this.currenteff=startingeff;
		this.totalproduction=0;
		this.item=item;
		this.itemlevel=itemlevel;
		this.itemcost=item.getcost();
	}
		
	//}////////////////////////////////
	
	public void onedayofproduction () {
		this.growth=0.001*(maxeff*maxeff)/(this.currenteff);
		
		double dailyproduction=base*outputmod*(this.currenteff/100);
		this.totalproduction += dailyproduction;
		
		this.items+= dailyproduction/itemcost;
		//this.production[day]=base*outputmod*this.currenteff/100;
		this.currenteff += this.growth;
		if (this.currenteff > maxeff) {
			this.currenteff = maxeff;
		}
		//day++;
		
		
		
	}
	
	
	
	////////////////////Teching up
	public static void techup(int theday) {
		if (techestimate==true) {
			for (int i=0; i<techdays.length; i++) {
				if (theday==techdays[0] && basicmachinetools==false) {//basic machine tools
					machinetoolstechup();
					basicmachinetools=true;
					
				}
				else if (theday==techdays[i]) {
					
					if (concentrated==true) {
						if(i!=1) {
							machinetoolstechup();
						}
						concentratedtechup();
						
					
					}
					else if (concentrated==false) {
						if(i!=1) {
							machinetoolstechup();
						}
						dispersedtechup();
						
					}
				}
			
			}
		}						
		
		
	}
	
	////////Switching production
	
	public void switchProduction(Equipment newequip) {
		
		
	}
	
	
	
	/////////Tech stuff
	public static void machinetoolstechup(){
		maxeff+=10;
		basicmachinetools=true;
	}
	public static void concentratedtechup(){
		
		outputmod+=0.15; //assuming concentrated at first
		//System.out.println("Hey it works");
	}
	public static void dispersedtechup(){
		
		outputmod+=0.10; //assuming concentrated at first
		retention+=10;
		startingeff+=5;
	}
	
	
	
	
	//////////Getters
	public double getequipmentnumbers() {
		return this.items;
	}
	public double getTotalProduction() {
		return this.totalproduction;
	}
	
	public double[] getProductionArray() {
		
		return this.production;
	}
	public static double getmaxeff() {
		return maxeff;
	}

}
 