
public class Goat extends AbstractAnimal {
	
	@Override
	public void sound() {
		System.out.println("baa, baa");
	}
	@Override
	public String toString() {
		return "Goat [age=" + age + ", sound=baa, baa]";
	}
}
