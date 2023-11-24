import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame {

    private JLabel nameLabel = new JLabel("Name:");
    private JTextField nameField = new JTextField();

    private JLabel emailLabel = new JLabel("Email:");
    private JTextField emailField = new JTextField();

    private JLabel passwordLabel = new JLabel("Password:");
    private JPasswordField passwordField = new JPasswordField();

    private JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
    private JPasswordField confirmPasswordField = new JPasswordField();

    private JButton registerButton = new JButton("Register");
    private JButton resetButton = new JButton("Reset");
    private JButton closeButton = new JButton("Close");

    public RegistrationForm() {
        super("Registration Form");
        setLayout(new GridLayout(6, 2));

        add(nameLabel);
        add(nameField);

        add(emailLabel);
        add(emailField);

        add(passwordLabel);
        add(passwordField);

        add(confirmPasswordLabel);
        add(confirmPasswordField);

        add(registerButton);
        add(resetButton);
        add(closeButton);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());
                String confirmPassword = new String(confirmPasswordField.getPassword());

                if (empty(name) || empty(email) || empty(password) || empty(confirmPassword)) {
                    JOptionPane.showMessageDialog(null, "Please fill in all required fields.");
                } else if (!password.equals(confirmPassword)) {
                    JOptionPane.showMessageDialog(null, "The passwords do not match.");
                } else {
                    // Register the user
                }
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                emailField.setText("");
                passwordField.setText("");
                confirmPasswordField.setText("");
            }
        });

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        pack();
        setVisible(true);
    }

    private boolean empty(String string) {
        return string == null || string.isEmpty();
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}
