package animals;

class Cat extends Pet implements Boardable {
	protected String hairLength;
	Cat(String petName, String ownerName, String color, String hairLength) {
		super(petName, ownerName, color);
		this.hairLength = hairLength;
	}
	public void setBoardStart(int month, int day, int year) {
		
	}
	public void setBoardEnd(int month, int day, int year) {
		
	}
	public boolean boarding(int month, int day, int year) {
		return false;
	}
	String getHairLength() {
		return this.hairLength;
	}
	public String toString() {
		return super.toString() + " Hair length: " + this.hairLength;
	}
}
