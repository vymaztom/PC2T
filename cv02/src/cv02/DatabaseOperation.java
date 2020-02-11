package cv02;

import java.util.Scanner;

public class DatabaseOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pocetOsob = 3;
		database[] databazeOsob = new database[pocetOsob];
		
		Scanner sc;
		for(int i = 0 ; i < pocetOsob ; i++){
			System.out.print("Zadejte jmeno osoby c." + (i+1) + ":");
			sc = new Scanner(System.in);
			
			String jmeno = sc.next();
			while(true){
				System.out.print("Rok narozeni: ");
				sc = new Scanner(System.in);
				
				if(sc.hasNextInt()){
					break;
				}
			}
			int rocnik = sc.nextInt();
			databazeOsob[i] = new database(jmeno, rocnik);
			
		}
	}

}
