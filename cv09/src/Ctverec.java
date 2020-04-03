class Ctverec {

	private float hrana;
	
	// ERR 6
	// konstruktor se zadanim delky hrany ctverce
	Ctverec(float hrana){				
		this.hrana=hrana;			
	}
	
	// ERR 1
	// vypocet obsahu ctverce
	float vypoctiObsah(){					
		return (hrana*hrana);		
	}
	
	// zjisteni delky hrany ctverce
	float getHrana(){					
		return hrana;
	}
	
	// nastaveni delky hrany ctverce
	void setHrana(float delka){			
		hrana=delka;
	}

}
