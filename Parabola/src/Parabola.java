import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Parabola extends JFrame
{
	class GraphPanel extends JPanel
	{
		protected void paintComponent(Graphics g)
		{
			Polygon p =new Polygon();
			String yArrow= "^";
			g.drawString(yArrow, 9, 10);
			String yLabel= "y";
			g.drawString(yLabel, 2, 10);
			
			String xArrow= ">";
			g.drawString(xArrow, 290, 204);
			String xLabel= "x";
			g.drawString(xLabel, 290, 213);
			double scaleFactor = 0.1;
			for (int x=-100; x<=100; x++)//the loop for the parabola
			{
				p.addPoint(x+150, 200- (int)(scaleFactor *x *x));
			}
			//g.drawPolygon(p);
			for (int y=-100; y<=200;y++)//moving y up to 300 extends its length
			{
				p.addPoint(13,y);//y coordinates
			}
			for(int x=-100;x<=300;x++)//moving x up to 300 extends its length
			{
				p.addPoint(x+10, 200);//x coordinates
			}
			
			g.drawPolyline(p.xpoints, p.ypoints, p.npoints);
		}
	}
}