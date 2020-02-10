import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
import javax.swing.*;
public class Chap09_03JFrame extends JFrame implements KeyListener{
	int x = 20, y = 120;
	String text = "Text";
	
	public void keyPressed(KeyEvent e) {
		text = "char = " + e.getKeyChar();
		text += ", "+ e.getKeyText(e.getKeyCode() );
		text += ", code = " + e.getKeyCode();
	}
	public void keyReleased(KeyEvent event) {
		repaint();
	}
	public void keyTyped(KeyEvent event) {
		Graphics g = getGraphics();
		g.drawOval( x, y, 50, 50);
	}
	
	public Chap09_03JFrame(){
		addKeyListener(this);
		setFocusable(true);
		setFont(new Font("Arial", Font.BOLD, 20) );
		setForeground( Color.BLUE );
		setSize(640, 480);
		setVisible(true);


	}
	public void paint(Graphics g) {
		super.paint(g);
		g.drawString( text , x+100, y+100);
	}
	public static void main(String[] args) {
		Chap09_03JFrame S = new Chap09_03JFrame();
	
	}
	
}