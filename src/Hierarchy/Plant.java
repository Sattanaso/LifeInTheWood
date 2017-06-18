package Hierarchy;

import Interfaces.IPlant;

public abstract class Plant extends Creation implements IPlant {

	protected Plant(int years, String family, boolean canMove) {
		super(years, family, canMove);
		// TODO Auto-generated constructor stub
	}

}
