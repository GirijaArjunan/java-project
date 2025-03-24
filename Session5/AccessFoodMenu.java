package Session5;

public class AccessFoodMenu implements VegItems, NonVegItems {

	@Override
	public void fry() {
		System.out.println("chicken gravy, fish fry, mushrom fry");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gravy() {
		System.out.println("chicken gravy, mutton gravy, egg gravy");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breakfast() {
		System.out.println("idly,dosa,sambar,chutney chutney e e...");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lunch() {
		System.out.println("Briyani, fried rice,ghee rice");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		AccessFoodMenu afm =  new AccessFoodMenu();
		afm.breakfast();
		afm.lunch();
	    afm.fry();
	    afm.gravy();
	}

}
