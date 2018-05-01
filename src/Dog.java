
public class Dog extends Pet{
	
	public Dog(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void said() {
		System.out.println("dog said");
	}
	@Override
	public void run() {
		System.out.println("dog run");
	}
	public void swim() {
		System.out.println("dog swim");
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age +  "]";
	}
	
}
