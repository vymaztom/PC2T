
public class DogImpl implements Animal {
	protected byte age;
	public void sound() {
		System.out.println("woof, woof");
	}
	@Override
	public String toString() {
		return "DogImpl [age=" + age + ", sound=woof, woof]";
	}
}
