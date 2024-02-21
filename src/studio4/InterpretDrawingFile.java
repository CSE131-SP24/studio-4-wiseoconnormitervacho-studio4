package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File


		String shape = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean filled = in.nextBoolean();
		StdDraw.setPenColor(red, green, blue);
		if(shape.equals("rectangle")) {
			double x = in.nextDouble();
			double y = in.nextDouble();
			double halfWidth = in.nextDouble();
			double halfHeight = in.nextDouble();
			if(filled==true) {
				StdDraw.filledRectangle(x,y,halfWidth,halfHeight);
			}
			if(filled==false) {
				StdDraw.rectangle(x,y,halfWidth,halfHeight);
			}

		}

		if (shape.equals("ellipse")) {
			double x = in.nextDouble();
			double y = in.nextDouble();
			//radius
			double halfWidth = in.nextDouble();
			if(filled==true) {
				StdDraw.filledCircle(x,y,halfWidth);
			}
			if(filled==false) {
				StdDraw.circle(x,y,halfWidth);
			}
		}
		if(shape.equals("triangle")) {
			double x1 = in.nextDouble();
			double y1 = in.nextDouble();
			double x2 = in.nextDouble();
			double y2 = in.nextDouble();
			double x3 = in.nextDouble();
			double y3 = in.nextDouble();
			double[]x=new x 
			if(filled==true) {
				StdDraw.filledPolygon(x1,y1,x2,y2,x3,y3);
			
			}
			
		}


		}
	}
