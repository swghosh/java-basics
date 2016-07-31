package animals;

class Dog extends Pet implements Boardable {
	protected String size;
	Dog(String petName, String ownerName, String color, String size) {
		super(petName, ownerName, color);
		this.size = size;
	}
	public void setBoardStart(int month, int day, int year) {
		
	}
	public void setBoardEnd(int month, int day, int year) {
		
	}
	public boolean boarding(int month, int day, int year) {
		return false;
	}
	String getSize() {
		return this.size;
	}
	public String toString() {
		return super.toString() + " Size: " + this.size;
	}
}
