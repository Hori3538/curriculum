package check;
import constants.Constants;

public class Check {
	private static String firstName = "Yuya";
	private static String lastName = "Horiike";

	public static void printName(String firstName, String lastName) {
		System.out.println(lastName + firstName);
	}

	public static void main(String[] args) {
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		RobotPet robotpet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);

		System.out.print("printNameメソッド　→　");
		printName(firstName, lastName);

		pet.introduce();
		robotpet.introduce();
	}
}
