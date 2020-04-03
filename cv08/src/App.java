import java.util.*;

public class App {

	/**
	* 
	* Abstratní tøída nám mùže uhelèit v tom, že si v ní mùžeme zadefinovat promìné oproti interface, mùžeme pøedefinovat nìjaké spoleèné fukce
	* Interface je jednoduchá pøedloha toho jaké metody musí tøída z ní dìdìná obsahovat, nejde v deklarovat promìnné nebo fukce, nemusíme používat "@Override"
	*
	* enum nám pomáhá v tom že místo používání stavových int velièin definujicíjí nìjaký stav mùžeme použít text jehož obsah nemá vliv na sestavený kod, je po seetavení pøeveden na int hodnotu
	* významnì usnadnuje programátorovi práci
	*
	* @author  Tomáš Vymazal
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
