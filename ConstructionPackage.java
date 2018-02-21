
public class ConstructionPackage {///NOT IN USE YET
	int day=0;
	int packagenum;
	public ConstructionPackage(int n) {
		this.packagenum=n;
		
	}
	
	
	public void nextday(int day) {
		this.day++;
	}
	
	public boolean build() {
		
		if (this.day > 0 && this.day%45==0) {
			//let's start with 2 military factories every 45 days
			return true;
		}
		return false;
		
	}
	
	

}
