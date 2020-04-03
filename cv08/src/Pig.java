
public class Pig extends AbstractAnimal {
	
	@Override
	public void sound() {
		System.out.println("oink, oink");
	}
	@Override
	public String toString() {
		return "Pig [age=" + age + ", sound=oink, oink]";
	}
}
