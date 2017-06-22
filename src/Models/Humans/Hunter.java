package Models.Humans;

import AbstractClasses.Human;
import Enums.Direction;
import Enums.Sex;
import Interfaces.IHunter;
import Interfaces.IMoveable;
import Models.Utils.Point;

public class Hunter  extends Human implements IHunter{
	private Integer accuracy = 0;
	private Integer speed = 0;
	
	public Hunter() {
		super();
	}

	public Hunter(String family, String name, Sex sex) {
		super(family, name, sex);
		// TODO Auto-generated constructor stub
	}

	public Hunter(String family, String name, Sex sex, Integer accuracy) {
		super(family, name, sex);
		this.setAccuracy(accuracy);
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

	@Override
	public Integer getAccuracy() {
		return this.accuracy;
	}

	private void setAccuracy(Integer accuracy) {
		this.accuracy = accuracy;
	}

	@Override
	public Object shoot() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void move(Direction dir) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveTo(Point point) {
		// TODO Auto-generated method stub
		
	}

}
