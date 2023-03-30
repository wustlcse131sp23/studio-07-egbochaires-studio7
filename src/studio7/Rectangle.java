package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private static double height;
	private static double length;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdDraw.rectangle(.5, .5, .25, .25);
		StdDraw.rectangle(.5, .5, .4, .4);
		Rectangle r = new Rectangle(10,5);
		Rectangle r2 = new Rectangle (15.0, 4.0);
		System.out.print(r.compareArea(r2));
	}
	public double Area() {
		return length*height;
	}
	public Rectangle(double l, double h) {
		height = h;
		length = l;
		Area();
		double perimeter = 2*h + 2*l;

		}

	
	/**
	 * 
	 * @return
	 * 
	 */
public int compareArea(Rectangle a) {
	double area1 = this.Area();
	double area2 = a.Area();
	if (area1 > area2) {
		return 2;
	}
	if(area2> area1) {
		return 1;
	}
	if(area1 == area2) {
		return 0;
	}
	return 4;
}
public boolean Square() {
	boolean square = false;
	double perimeter = 2*height + 2*length;
	double area = Area();
	if (area == height*height) {
		square = true;
	}
	return square;
}

public boolean die(int n, int r) {
	int []poo = new int[n];
	for (int i = 0; i < r; i++) {
		int roll = (int) Math.random()*n;
		poo [roll]++;
	}
	return n + ":" + poo[roll];
}
	
}

