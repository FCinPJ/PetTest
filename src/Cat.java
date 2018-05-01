
public class Cat extends Pet {
	public Cat(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void said() {
		System.out.println("cat said");
	}
	@Override
	public void run() {
		System.out.println("cat run");
	}
	public void mouseCatch() {
		System.out.println("cat can catch mouse");
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
	
}
