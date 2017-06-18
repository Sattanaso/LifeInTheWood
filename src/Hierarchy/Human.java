package Hierarchy;

import Interfaces.IHuman;
import Enums.Sex;

public abstract class Human extends Creation implements IHuman {
	private String name;
	private Sex sex;

	protected Human(int years, String family, boolean canMove) {
		super(years, family, canMove);
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public Sex getSex() {
		return sex;
	}

	protected void setSex(Sex sex) {
		this.sex = sex;
	}

}
