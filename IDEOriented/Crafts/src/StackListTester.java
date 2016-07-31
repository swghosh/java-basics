
import java.util.*;
public class StackListTester {

	public static void main(String[] args) {
		StackList list = null;
		Scanner sc = new Scanner(System.in);
		boolean exit=false;
		while(exit!=true) {
			System.out.println("------||MENU||------");
			System.out.println("1-Initialise Stack List");
			System.out.println("2-Push");
			System.out.println("3-Pop");
			System.out.println("4-Display");
			System.out.println("0-Exit");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
				list = new StackList();
				break;
			case 2:
				System.out.print("\nElement ->");
				int element = sc.nextInt();
				list.push(new Node(element));
				break;
			case 3:
				list.pop();
				break;
			case 4:
				System.out.println(list.toString());
				break;
			case 0:
				exit = true;
				break;
			default:
				System.err.println("Wrong Choice!");
			}
		}
		sc.close();
	}

}
