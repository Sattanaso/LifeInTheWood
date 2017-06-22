package AbstractClasses;

import Enums.Sex;
import Interfaces.IPlant;

public abstract class Plant extends Creation implements IPlant {

	protected Plant(String family, String name, Sex sex) {
		super(family, name, sex);
		// TODO Auto-generated constructor stub
	}

}
