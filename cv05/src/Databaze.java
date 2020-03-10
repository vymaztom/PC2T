import java.util.Scanner;
import java.io.*;


public class Databaze {
	public Databaze(int pocetPrvku)
	{
		prvkyDatabaze=new Student[pocetPrvku];
		sc=new Scanner(System.in);
	}
	
	public void setStudent()
	{
		System.out.println("Zadejte jmeno studenta, rok narozeni");
		String jmeno=sc.next();
		int rok=sc.nextInt();
		prvkyDatabaze[posledniStudent++]=new Student(jmeno,rok);
	}
	
	public Student getStudent(int idx)
	{
		return prvkyDatabaze[idx];
	}
	
	public void setPrumer(int idx, float prumer) throws Vyjimka
	{
		prvkyDatabaze[idx].setStudijniPrumer(prumer);
	}
	
	public void printDatabase(){
		for (int i = 0; i < posledniStudent; i++) {
			try {
				System.out.println("Jmeno: "+prvkyDatabaze[i].getJmeno() + ", rok narozeni: "+prvkyDatabaze[i].getRocnik()+", studijni prumer: " + prvkyDatabaze[i].getStudijniPrumer());
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
		}
	}
	
	public void saveIntoFile(String path){

		try {
			FileOutputStream f = new FileOutputStream(new File(path));
			ObjectOutputStream o = new ObjectOutputStream(f);

			// Write objects to file
			o.writeObject(prvkyDatabaze);
			o.writeObject(posledniStudent);

			o.close();
			f.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
		}
	}
	
	public void loadFromFile(String path){
		try{
			FileInputStream fi = new FileInputStream(new File(path));
			ObjectInputStream oi = new ObjectInputStream(fi);
	
			// Read objects
			prvkyDatabaze = (Student []) oi.readObject();
			posledniStudent = (int) oi.readObject();
	
			oi.close();
			fi.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private Scanner sc;
	private Student [] prvkyDatabaze;
	private int posledniStudent = 0;
}