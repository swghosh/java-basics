package animals;

interface Boardable {
	//int month, day, year;
	/*
	 * Interfaces cannot have instance variables
	 * "An interface declares only constants and not the instance variables. All variables declared in any interface must be public, static or final." 
	 * -SCJP Study Guide
	 */
	void setBoardStart(int month, int day, int year);
	void setBoardEnd(int month, int day, int year);
	boolean boarding(int month, int day, int year);
}