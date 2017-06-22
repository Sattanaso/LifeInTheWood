package Interfaces;

import Enums.Sex;
import Models.Utils.Point;

public interface ICreation {
	boolean getIsAlive();

	void setIsAlive(boolean isAlive);

	String getFamilyName();

	void setFamilyName(String family);

	String getOwnerName();

	void setOwnerName(String name);

	Sex getSex();

	void setSex(Sex sex);

	Point getPosition();

	void setPosition(Point position);

}
