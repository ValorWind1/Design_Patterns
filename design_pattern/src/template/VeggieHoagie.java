package template;

public class VeggieHoagie  extends Hoagie{


String [] veggiesUsed = {"Lettuce","Tomatoes","Onions","Sweet Peppers"};
String [] condimentsUsed = {"Oil","Vinegar"};

boolean customerWantsMeat() {
	return false;
}
boolean customerWantsCheese() {
	return false;
}

@Override
void addMeat() {
	
}

@Override
void addCheese() {
	
}

@Override
void addVegetables() {
	System.out.println("Adding the Vegetables: ");
	
	for(String veggie : veggiesUsed) {
		System.out.println(veggie + " ");
	}
	
}

@Override
void addCondiments() {
	
	System.out.println("Adding the Condiments: ");
	
	for(String condiments : condimentsUsed) {
		System.out.println(condiments + " ");
	}
	
	
	
}




}

