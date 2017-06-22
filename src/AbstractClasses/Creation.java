package AbstractClasses;

import Enums.Sex;
import Interfaces.ICreation;
import Models.Utils.Point;

public abstract class Creation implements ICreation {
	private boolean isAlive;
	private Sex sex;
	private String family;
	private String name;
	private Point position;

	// =============================================
	
	protected Creation() {
	}

	protected Creation(String family, String name, Sex sex) {
		setIsAlive(true);
		setFamilyName(family);
		setOwnerName(name);
		setSex(sex);
	}

	// =============================================

	public boolean getIsAlive() {
		return this.isAlive;
	}

	public void setIsAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	// =============================================

	public Sex getSex() {
		return this.sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	// =============================================

	public String getFamilyName() {
		return this.family;
	}

	public void setFamilyName(String family) {
		this.family = family;
	}

	// =============================================

	public String getOwnerName() {
		return this.name;
	}

	public void setOwnerName(String name) {
		if (name != null) {
			this.name = name;
		}
	}

	// =============================================

	public Point getPosition() {
		return this.position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}


	@Override
	public String toString() {
		return String.format("%s %s", this.getFamilyName(), this.getOwnerName());
	}
	// =============================================
}
