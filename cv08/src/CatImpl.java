import java.io.FileWriter;

public class CatImpl implements Animal {
	protected byte age;
	public void sound() {
		System.out.println("miaow");
	}
	@Override
	public String toString() {
		return "CatImpl [age=" + age + ", sound=miaow]";
	}
	public void saveToFile() {
	    try {
	        FileWriter myWriter = new FileWriter("file.txt");
	        myWriter.write("miaow");
	        myWriter.close();
	      } catch (Exception e) {
		        System.out.println(e .toString());
	      }
	}
}
