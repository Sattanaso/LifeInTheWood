package Hierarchy;

import Interfaces.IChild;

public class Child extends Human implements IChild{

	protected Child(int years, String family, boolean canMove) {
		super(years, family, canMove);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int childrenNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

}
