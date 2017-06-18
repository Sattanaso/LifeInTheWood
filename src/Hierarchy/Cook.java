package Hierarchy;

import Interfaces.IHuman;

public class Cook extends Human implements IHuman {

	protected Cook(int years, String family, boolean canMove) {
		super(years, family, canMove);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int childrenNumber() {
		// TODO Auto-generated method stub
		return 0;
	}
}
