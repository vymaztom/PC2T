package cv03;

import java.util.Scanner;

public class Test {
	
	public static void print_BPC1(BPC1 in){
		System.out.print("Class name: " + in.getName() + "\n");
		System.out.print("Body		: " + in.getSumPoint() + "\n");
		System.out.print("Zapocet	: ");
		if(in.isSumOk()){
			System.out.print("udelen\n");
		}else{
			System.out.print("neudelen\n");
		}
	}
	
	public static void print_BPC2(BPC2 in){
		System.out.print("Class name: " + in.getName() + "\n");
		System.out.print("Body		: " + in.getSumPoint() + "\n");
		System.out.print("Zapocet	: ");
		if(in.isSumOk()){
			System.out.print("udelen\n");
		}else{
			System.out.print("neudelen\n");
		}
	}
	
	public static void print_BPIS(BPIS in){
		System.out.print("Class name: " + in.getName() + "\n");
		System.out.print("Zapocet	: ");
		if(in.isSumOk()){
			System.out.print("udelen\n");
		}else{
			System.out.print("neudelen\n");
		}
	}

	public static void main(String[] args) {
		Scanner sc;
		BPC1 a = new BPC1("BPC1");
		BPC2 b = new BPC2("BPC2");
		BPIS c = new BPIS("BPIS");

		System.out.print("Rozhrani pro: " + a.getName() + "\n");
		
		System.out.print("Pridej body(max 20):");
		sc = new Scanner(System.in);
		int value = sc.nextInt();
		a.addPoints20(value);
		
		System.out.print("Pridej body(max 80):");
		sc = new Scanner(System.in);
		value = sc.nextInt();
		a.addPoints80(value);
		
		System.out.print("Rozhrani pro: " + b.getName() + "\n");
		
		System.out.print("Pridej body(max 30):");
		sc = new Scanner(System.in);
		value = sc.nextInt();
		b.addPoints30(value);
		
		System.out.print("Pridej body(max 20):");
		sc = new Scanner(System.in);
		value = sc.nextInt();
		b.addPoints20(value);
		
		System.out.print("Pridej body(max 50):");
		sc = new Scanner(System.in);
		value = sc.nextInt();
		b.addPoints50(value);
		
		System.out.print("Rozhrani pro: " + c.getName() + "\n");
		
		do{
			System.out.print("(1- zapocet, 0 - neudelen):");
			sc = new Scanner(System.in);
			value = sc.nextInt();	
		}while((value!=0)&&(value!=1));
		if(value==1){
			c.subjectOK(true);
		}
		
		System.out.print("-------------------------------------\n");
		print_BPC1(a);
		System.out.print("-------------------------------------\n");
		print_BPC2(b);
		System.out.print("-------------------------------------\n");
		print_BPIS(c);
		
	}

}
