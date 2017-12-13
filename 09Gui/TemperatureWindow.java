import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TemperatureWindow extends JFrame implements ActionListener{
    private JButton ctof;
    private JButton ftoc;
    private JTextField degree;
    private Container pane;

    public TemperatureWindow() {
	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());
	ftoc = new JButton("Fahrenheit to Celsius");
	pane.add(ftoc);
	ctof = new JButton("Celsius to Fahrenheit");
	pane.add(ctof);
	degree = new JTextField(5);
	pane.add(degree);
    }

    public void actionPerformed(ActionEvent e) {
	String event = e.getActionCommand();
	System.out.println(event);
	if (event.equals("Fahrenheit to Celsius")) {
	    
    }
    
    public static double CtoF(double t) {
	return (t * (9.0/5)) + 32;
    }
    public static double FtoC(double t) {
	return (t - 32)*(5.0/9);
    }

    public static void main(String[] args) {
	Window a = new Window();
	a.setVisible(true);
    }
}
