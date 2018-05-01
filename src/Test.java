
public class Test {

	public static void main(String[] args) {
		Pet petlist[] = new Pet[4]; 
		Dog xiaohei = new Dog("xiaohei",1);
		Cat xiaohuang = new Cat("xiaohuang",2);
		Dog xiaobai = new Dog("xiaobai",3);
		Cat xiaochou = new Cat("xiaochou",4);
		
		petlist[0] = xiaohei;
		petlist[1] = xiaohuang;
		petlist[2] = xiaobai;
		petlist[3] = xiaochou;
		
		for (int i = 0; i < petlist.length; i++) {
			System.out.println(petlist[i].toString());
		}
		
		grilFriend gf = new grilFriend();
		
		gf.petAdopt(xiaohei);
		gf.petAdopt(xiaohuang);
		System.out.println(gf.toString());
	}

}
