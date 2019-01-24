// COURSE: CSCI1620
// TERM: Spring 2019
//
// NAME: Cameron Gilinsky and Carter Kennell
// RESOURCES: Worked with Cameron Gilinsky


public class Ball
{
	private int x, y; //position variables
	private int dx, dy; //trajectory constants?
	private static final int DX = 3;
	private static final int DY = 3;
	private static final int POSITION = 100;
	
	//constructor
	public Ball()
	{
		x = POSITION;
		y = POSITION;
		dx = DX;
		dy = DY;
	}
	
	public Ball(int x, int y)
	{
		
		this.x = x;
		this.y = y;
		dx = DX;
		dy = DY;
		
	}
	
	//method time
	
	public void bounceHorizontal()
	{
		dx *= -1;
	}
	
	public void bounceVertical()
	{
		dy *= -1;
	}
	
	public int getRadius()
	{
		int radius = x / 2;
		return radius;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void moveOnce()
	{
		x += dx;
		y += dy;
	}
	
	public String toString()
	{
		return String.format("Ball at (%d,%d) moving (%d,%d)", x, y, dx, dy);
	}
}
