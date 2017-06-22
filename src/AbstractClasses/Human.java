package AbstractClasses;

import Enums.Sex;
import Interfaces.IHuman;
import Models.Utils.FullName;;

public abstract class Human extends Creation implements IHuman {
	private FullName fullName;
	protected Human() {
		super();
	}

	protected Human(String family, String name, Sex sex) {
		super(family, name, sex);
		// TODO Auto-generated constructor stub
	}

	public FullName getFullName() {
		return this.fullName;
	}

	public void setFullName(FullName fullName) {
		this.fullName = fullName;
	}

}
