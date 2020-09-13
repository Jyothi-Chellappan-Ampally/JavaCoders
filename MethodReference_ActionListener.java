package java8;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MethodReference_ActionListener extends JFrame{
	
	
	   private JButton button;
	   public MethodReference_ActionListener() {
	      setTitle("Method Reference Button Listener");
	      button = new JButton("Method Reference");
	      button.setBorder(BorderFactory.createLineBorder(Color.black));
	      button.addActionListener(MethodReference_ActionListener :: executeMethod); // static method reference
	      getContentPane().add(button, BorderLayout.NORTH);

	      setSize(400, 300);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setLocationRelativeTo(null);
	      setVisible(true);
	   }
	  
	   public static void executeMethod(ActionEvent e) {
	      JOptionPane.showMessageDialog(null, ((JButton)e.getSource()).getText());
	   }
	   
	   public static void main(String args[]) throws Exception {
		      new MethodReference_ActionListener();
		   }
	}
