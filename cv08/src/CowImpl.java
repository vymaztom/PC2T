
public class CowImpl implements Animal {
	protected byte age;
	public void sound() {
		System.out.println("booo");
	}
	@Override
	public String toString() {
		return "CowImpl [age=" + age + ", sound=booo]";
	}
}
