import java.io.Serializable;

public class Student implements Serializable {
	
	private String jmeno;
	private int rocnik;
	private Float studijniPrumer = null;
	
	public Student(String jmeno, int rocnik)
	{
		this.jmeno=jmeno;
		this.rocnik=rocnik;
	}
	
	public String getJmeno()
	{
		return jmeno;
	}
	
	public int getRocnik()
	{
		return rocnik;
	}
	
	public Float getStudijniPrumer() throws Vyjimka{
		if(this.studijniPrumer == null){
			throw(new Vyjimka("Null value of studijniPrumer"));
		}
		return this.studijniPrumer;
	}

	public void setStudijniPrumer(Float studijniPrumer) throws Vyjimka {
		if((studijniPrumer >= 1)&&(studijniPrumer <= 5)){
			this.studijniPrumer = studijniPrumer;
		}else{
			throw(new Vyjimka("Invalid input in setStudijni prumer"));
		}
	}


}