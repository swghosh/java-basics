package animals;

public class AnimalHospital {
	Pet[] pets;
	AnimalHospital(Pet[] pets) {
		this.pets = pets;
	}
	void printPetInfoByName(String name) {
		for(int i = 0; i < pets.length; i++) {
			if(pets[i].getPetName().equals(name)) {
				System.out.println(pets[i].toString());
			}
		}
	}
	void printPetInfoByOwnerName(String ownerName) {
		for(int i = 0; i < pets.length; i++) {
			if(pets[i].getOwnerName().equals(ownerName)) {
				System.out.println(pets[i].toString());
			}
		}
	}
	void printPetBoarding(int month, int day, int year) {
		
	}

	public static void main(String[] args) {
		Pet[] pets = new Pet[2];
		
		pets[0] = new Cat("Mike", "Henry Josh", "Black", "12mm");
		pets[0].setSex(1);
		
		pets[1] = new Dog("Bill", "Jerry Martin", "White", "Small");
		pets[1].setSex(2);
		
		AnimalHospital h = new AnimalHospital(pets);
		h.printPetInfoByName("Mike");
		h.printPetInfoByOwnerName("Jerry Martin");
	}

}
