
public class grilFriend {
	StringBuffer petlist = new StringBuffer();
	
	public void petAdopt(Pet pet) {
		if(pet instanceof Cat) {
			petlist.append(pet);
			System.out.println("女朋友收养了一只猫");
		}
		if(pet instanceof Dog) {
			petlist.append(pet);
			System.out.println("女朋友收养了一只狗");
		}
	}

	@Override
	public String toString() {
		return "grilFriend " + petlist.toString();
	}

	
}
