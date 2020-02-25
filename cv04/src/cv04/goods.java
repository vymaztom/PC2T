package cv04;

abstract public class goods {
	
	private String name;
	private double price; 
	private static double DPH = 0.21;
	
	public goods(String name, double price){
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return(price*(1+DPH));
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
