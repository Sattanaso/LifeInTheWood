package AbstractClasses;

import Enums.Sex;
import Interfaces.IHuman;
import Interfaces.IMoveable;
import Models.Utils.FullName;;

public abstract class Human extends Creation implements IMoveable, IHuman {
	protected Human() {
		super();
	}

	protected Human(String family, String name, Sex sex) {
		super(family, name, sex);
		// TODO Auto-generated constructor stub
	}

}
