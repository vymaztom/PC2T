package cv03;

public class BPIS implements subject{
	private String name;
	private int sum;
	private boolean submitOk; 
	
	public BPIS(String name){
		this.name = name;
		this.submitOk = false;
		this.sum = 0;
	}
	

	public void subjectOK(boolean value){
		if(!this.submitOk){
			this.submitOk = true;
		}
	}
	
	
	public String getName(){
		return this.name;
	}
	
	public int getSumPoint(){
		return(this.sum);
	}
	
	public boolean isSumOk(){
		return this.submitOk;
	}
}
