import java.util.Arrays;

public class Secretarian extends Employee{


	protected int age;
	
	public Secretarian(char[] nickname, char[] email, char[] password, EmployeeType employeeType, int age) 
	{
		super(nickname, email, password, employeeType);
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Secretarian [age=" + age + ", nickname=" + Arrays.toString(nickname) + ", email="
				+ Arrays.toString(email) + ", password=" + Arrays.toString(password) + ", employeeType=" + employeeType
				+ "]";
	}
}
