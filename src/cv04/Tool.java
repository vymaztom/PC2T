package cv04;

public class Tool extends goods{

	private int guarantee;
	
	public Tool(String name, double price, int guarantee){
		super(name, price);
		this.guarantee = guarantee;
	}

	public int getGuarantee() {
		return guarantee;
	}

	public void setGuarantee(int guarantee) {
		this.guarantee = guarantee;
	}
	
	public String getUnit(){
		return "mìsícù";
	}
	
}
