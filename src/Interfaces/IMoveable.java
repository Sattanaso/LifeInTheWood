package Interfaces;

import Enums.Direction;
import Models.Utils.Point;

public interface IMoveable {
	void move(Direction dir);
	
	void moveTo(Point point);
	
	Integer getSpeed();
	
	void setSpeed(Integer speed);
}
