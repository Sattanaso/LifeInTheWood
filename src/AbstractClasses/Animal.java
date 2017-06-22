package AbstractClasses;

import Enums.Sex;
import Interfaces.IAnimal;

public abstract class Animal  extends Creation implements IAnimal{

	protected Animal(String family, String name, Sex sex) {
		super(family, name, sex);
		// TODO Auto-generated constructor stub
	}

}
