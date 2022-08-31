package android;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Apple {
	public static void main(String args[]) {
	
	
    String fn = JOptionPane.showInputDialog("Enter first number");
    String sn = JOptionPane.showInputDialog("Enter second number");
    
    int num1 = Integer.parseInt(fn);
    int num2 = Integer.parseInt(sn);
    int sum = num1 + num2;
    
    JOptionPane.showMessageDialog(null, "The answer is " + sum, "the title", JOptionPane.PLAIN_MESSAGE);
	
	Graphic bucky = new Graphic();
	bucky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	bucky.setSize(275,180);
	bucky.setVisible(true);
	
	
	Graphic bucky1 = new Graphic();
	bucky1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	bucky1.setSize(350,100);
	bucky1.setVisible(true);
	}
}



