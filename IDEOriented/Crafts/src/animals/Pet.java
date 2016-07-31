
package animals;

class Pet {
	protected String petName;
	protected String ownerName;
	protected String color;
	protected int sex;
	Pet(String petName, String ownerName, String color) {
		this.petName = petName;
		this.ownerName = ownerName;
		this.color = color;
	}
	void setSex(int sexId) {
		this.sex = sexId;
	}
	String getPetName() {
		return this.petName;
	}
	String getOwnerName() {
		return this.ownerName;
	}
	String getColor() {
		return this.color;
	}
	int getSex() {
		return this.sex;
	}
	public String toString() {
		return this.petName + ", owned by " + this.ownerName + ". Color: " + this.color + ", gender: " + this.sex + ".";
	}

}
