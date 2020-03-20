import java.util.Scanner;


public class Test {

	public static int pouzeCelaCisla(Scanner sc) 
	{
		int cislo = 0;
		try
		{
			cislo = sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Nastala vyjimka typu "+e.toString());
			System.out.println("zadejte prosim cele cislo ");
			sc.nextLine();
			cislo = pouzeCelaCisla(sc);
		}
		return cislo;
	}
	
	public static float pouzeFloat(Scanner sc) 
	{
		float cislo = 0;
		try
		{
			cislo = sc.nextFloat();
		}
		catch(Exception e)
		{
			System.out.println("Nastala vyjimka typu "+e.toString());
			System.out.println("zadejte prosim desetine cislo");
			sc.nextLine();
			cislo = pouzeFloat(sc);
		}
		return cislo;
	}

	public static void main(String[] args) {	
		
		Scanner sc=new Scanner(System.in);
		Databaze mojeDatabaze=new Databaze();
		
		// define main global variables
		String jmeno;
		Student one;
		float prumer;
		int volba;
		boolean run = true;
		
		while(run){
			System.out.println("Vyberte pozadovanou cinnost:");
			System.out.println("1 .. vlozeni noveho studenta");
			System.out.println("2 .. nastaveni prumeru studenta");
			System.out.println("3 .. vypis informace o studentovi");
			System.out.println("4 .. vypis database (jmena studentù)");
			System.out.println("5 .. odstranit studenta z database");
			System.out.println("6 .. ukonceni aplikace");

			volba=pouzeCelaCisla(sc);
			switch(volba)
			{
				case 1:
					mojeDatabaze.setStudent();
					break;
				case 2:
					System.out.println("Zadejte jmeno Studenta");
					jmeno=sc.next();
					if(mojeDatabaze.IsStudent(jmeno)) {
						System.out.println("Zadejte prumer studenta");
						prumer = pouzeFloat(sc);
						mojeDatabaze.setPrumer(jmeno, prumer);
					}else {
						System.out.println("Jmeno studenta není v databazi");
					}
					break;
				case 3:
					System.out.println("Zadejte jmeno Studenta");
					jmeno = sc.next();
					
					if(mojeDatabaze.IsStudent(jmeno)) {
						one = mojeDatabaze.getStudent(jmeno);
						try {
							System.out.println("Jmeno: " + one.getJmeno() + " rok narozeni: " + one.getRocnik() + " prumer: " + one.getStudijniPrumer());
						} catch (Exception e) {
							System.out.println("Jmeno: " + one.getJmeno() + " rok narozeni: " + one.getRocnik() + " prumer: NEZADANO");
						}
					}else {
						System.out.println("Jmeno studenta není v databazi");
					}
					break;
					
				case 4:
					mojeDatabaze.printDatabase();
					break;
				case 5:
					System.out.println("Zadejte jmeno Studenta");
					jmeno = sc.next();
					
					if(mojeDatabaze.IsStudent(jmeno)) {
						mojeDatabaze.deleteStudent(jmeno);
					}else {
						System.out.println("Jmeno studenta není v databazi");
					}
					break;
				case 6:
					run=false;
					break;
			}
			
		}
	}

}
