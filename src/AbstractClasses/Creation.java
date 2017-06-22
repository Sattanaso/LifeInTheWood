package AbstractClasses;

import Enums.Sex;
import Models.Utils.Point;

public abstract class Creation {
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
		setFamily(family);
		setName(name);
	}

	// =============================================

	public boolean getIsAlive() {
		return this.isAlive;
	}

	protected void setIsAlive(boolean isAlive) {
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

	public String getFamily() {
		return this.family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	// =============================================

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
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

	// =============================================
}
