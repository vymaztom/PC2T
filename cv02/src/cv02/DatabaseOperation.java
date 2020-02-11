package cv02;

import java.util.Scanner;

public class DatabaseOperation {

	public static void printUser(database in, float add){
		if(in.pridejUvazek(add)){
			System.out.print(in.getJmeno()+" "+in.getRocnik()+" "+in.getUvazek()+"\n");
		}else{
			System.out.print(in.getJmeno()+" "+in.getRocnik()+" "+in.getUvazek()+" Dosazen maximalni uvazek\n");
		}
		
	}
	
	
	
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
		while(true){
			System.out.print("1 - 3 uzivatel\n");
			System.out.print("4 konec\n");
			sc = new Scanner(System.in);
			if(sc.hasNextInt()){
				int value = sc.nextInt();
				if(value == 4){
					break;
				}else if((value > 0)&&(value < 4)){
					System.out.print("Zadej novy uvazek: ");
					sc = new Scanner(System.in);
					if(sc.hasNextFloat()){
						float add = sc.nextFloat();
						printUser(databazeOsob[value-1], add);	
					}else{
						System.out.print("nezadali jste zpravne uvazek");
					}
					
				}
			}
		}
	}

}
