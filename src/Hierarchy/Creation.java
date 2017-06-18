package Hierarchy;

public abstract class Creation {
	private int years;
	private String family;
	private boolean canMove;

	// =============================================

	protected Creation(int years, String family, boolean canMove) {
		setYears(years);
		setFamily(family);
		setCanMove(canMove);
	}

	// =============================================

	public int getYears() {
		return years;
	}

	protected void setYears(int years) {
		this.years = years;
	}

	// =============================================

	public String getFamily() {
		return family;
	}

	protected void setFamily(String family) {
		this.family = family;
	}

	// =============================================

	public boolean getCanMove() {
		return canMove;
	}

	protected void setCanMove(boolean canMove) {
		this.canMove = canMove;
	}

	// =============================================
}
