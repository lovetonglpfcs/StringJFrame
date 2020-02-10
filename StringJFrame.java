import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
import javax.swing.*;
public class StringJFrame extends JFrame implements ActionListener{
	private Button okBtn;
	private JLabel strLabel, xLabel, yLabel;
	private JTextField strField, xField, yField;
	String mesg;
	int x, y;
	public void actionPerformed(ActionEvent event) {
		mesg = strField.getText();
		x = Integer.parseInt(xField.getText() );
		y = Integer.parseInt(yField.getText() );
		repaint();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJFrame S = new StringJFrame();
		

	}
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.BLUE);
		g.drawRect(15,40, 330,80);
		g.setColor(Color.BLACK);
		g.drawString(mesg, x+15, y+130);
		
	}
	public StringJFrame(){
		setTitle("JFrame");
		Container c = getContentPane();
		c.setLayout( new FlowLayout());
		strLabel = new JLabel("Enter String : ");
		c.add(strLabel);
		strField = new JTextField(20);
		c.add(strField);
		xLabel = new JLabel("Coordinate X : ");
		c.add(xLabel);
		xField = new JTextField(5);
		c.add(xField);
		yLabel = new JLabel("Coordinate Y : ");
		c.add(yLabel);
		yField = new JTextField(5);
		c.add(yField);
		okBtn = new Button(" OK ");
		okBtn.addActionListener(this);
		c.add(okBtn);
		setSize( 360,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
}