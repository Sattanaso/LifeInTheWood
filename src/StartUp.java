import Enums.Sex;
import Models.Humans.*;
import Models.Utils.Point;

public class StartUp {

	public static void main(String[] args) {
		Hunter hunt = new Hunter();
		
		hunt.setFamily("Mladenov");
		hunt.setName("Petar");
		hunt.setPosition(new Point(3, 6));
		hunt.setSex(Sex.Male);
		
		String familyName = hunt.getFamily();
		String ownerName = hunt.getName();
		
		String fullName = String.format("%s %s", familyName, ownerName);
		
		System.out.println(fullName);
		
		System.out.println(hunt.getSex());
		
		System.out.println("Position: ");
		System.out.print("X: " + hunt.getPosition().getX());
		System.out.println(" Y: " + hunt.getPosition().getY());
	}

}
