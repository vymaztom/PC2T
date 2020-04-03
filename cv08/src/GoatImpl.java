
public class GoatImpl implements Animal {
	protected byte age;
	public void sound() {
		System.out.println("baa, baa");
	}
	@Override
	public String toString() {
		return "GoatImpl [age=" + age + ", sound=baa, baa]";
	}
}
