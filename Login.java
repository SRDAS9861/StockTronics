package pack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
	JFrame frame;
	JPanel panel;
	JLabel title, userLabel, passwordLabel;
	JTextField userText;
	JPasswordField passwordText;
	JButton loginButton;
	

    Login() {
        frame = new JFrame("StockTronics - Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 300);
        frame.setLocationRelativeTo(null); // center the frame

        panel = new JPanel();
        panel.setBackground(new Color(20, 140, 118)); // light blue
        panel.setLayout(null);

        title = new JLabel("Welcome to StockTronics");
        title.setFont(new Font("Verdana", Font.BOLD, 20));
        title.setForeground(new Color(8, 15, 158)); // dark blue
        title.setBounds(90, 20, 300, 30);
        panel.add(title);

        userLabel = new JLabel("Username:");
        userLabel.setBounds(80, 80, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(170, 80, 180, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(80, 120, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(170, 120, 180, 25);
        panel.add(passwordText);

        loginButton = new JButton("Login");
        loginButton.setBounds(170, 170, 100, 30);
        loginButton.setBackground(new Color(242, 147, 92));
        loginButton.setForeground(Color.WHITE);
        loginButton.addActionListener(this);
        panel.add(loginButton);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
    
    @Override
	public void actionPerformed(ActionEvent ae) {
    	String username = userText.getText();
        String password = new String(passwordText.getPassword());
        if(ae.getSource() == loginButton) {
        	if (username.equals("admin") && password.equals("admin123")) {
//              JOptionPane.showMessageDialog(frame, "Login successful. Welcome to StockTronics!");
              frame.dispose();
              new Index().setVisible(true);
        	}else{
              JOptionPane.showMessageDialog(frame, "Invalid credentials. Try again.");
          }
		}
	}
    
    public static void main(String[] args) {
        new Login();
    }
}