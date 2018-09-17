
public class Dog extends Animal implements Comparable<Dog> {
	private String name;
	private int legs;

	public Dog(String name, int legs) {
		super(name, legs);
		this.name = name;
		this.legs = legs;
	}

	@Override
	public String toString() {
		return name + ":" + legs;
	}

	public int compareTo(Dog d) {
		Boolean compName = this.getName().equals(d.getName());
		int compLegs = this.getLegs() - d.getLegs();

		if (compName) {
			return compLegs;
		} else {
			return this.getName().compareTo(d.getName());
		}
	}
}
