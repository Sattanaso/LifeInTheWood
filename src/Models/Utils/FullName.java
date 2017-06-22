package Models.Utils;

public class FullName {
	private String familyName;
	private String ownerName;

	public FullName() {
	}

	public FullName(String familyName, String ownerName) {
		setFamilyName(familyName);
		setOwnerName(ownerName);
	}

	public String getFamilyName() {
		return this.familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getOwnerName() {
		return this.ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s", this.familyName, this.ownerName);
	}
}
