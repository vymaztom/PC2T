import java.util.*;

public class App {

	/**
	* 
	* Abstratn� t��da n�m m��e uhel�it v tom, �e si v n� m��eme zadefinovat prom�n� oproti interface, m��eme p�edefinovat n�jak� spole�n� fukce
	* Interface je jednoduch� p�edloha toho jak� metody mus� t��da z n� d�d�n� obsahovat, nejde v deklarovat prom�nn� nebo fukce, nemus�me pou��vat "@Override"
	*
	* enum n�m pom�h� v tom �e m�sto pou��v�n� stavov�ch int veli�in definujic�j� n�jak� stav m��eme pou��t text jeho� obsah nem� vliv na sestaven� kod, je po seetaven� p�eveden na int hodnotu
	* v�znamn� usnadnuje program�torovi pr�ci
	*
	* @author  Tom� Vymazal
	* @version 1.0
	*/
	public static void main(String[] args) 
	{
		// point 4
		Employee e1 = new Employee(	"e1".toCharArray(),
									"email".toCharArray(),
									"password".toCharArray(),
									EmployeeType.ACTIVE);
		Employee e2 = new Employee(	"e2".toCharArray(),
									"email".toCharArray(),
									"password".toCharArray(),
									EmployeeType.INACTIVE);
		Employee e3 = new Employee(	"e3".toCharArray(),
									"email".toCharArray(),
									"password".toCharArray(),
									EmployeeType.DELETED);
		Employee e4 = new Employee(	"e4".toCharArray(),
									"email".toCharArray(),
									"password".toCharArray(),
									EmployeeType.ACTIVE);
		Employee e5 = new Employee(	"e5".toCharArray(),
									"email".toCharArray(),
									"password".toCharArray(),
									EmployeeType.ACTIVE);
		
		List<Employee> one = new ArrayList<Employee>();
		one.add(e1);
		one.add(e2);
		one.add(e3);
		one.add(e4);
		one.add(e5);
		Manager m1 = new Manager(	"m1".toCharArray(),
									"email".toCharArray(),
									"password".toCharArray(),
									EmployeeType.ACTIVE,
									one);
		Secretarian s1 = new Secretarian(	"s1".toCharArray(),
											"email".toCharArray(),
											"password".toCharArray(),
											EmployeeType.ACTIVE,
											19);
		Secretarian s2 = new Secretarian(	"s2".toCharArray(),
											"email".toCharArray(),
											"password".toCharArray(),
											EmployeeType.ACTIVE,
											21);
		m1.AddRelationships(s1);
		m1.PrintEmployees();
		m1.PrintRelationships();
		
		// point 6
		System.out.println("\n\nPOINT 6");
		AbstractAnimal[] arr = new AbstractAnimal[5];
		arr[0] = new Cat();
		arr[1] = new Dog();
		arr[2] = new Pig();
		arr[3] = new Cow();
		arr[4] = new Goat();
		for (int i = 0; i < arr.length; i++) {
			arr[i].sound();
		}
		
		// point 7
		System.out.println("\n\nPOINT 7");	
		Animal[] arrImpl = new Animal[5];
		arrImpl[0] = new CatImpl();
		arrImpl[1] = new DogImpl();
		arrImpl[2] = new PigImpl();
		arrImpl[3] = new CowImpl();
		arrImpl[4] = new GoatImpl();
		for (int i = 0; i < arrImpl.length; i++) {
			arrImpl[i].sound();
		}
		
	}

}
