
public class Animal {

	private String name;
	private int legs;
	
	public Animal(String name, int legs) {
		this.name = name;
		this.legs = legs;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getLegs() {
		return this.legs;
	}
	
	public String toString(){
		return this.getName();
	}
	
}
