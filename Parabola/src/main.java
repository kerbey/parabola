
import javax.swing.JFrame;


public class main 
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Parabola");
		Parabola p = new Parabola();
		Parabola.GraphPanel G= p.new GraphPanel();//both the main and inner classes are called then added to the frame
		frame.setVisible(true);
		frame.setSize(300, 300);
		frame.add(G);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}