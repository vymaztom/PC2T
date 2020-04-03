import java.util.Scanner;

public class apt {

	
	public static void menu() {
		System.out.println("1) . . . . vytvo� pole");
		System.out.println("2) . . . . vlo� hranol");
		System.out.println("3) . . . . vypo�ti ob�m");
		System.out.println("4) . . . . vypo�ti obsah");
		System.out.println("5) . . . . nejmen�� ob�m");
		System.out.println("6) . . . . po�et d�ev�n�ch");
		System.out.println("7) . . . . konec");
	} 
	
	public static void main(String[] args) {
		boolean run = true;
		int status;
		Pole mojePole = new Pole(10);
		Scanner sc = new Scanner(System.in);
		while(run) {
			menu();
			status = sc.nextInt();
			switch (status) {
			case 1:
				System.out.println("zadej velikost pole:");
				int size = sc.nextInt();
				mojePole = new Pole(size);
				break;
			case 2:
				mojePole.zadejHranol();
				break;
			case 3:
				mojePole.vypoctiObjem();
				break;
			case 4:
				mojePole.vypoctiObsahPodstavy();
				break;
			case 5:
				System.out.println("nejmen�� je: "+mojePole.najdiNejmensiObjem());
				break;
			case 6:
				System.out.println("d�ev�n�ch je: "+mojePole.zjistiPocetDrevenych());
				break;
			case 7:
				run = false;
				break;
			default:
				run = false;
				break;
			}
		}

	}

}
