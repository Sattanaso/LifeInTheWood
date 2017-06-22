package Interfaces;

import Models.Utils.Point;

public interface IMoveable {
	void move();
	
	void moveTo(Point point);
	
	Integer getSpeed();
	
	void setSpeed(Integer speed);
}
