package cv03;

public class BPC2 implements subject{
	private String name;
	private int sum20;
	private int sum30;
	private int sum50;
	private boolean submitOk; 
	
	public BPC2(String name){
		this.name = name;
		this.sum20 = 0;
		this.sum30 = 0;
		this.sum50 = 0;
		this.submitOk = false;
	}
	
	public boolean addPoints30(int value){
		if(value >= 0){
			if((this.sum30 + value)<= 30){
				this.sum30 =+ value;
				if(this.sum30 >= pointsToOk){
					this.submitOk = true;
				}
				return true;
			}
		}
		return false;
	}

	public boolean addPoints20(int value){
		if(value >= 0){
			if((this.sum20 + value)<= 20){
				this.sum20 =+ value;
				return true;
			}	
		}
		return false;
	}
	
	public boolean addPoints50(int value){
		if(value >= 0){
			if((this.sum50 + value)<= 50){
				this.sum50 =+ value;
				return true;
			}	
		}
		return false;
	}
	
	
	public String getName(){
		return this.name;
	}
	
	public int getSumPoint(){
		return(this.sum20 + this.sum30 + this.sum50);
	}
	
	public boolean isSumOk(){
		return this.submitOk;
	}
}
