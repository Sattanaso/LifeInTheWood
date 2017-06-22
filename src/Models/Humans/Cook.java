package Models.Humans;

import AbstractClasses.Human;
import Enums.Direction;
import Enums.Sex;
import Interfaces.ICook;
import Models.Utils.Point;

public class Cook extends Human {

	protected Cook(String family, String name, Sex sex) {
		super(family, name, sex);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(Direction dir) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveTo(Point point) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getSpeed() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSpeed(Integer speed) {
		// TODO Auto-generated method stub
		
	}
	
}
