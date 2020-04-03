
public class Dog extends AbstractAnimal {
	
	@Override
	public void sound() {
		System.out.println("woof, woof");
	}
	
	@Override
	public String toString() {
		return "Dog [age=" + age + ", sound=woof, woof]";
	}
}
