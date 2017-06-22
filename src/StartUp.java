import Enums.Sex;
import Models.Humans.*;
import Models.Utils.Point;

public class StartUp {

	public static void main(String[] args) {
		
		Hunter hunt = new Hunter("Mladenov", "Petar", Sex.Male);
		Hunter hunt1 = new Hunter("Mladenov", "Petar", Sex.Male, 92);
		
		

		Point huntPosition = new Point(33, 66);
		hunt.setPosition(huntPosition);

		System.out.println(hunt.toString());
		System.out.println(hunt.getSex());
		System.out.println("Position: ");
		System.out.print("X: " + hunt.getPosition().getX());
		System.out.println(" Y: " + hunt.getPosition().getY());
		
		System.out.println(hunt.getAccuracy());
		System.out.println(hunt1.getAccuracy());
	}

}
