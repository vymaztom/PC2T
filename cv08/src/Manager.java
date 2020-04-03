import java.util.*;

public class Manager extends Employee{
	protected List<Employee> listOfEmployees;
	protected List<Secretarian> listOfRelationships;
	
	public Manager(char[] nickname, char[] email, char[] password, EmployeeType employeeType, List<Employee> listofEmployees) 
	{
		super(nickname, email, password, employeeType);
		this.listOfEmployees = listofEmployees;
		this.listOfRelationships = new ArrayList<Secretarian>();
	}

	public List<Employee> getListOfEmployees() {
		return listOfEmployees;
	}

	public void setListOfEmployees(List<Employee> listOfEmployees) {
		this.listOfEmployees = listOfEmployees;
	}

	public List<Secretarian> getListOfRelationships() {
		return listOfRelationships;
	}

	public void setListOfRelationships(List<Secretarian> listOfRelationships) {
		this.listOfRelationships = listOfRelationships;
	}
	
	public void AddRelationships(Secretarian one) {
		this.listOfRelationships.add(one);
	}
	
	public void PrintRelationships() {
		for (int i = 0; i < listOfRelationships.size(); i++) {
			System.out.println(listOfRelationships.get(i).toString());
		}
	}
	
	public void PrintEmployees() {
		for (int i = 0; i < listOfEmployees.size(); i++) {
			System.out.println(listOfEmployees.get(i).toString());
		}
	}
	
}
