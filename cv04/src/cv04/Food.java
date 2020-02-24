package cv04;

public class Food extends goods {

	private int expiration;
	
	public Food(String name, double price, int expiration){
		super(name, price);
		this.expiration = expiration;
	}

	public int getExpiration() {
		return expiration;
	}

	public void setExpiration(int expiration) {
		this.expiration = expiration;
	}
	
	public String getUnit(){
		return "dnů";
	}
	
}
