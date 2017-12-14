import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TemperatureWindow extends JFrame implements ActionListener{
    private JButton ctof;
    private JButton ftoc;
    private JTextField degree;
    private Container pane;

    public TemperatureWindow() {
	this.setTitle("Temperature Converter");
	this.setSize(500,100);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
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
	if (ftoc.isSelected()) {
	    double temp = Double.parseDouble(degree.getText());
	    degree.setText(Double.toString(FtoC(temp)));
	}
	if (ctof.isSelected()) {
	    double temp = Double.parseDouble(degree.getText());
	    degree.setText(Double.toString(CtoF(temp)));
	}   
    }
    
    public static double CtoF(double t) {
	return (t * (9.0/5)) + 32;
    }
    public static double FtoC(double t) {
	return (t - 32)*(5.0/9);
    }

    public static void main(String[] args) {
	TemperatureWindow a = new TemperatureWindow();
	a.setVisible(true);
    }
}
