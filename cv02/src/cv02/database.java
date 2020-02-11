package cv02;

public class database {

	private String jmeno;
	private int rocnik;
	private float uvazek=0;
	private static float maximalniUvazek=1;
	
	public database(String jmeno, int rocnik){
		this.jmeno = jmeno;
		this.rocnik = rocnik;
	}

	/**
	 * @return the jmeno
	 */
	public String getJmeno() {
		return jmeno;
	}

	/**
	 * @param jmeno the jmeno to set
	 */
	public void setJmeno(String jmeno) {
		this.jmeno = jmeno;
	}

	/**
	 * @return the rocnik
	 */
	public int getRocnik() {
		return rocnik;
	}

	/**
	 * @param rocnik the rocnik to set
	 */
	public void setRocnik(int rocnik) {
		this.rocnik = rocnik;
	}

	/**
	 * @return the uvazek
	 */
	public float getUvazek() {
		return uvazek;
	}

	/**
	 * @param uvazek the uvazek to set
	 */
	public void setUvazek(float uvazek) {
		this.uvazek = uvazek;
	}

	/**
	 * @return the maximalniUvazek
	 */
	public static float getMaximalniUvazek() {
		return maximalniUvazek;
	}

	/**
	 * @param maximalniUvazek the maximalniUvazek to set
	 */
	public static void setMaximalniUvazek(float maximalniUvazek) {
		database.maximalniUvazek = maximalniUvazek;
	}
	
	public boolean pridejUvazek(float uvazek){
		if(this.uvazek + uvazek < this.maximalniUvazek){
			this.uvazek =+ uvazek;
			return true;
		}
		return false;
		
	}
	
}
