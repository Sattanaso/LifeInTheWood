package Hierarchy;

import Interfaces.IAnimal;

public abstract class Animal  extends Creation implements IAnimal{

	protected Animal(int years, String family, boolean canMove) {
		super(years, family, canMove);
		// TODO Auto-generated constructor stub
	}

}
