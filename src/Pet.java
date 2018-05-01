
public class Pet {
	protected String name;
	protected int age;
	
	public Pet(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void said() {
		System.out.println("pet said");
	}
	
	public void run() {
		System.out.println("pet run");
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", age=" + age + "]";
	}
	
}
