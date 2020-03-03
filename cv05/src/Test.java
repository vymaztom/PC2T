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
		//System.out.print(cislo);
		return cislo;
	}
	
	public static float pouzeFloat(Scanner sc) 
	{
		float cislo = 0;
		try
		{
			//cislo = sc.nextInt();
			cislo = sc.nextFloat();
		}
		catch(Exception e)
		{
			System.out.println("Nastala vyjimka typu "+e.toString());
			System.out.println("zadejte prosim desetine cislo");
			sc.nextLine();
			cislo = pouzeFloat(sc);
		}
		//System.out.print(cislo);
		return cislo;
	}

	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Databaze mojeDatabaze=new Databaze(1);
		int idx;
		float prumer;
		int volba;
		boolean run=true;
		while(run)
		{
			System.out.println("Vyberte pozadovanou cinnost:");
			System.out.println("1 .. vytvoreni nove databaze");
			System.out.println("2 .. vlozeni noveho studenta");
			System.out.println("3 .. nastaveni prumeru studenta");
			System.out.println("4 .. vypis informace o studentovi");
			System.out.println("5 .. ukonceni aplikace");
			volba=pouzeCelaCisla(sc);
			switch(volba)
			{
				case 1:
					System.out.println("Zadejte pocet studentu");
					int size = pouzeCelaCisla(sc);
					try{
						mojeDatabaze=new Databaze(size);
					}catch(NegativeArraySizeException e){
						System.out.println("Zadejte nezaporne cislo");
					}
					
					break;
				case 2:
					try{
						mojeDatabaze.setStudent();
					}catch (NullPointerException e) {	
						System.out.println("Neni vytvozena database");
					}catch (IndexOutOfBoundsException e) {
						System.out.println("Database je plna");
					}catch(Exception e){
						System.out.println("neco se stalo");
					}
					break;
				case 3:
					System.out.println("Zadejte index a prumer studenta");
					//idx=sc.nextInt();
					idx=pouzeCelaCisla(sc); 
					//prumer =sc.nextFloat();
					prumer = pouzeFloat(sc);
					try{
						mojeDatabaze.setPrumer(idx,prumer);
					}catch (IndexOutOfBoundsException e) {
						System.out.println("Index je neplatny");
					}catch (NullPointerException e) {
						System.out.println("Na zvolene pozici neni Vytvozen student");
					}
					break;
				case 4:
					System.out.println("Zadejte index studenta");
					//idx=sc.nextInt();
					idx=pouzeCelaCisla(sc);
					try {
						Student info=mojeDatabaze.getStudent(idx);	
						System.out.println("Jmeno: " + info.getJmeno() + " rok narozeni: " + info.getRocnik() + " prumer: " + info.getStudijniPrumer());
					} catch (Vyjimka e) {
						System.out.println(e.toString());
					} catch (IndexOutOfBoundsException e) {
						System.out.println("Index je mino velikost database");
					} catch (NullPointerException e) {
						System.out.println("Na zvolene pozici neni student");
					}
					break;
				case 5:
					run=false;
					break;
			}
			
		}
	}

}
