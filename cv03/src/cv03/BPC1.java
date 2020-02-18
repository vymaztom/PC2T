package cv03;

public class BPC1 implements subject{

	private String name;
	private int sum20;
	private int sum80;
	private boolean submitOk; 
	
	public BPC1(String name){
		this.name = name;
		this.sum20 = 0;
		this.sum80 = 0;
		this.submitOk = false;
	}
	
	public boolean addPoints20(int value){
		if(value >= 0){
			if((this.sum20 + value)<= 20){
				this.sum20 =+ value;
				if(this.sum20 >= pointsToOk){
					this.submitOk = true;
				}
				return true;
			}
		}
		return false;
	}

	public boolean addPoints80(int value){
		if(value >= 0){
			if((this.sum80 + value)<= 80){
				this.sum80 =+ value;
				return true;
			}	
		}
		return false;
	}
	
	
	public String getName(){
		return this.name;
	}
	
	public int getSumPoint(){
		return(this.sum20 + this.sum80);
	}
	
	public boolean isSumOk(){
		return this.submitOk;
	}
	
}
