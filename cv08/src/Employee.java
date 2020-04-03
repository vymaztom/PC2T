import java.util.Arrays;

public class Employee {
	
	protected char[] nickname;
	protected char[] email;
	protected char[] password;
	protected EmployeeType employeeType;
	
	public Employee(char[] nickname, char[] email, char[] password, EmployeeType employeeType) 
	{
		this.nickname = nickname;
		this.email = email;
		this.password = password;
		this.employeeType = employeeType;
	}

	public char[] getNickname() {
		return nickname;
	}

	public void setNickname(char[] nickname) {
		this.nickname = nickname;
	}

	public char[] getEmail() {
		return email;
	}

	public void setEmail(char[] email) {
		this.email = email;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public EmployeeType getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}

	@Override
	public String toString() {
		return "Employee [nickname=" + Arrays.toString(nickname) + ", email=" + Arrays.toString(email) + ", password="
				+ Arrays.toString(password) + ", employeeType=" + employeeType + "]";
	}
	
	
	public int compareTo(Employee one) {
		return this.email.toString().compareTo(one.getEmail().toString());
	}
	
	
}
