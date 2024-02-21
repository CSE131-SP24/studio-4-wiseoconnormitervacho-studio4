package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(46,250,5);
		StdDraw.filledRectangle(0.5, 0.5, 0.3, 0.2);
		StdDraw.setPenColor(246,250,5);
		StdDraw.filledRectangle(0.5, 0.5, 0.2, 0.15);
		StdDraw.setPenColor(5,250,209);
		StdDraw.filledCircle(0.5, 0.5, 0.1);
		StdDraw.setPenColor(5,250,209);
		StdDraw.setPenRadius(0.05);
		StdDraw.rectangle(0.5, 0.5, 0.3, 0.2);
		StdDraw.setPenRadius(0.002);
		
	}
}