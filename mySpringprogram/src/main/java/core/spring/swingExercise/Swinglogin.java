package core.spring.swingExercise;

import javax.swing.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import core.spring.swingExercise.Login;

import java.awt.*;
import java.awt.event.*;

public class Swinglogin extends JFrame implements ActionListener {

    private JLabel nameLabel, passwordLabel;
    private JTextField nameField;
    private JPasswordField passwordField;
    private JButton submitButton;
    private JPanel panel;

    private ApplicationContext context;

    public Swinglogin() {
        super("Login");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize Spring context
        context = new ClassPathXmlApplicationContext("core/spring/swingExercise/config.xml");

        panel = new JPanel();
        panel.setLayout(null);

        nameLabel = new JLabel("username:");
        nameLabel.setBounds(10, 10, 100, 25);
        panel.add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(120, 10, 200, 25);
        panel.add(nameField);

        passwordLabel = new JLabel("password:");
        passwordLabel.setBounds(10, 45, 100, 25);
        panel.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(120, 45, 200, 25);
        panel.add(passwordField);

        submitButton = new JButton("Submit");
        submitButton.setBounds(120, 80, 100, 25);
        submitButton.addActionListener(this);
        panel.add(submitButton);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String username = nameField.getText();
            String password = String.valueOf(passwordField.getPassword());

            // Retrieve the Login object from Spring context
            Login login = (Login) context.getBean("login");

            // Validate login credentials
            if (username.equals(login.getUsername()) && password.equals(login.getPassword())) {
                JOptionPane.showMessageDialog(null, "Login successful!");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid credentials!");
            }
        }
    }

    public static void main(String[] args) {
        new Swinglogin();
    }
}
