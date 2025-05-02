package pack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Index extends JFrame implements ActionListener{
	JPanel header;
	JLabel title, subTitle;
	JButton productBtn, userBtn, categoryBtn, customerBtn, orderBtn, logoutBtn;

    public Index() {
        setTitle("StockTronics - Main Form");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // Header panel
        header = new JPanel();
        header.setBackground(new Color(242, 107, 94));
        header.setBounds(0, 0, 600, 60);
        header.setLayout(new BorderLayout());

        title = new JLabel("StockTronics", SwingConstants.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 18));
        title.setForeground(Color.WHITE);
        header.add(title, BorderLayout.CENTER);
        add(header);

        subTitle = new JLabel("MAIN FORM", SwingConstants.CENTER);
        subTitle.setFont(new Font("Segoe UI", Font.BOLD, 16));
        subTitle.setBounds(0, 60, 600, 30);
        add(subTitle);

        // Buttons with icons (placeholders, add real paths)
        productBtn = createIconButton("PRODUCT", "icons/product.png");
        productBtn.setBounds(50, 120, 150, 60);
        add(productBtn);

        userBtn = createIconButton("USER", "icons/user.png");
        userBtn.setBounds(400, 120, 150, 60);
        add(userBtn);

        categoryBtn = createIconButton("CATEGORY", "icons/category.png");
        categoryBtn.setBounds(225, 120, 150, 60);
        add(categoryBtn);

        customerBtn = createIconButton("CUSTOMER", "icons/customers.png");
        customerBtn.setBounds(50, 200, 150, 60);
        add(customerBtn);

        orderBtn = createIconButton("ORDER", "icons/orders.png");
        orderBtn.setBounds(400, 200, 150, 60);
        add(orderBtn);

        logoutBtn = new JButton("LogOut");
        logoutBtn.setFont(new Font("Segoe UI", Font.BOLD, 14));
        logoutBtn.setBounds(250, 290, 100, 35);
        logoutBtn.setBackground(new Color(20, 140, 118));
        logoutBtn.addActionListener(this);
        logoutBtn.setForeground(Color.WHITE);
        add(logoutBtn);
    }

    private JButton createIconButton(String text, String iconPath) {
        ImageIcon icon = new ImageIcon(iconPath);
        Image scaledImg = icon.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        icon = new ImageIcon(scaledImg);
        JButton button = new JButton(text, icon);
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        button.setVerticalTextPosition(SwingConstants.BOTTOM);
        button.setFont(new Font("Segoe UI", Font.BOLD, 12));
        button.setBackground(Color.WHITE);
        button.setFocusPainted(false);
        return button;
    }
    
    @Override
   	public void actionPerformed(ActionEvent ae) {
    	if(ae.getSource() == logoutBtn) {
    		dispose();
    		new Login().setVisible(true);
    	}
   	}
    
    public static void main(String[] args) {
        new Index().setVisible(true);
    }
}
