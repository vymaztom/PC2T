
public class PigImpl implements Animal {
	protected byte age;
	public void sound() {
		System.out.println("oink, oink");
	}
	@Override
	public String toString() {
		return "PigImpl [age=" + age + ", sound=oink, oink]";
	}
}
