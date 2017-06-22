package Models.Utils;

public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
    	setX(x);
    	setY(y);
    }

    public int getX() {
        return this.x;
    }
    public void setX(int x) {
    	this.x = x;
    }

    public int getY() {
        return this.y;
    }
    public void setY(int y) {
    	this.y = y;
    }

}
