package cv04;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		goods[] data = new goods[4];
		data[0] = new Food("Rohlík",1.5,1);
		data[1] = new Tool("Kleštì",278.0,24);
		data[2] = new Food("Chleba",20.8,6);
		data[3] = new Food("Jablko",51.0,20);
	}

	public void printData(goods[] data){
		for(int i = 0 ; i < 4 ; i++){
			System.out.print(data[i].getName() + ", cena: " + data[i].getPrice());
			if(data[i] instanceof Food){
				Food one = (Food)data[i];
				System.out.print(", trvanlivost: " + one.getExpiration() + " " + one.getUnit() + "\n");
			}else if(data[i] instanceof Tool){
				Tool one = (Tool)data[i];
				System.out.print(", záruka: " + one.getGuarantee() + " " + one.getUnit() + "\n");
				//System.out.print('\n');
			}
		}
	}
	
}
