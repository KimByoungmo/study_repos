package solution;

public class MyPoint {
	//class variables
	private int x;
	private int y;

	//class methods

	public void setX(int px) {
		x = px;
	}
	public void setY(int py) {
		y = py;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	// class generators
	public MyPoint () {
		this.setX(0);
		this.setY(0);
	}
	public MyPoint(int px, int py) {
		this.setX(px);
		this.setY(py);
	}}
