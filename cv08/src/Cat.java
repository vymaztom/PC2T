
public class Cat extends AbstractAnimal {
	
	@Override
	public void sound() {
		System.out.println("miaow");
	}

	@Override
	public String toString() {
		return "Cat [age=" + age + ", sound=miaow]";
	}
	
}
