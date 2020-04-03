
public class Cow extends AbstractAnimal {
	
	@Override
	public void sound() {
		System.out.println("booo");
	}
	@Override
	public String toString() {
		return "Cow [age=" + age + ", sound=booo]";
	}
}
