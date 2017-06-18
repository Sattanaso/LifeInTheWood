package Hierarchy;

import Interfaces.IHunter;

public class Hunter  extends Human implements IHunter{

	protected Hunter(int years, String family, boolean canMove) {
		super(years, family, canMove);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int childrenNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

}
