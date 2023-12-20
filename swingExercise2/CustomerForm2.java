package core.spring.swingExercise2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerForm2 extends JFrame implements ActionListener{
	private JLabel nameLabel,addressLabel, accountNumberLabel, accountBalanceLabe;;
    private JTextField nameField, addressField1, addressField2 ,accountNumberField1, accountNumberField2, accountBalanceField1,accountBalanceField2;
    private JButton submitButton;
    private JPanel panel;

    private ApplicationContext context;
    
    public CustomerForm2() {
    	super("Account Details");
        setSize(1000, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize Spring context
        context = new ClassPathXmlApplicationContext("core/spring/swingExercise2/config.xml");

        panel = new JPanel();
        panel.setLayout(null);
        
        //name part
        nameLabel = new JLabel("Name :");
        nameLabel.setBounds(10, 10, 100, 25);
        panel.add(nameLabel);
        
        nameField = new JTextField();
        nameField.setBounds(10, 40, 200, 25);
        panel.add(nameField);

        
        
       //Address Part
        addressLabel = new JLabel("Address :");
        addressLabel.setBounds(300, 10, 100, 25);
        panel.add(addressLabel);
        
        addressField1 = new JTextField();
        addressField1.setBounds(300, 40, 200, 25);
        panel.add(addressField1);
        
        addressField2 = new JTextField();
        addressField2.setBounds(300, 80, 200, 25);
        panel.add(addressField2);
        
        
        
        //Account Number part
        accountNumberLabel = new JLabel("Account Number :");
        accountNumberLabel.setBounds(550, 10, 100, 25);
        panel.add(accountNumberLabel);
        
        accountNumberField1 = new JTextField();
        accountNumberField1.setBounds(550, 40, 200, 25);
        panel.add(accountNumberField1);
        
        accountNumberField2 = new JTextField();
        accountNumberField2.setBounds(550, 80, 200, 25);
        panel.add(accountNumberField2);
        
        
        
        
        //Account balance part
        accountBalanceLabe = new JLabel("Account Balance :");
        accountBalanceLabe.setBounds(800, 10, 150, 25);
        panel.add(accountBalanceLabe);
        
        accountBalanceField1 = new JTextField();
        accountBalanceField1.setBounds(800, 40, 200, 25);
        panel.add(accountBalanceField1);
        
        accountBalanceField2 = new JTextField();
        accountBalanceField2.setBounds(800, 80, 200, 25);
        panel.add(accountBalanceField2);
        
        
        submitButton = new JButton("Get Details");
        submitButton.setBounds(500, 180, 100, 25);
        submitButton.addActionListener(this);
        panel.add(submitButton);
        
        
        add(panel);
        setVisible(true);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==submitButton) {
			Customer customer = (Customer)context.getBean("customer");
			
			String enteredName = nameField.getText();
			
			if(customer.getName().equals(enteredName)) {
				addressField1.setText(customer.getaddress().get(0));
				addressField2.setText(customer.getaddress().get(1));
				
				accountNumberField1.setText(String.valueOf(customer.getAccounts().get(0).getAccountNumbers().get(0)));
                accountNumberField2.setText(String.valueOf(customer.getAccounts().get(1).getAccountNumbers().get(0)));

                accountBalanceField1.setText(String.valueOf(customer.getAccounts().get(0).getBalances().get(0)));
                accountBalanceField2.setText(String.valueOf(customer.getAccounts().get(1).getBalances().get(0)));
			}
			
		}else {
            // If the names don't match, you can handle it accordingly (e.g., show an error message)
            JOptionPane.showMessageDialog(this, "Customer not found for the entered name.", "Error", JOptionPane.ERROR_MESSAGE);
        }
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CustomerForm2();

	}


}
