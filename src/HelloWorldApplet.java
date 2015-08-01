import java.applet.Applet;
import java.awt.Graphics;

public class HelloWorldApplet extends Applet {

	private static final long serialVersionUID = -4874661600202458094L;

	public void init() {
		resize(150, 25);
	}

	public void paint(Graphics g) {
		g.drawString("Hello world!", 50, 25);
	}
}