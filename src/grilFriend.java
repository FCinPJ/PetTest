
public class grilFriend {
	StringBuffer petlist = new StringBuffer();
	
	public void petAdopt(Pet pet) {
		if(pet instanceof Cat) {
			petlist.append(pet);
			System.out.println("Ů����������һֻè");
		}
		if(pet instanceof Dog) {
			petlist.append(pet);
			System.out.println("Ů����������һֻ��");
		}
	}

	@Override
	public String toString() {
		return "grilFriend " + petlist.toString();
	}

	
}
