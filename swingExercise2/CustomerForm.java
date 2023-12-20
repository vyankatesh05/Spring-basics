package core.spring.swingExercise2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import core.spring.annotation.Employee;

public class CustomerForm extends JFrame implements ActionListener {

    private JTextField nameField;
    private JTextField accountNo1Field;
    private JTextField balance1Field;
    private JTextField address1Field;
    private JTextField address2Field;
    private JTextField accountNo2Field;
    private JTextField balance2Field;
    private JButton submitButton;
    
    
    private ApplicationContext context;
    
    
    public CustomerForm() {
        setTitle("Customer Details");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Initialize Spring context
        context = new ClassPathXmlApplicationContext("core/spring/swingExercise2/config.xml");

        // Create components
        nameField = new JTextField(20);
        accountNo1Field = new JTextField(10);
        balance1Field = new JTextField(10);
        address1Field = new JTextField(20);
        address2Field = new JTextField(20);
        accountNo2Field = new JTextField(10);
        balance2Field = new JTextField(10);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        // Create panels
        JPanel mainPanel = new JPanel(new GridLayout(3, 3));

        JPanel row1Panel = new JPanel();
        row1Panel.add(new JLabel("Name:"));
        row1Panel.add(nameField);
        row1Panel.add(new JLabel("Account No 1:"));
        row1Panel.add(accountNo1Field);
        row1Panel.add(new JLabel("Balance 1:"));
        row1Panel.add(balance1Field);

        JPanel row2Panel = new JPanel();
        row2Panel.add(new JLabel("Address 1:"));
        row2Panel.add(address1Field);
        row2Panel.add(new JLabel("Address 2:"));
        row2Panel.add(address2Field);
        row2Panel.add(new JLabel("Account No 2:"));
        row2Panel.add(accountNo2Field);
        row2Panel.add(new JLabel("Balance 2:"));
        row2Panel.add(balance2Field);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(submitButton);

        // Add panels to the main panel
        mainPanel.add(row1Panel);
        mainPanel.add(row2Panel);
        mainPanel.add(buttonPanel);

        // Add main panel to the frame
        add(mainPanel);

        // Set frame visibility
        setVisible(true);
    }

   
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
        	
        	Customer customer = (Customer) context.getBean("customer");
        	System.out.println(customer);
        }
    }


    public static void main(String[] args) {
        new CustomerForm();
    }
}
