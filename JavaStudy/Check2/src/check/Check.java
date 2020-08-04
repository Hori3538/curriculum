package check;

public class Check {
	private static String firstName = "Yuya";
	private static String lastName = "Horiike";

	public static void printName(String firstName, String lastName) {
		System.out.println(lastName + firstName);
	}

	public static void main(String[] args) {
		Pet pet = new Pet("java吉", "hoge");
		RobotPet robotpet = new RobotPet("R2D2", "ルーク");

		System.out.print("printNameメソッド　→　");
		printName(firstName, lastName);

		pet.introduce();
		robotpet.introduce();
	}
}
