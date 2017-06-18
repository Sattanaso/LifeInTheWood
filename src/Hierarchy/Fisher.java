package Hierarchy;

import Interfaces.IFisher;

public class Fisher extends Human implements IFisher{

	protected Fisher(int years, String family, boolean canMove) {
		super(years, family, canMove);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int childrenNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

}
