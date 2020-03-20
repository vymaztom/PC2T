import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Databaze {
	
	public Databaze()
	{
		prvkyDatabaze = new HashMap<String, Student>();
		sc=new Scanner(System.in);
	}
	
	public void setStudent()
	{
		System.out.println("Zadejte jmeno studenta, rok narozeni");
		String jmeno=sc.next();
		int rok=sc.nextInt();
		prvkyDatabaze.put(jmeno, new Student(jmeno, rok));
	}
	
	public boolean IsStudent(String jmeno) {
		Student one = prvkyDatabaze.get(jmeno);
		if(one != null) {
			return true;
		}else {
			return false;
		}
	}
	
	public Student getStudent(String jmeno)
	{
		return prvkyDatabaze.get(jmeno);
	}
	
	public boolean setPrumer(String jmeno, float prumer)
	{
		
		if(IsStudent(jmeno)) {
			Student one = getStudent(jmeno);
			try {
				one.setStudijniPrumer(prumer);
			} catch (Exception e) {
				System.out.println(e.toString());
				return false;
			}
			return true;
		}else {
			return false;
		}
		
	}
	
	public void printDatabase(){
		for(Student one : prvkyDatabaze.values()) {
			System.out.println("Jmeno: " + one.getJmeno());
		}
	}
	
	public boolean deleteStudent(String jmeno) {
		if(prvkyDatabaze.remove(jmeno) != null) {
			return true;
		}else {
			return false;
		}
	}
	
	private Scanner sc;
	private Map<String,Student> prvkyDatabaze;
}