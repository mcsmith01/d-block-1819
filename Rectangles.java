import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Rectangles extends JComponent {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new Rectangles());
		frame.setVisible(true);
	}

	@Override
	public void paintComponent(Graphics g) {
		Rectangle rect = new Rectangle(50, 50, 60, 50);
		Graphics2D g2d = (Graphics2D) g;
		g2d.draw(rect);
		rect.translate(100, 200);
		g2d.setColor(Color.YELLOW);
		g2d.draw(rect);
	}
}
