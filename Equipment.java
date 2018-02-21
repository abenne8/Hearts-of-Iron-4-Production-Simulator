
public class Equipment {
	public int family;
	public double cost;
	//public double[] price= new double[5];
	///////////////Land Equipment

	class Infantry extends Equipment {
		double[] price = {0.4, 0.5, 0.6, 0.7};
		//price[0]=0.4;
		
		public Infantry(int itemlevel) {//basic equipment is 0. Will be following the convention that artillery 1 is itemlevel 1, etc
			this.cost=price[itemlevel];
		}
		
	}
	
	class Artillery extends Equipment {
		double[] price = {3.5, 4, 4.5};
		public Artillery(int itemlevel) {
			this.cost=price[itemlevel-1];
			
		}
		

	}
	
	class AT extends Equipment {
		double[] price = {4, 5, 6};
		public AT(int itemlevel) {
			this.cost=price[itemlevel-1];
			
		}

	}
	
	class AA extends Equipment {
		double[] price = {4, 5, 6};
		public AA(int itemlevel) {
			this.cost=price[itemlevel-1];
			
		}

	}
	class RArt extends Equipment {
		double[] price = {4, 5};
		public RArt(int itemlevel) {
			this.cost=price[itemlevel-1];
			
		}

	}
	
	class MRArt extends Equipment {
		double[] price = {12};
		
		public MRArt(int itemlevel) {
			this.cost=price[itemlevel-1];
			
		}
	}
	
	class Support extends Equipment {
		double[] price = {4};
		public Support(int itemlevel) {
			this.cost=price[itemlevel-1];
			
		}

	}
	
	class Motorized extends Equipment {
		double[] price = {2.5};
		public Motorized(int itemlevel) {
			this.cost=price[itemlevel-1];
			
		}
	}
	
	class Mechanized extends Equipment {
		double[] price = {12, 13, 14};
		public Mechanized(int itemlevel) {
			this.cost=price[itemlevel-1];
			
		}

	}
	
	
	
///////////////Armor Equipment

	class LArm extends Equipment {
		
		
		class LTank extends Equipment {
			double[] price = {8, 9, 10};
			public LTank(int itemlevel) {
				this.cost=price[itemlevel-1];
				family=1;
			}
			

		}
		
		class LSPG extends Equipment {
			double[] price = {8, 9, 10};
			public LSPG(int itemlevel) {
				this.cost=price[itemlevel-1];
				family=1;
			}

		}
		
		class LTD extends Equipment {
			double[] price = {8, 9, 10};
			public LTD(int itemlevel) {
				this.cost=price[itemlevel-1];
				family=1;
			}

		}
		
		class LSPAA extends Equipment {
			double[] price = {10, 11, 12};
			public LSPAA(int itemlevel) {
				this.cost=price[itemlevel-1];
				family=1;
			}

		}

	}
	
	
	class MArm extends Equipment {
		
		class MTank extends Equipment {
			double[] price = {12, 13, 14};
			public MTank(int itemlevel) {
				this.cost=price[itemlevel-1];
				family=2;
			}

		}
		
		class MSPG extends Equipment {
			double[] price = {12, 13, 14};
			public MSPG(int itemlevel) {
				this.cost=price[itemlevel-1];
				family=2;
			}

		}
		
		class MTD extends Equipment {
			double[] price = {12, 13, 14};
			public MTD(int itemlevel) {
				this.cost=price[itemlevel-1];
				family=2;
			}

		}
		
		class MSPAA extends Equipment {
			double[] price = {12, 13, 14};
			public MSPAA(int itemlevel) {
				this.cost=price[itemlevel-1];
				family=2;
			}

		}

	}
	
	class HArm extends Equipment {
		
		class HTank extends Equipment {
			double[] price = {25, 27, 30};
			public HTank(int itemlevel) {
				this.cost=price[itemlevel-1];
				family=3;
			}

		}
		
		class HSPG extends Equipment {
			double[] price = {25, 27, 30};
			public HSPG(int itemlevel) {
				this.cost=price[itemlevel-1];
				family=3;
			}

		}
		
		class HTD extends Equipment {
			double[] price = {25, 27, 30};
			public HTD(int itemlevel) {
				this.cost=price[itemlevel-1];
				family=3;
			}

		}
		
		class HSPAA extends Equipment {
			double[] price = {25, 27, 30};
			public HSPAA(int itemlevel) {
				this.cost=price[itemlevel-1];
				family=3;
			}

		}

	}
	
	
	
	
	public int family() {
		return this.family;
	}
	
	public double getcost() {
		return this.cost;
	}
	
	
	
	
}
