package simplepayrollsystem;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class SimplePayrollSystem extends JFrame {

    private JPanel contentPane;
    private JTextField textName;
    private JTextField textRate;
    private JTextField textHours;
    private JTextField textdays;
    private JTextField textFieldTAX;
    private JTextField textFieldPhilhealth;
    private JTextField textFieldSSS;
    private JTextField textFieldGrossSalary;
    private JTextField textFieldTotalDeduction;
    private JTextField textField_9;
    private JTextField textField_10;
    private JTextField textFieldNetSalary;

    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    SimplePayrollSystem frame = new SimplePayrollSystem();
		    frame.setVisible(true);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }
	});
    }

    /**
     * Create the frame.
     */
    public SimplePayrollSystem() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 976, 410);
	contentPane = new JPanel();
	contentPane.setForeground(new Color(255, 255, 255));
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

	setContentPane(contentPane);
	contentPane.setLayout(null);

	JLabel lblNewLabel = new JLabel("Simple Payroll System");
	lblNewLabel.setBounds(312, 10, 381, 28);
	lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
	contentPane.add(lblNewLabel);

	JLabel lblNewLabel_1 = new JLabel("Employee Name:");
	lblNewLabel_1.setBounds(53, 59, 119, 28);
	lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	contentPane.add(lblNewLabel_1);

	JLabel lblNewLabel_2 = new JLabel("New label");
	lblNewLabel_2.setBounds(211, 69, 2, -2);
	contentPane.add(lblNewLabel_2);

	textName = new JTextField();
	textName.setBounds(178, 66, 137, 19);
	contentPane.add(textName);
	textName.setColumns(10);

	JLabel lblNewLabel_3 = new JLabel("Rate Per Hour:");
	lblNewLabel_3.setBounds(63, 92, 107, 28);
	lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
	contentPane.add(lblNewLabel_3);

	JLabel lblNewLabel_4 = new JLabel("Hour Per Day:");
	lblNewLabel_4.setBounds(75, 130, 97, 28);
	lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
	contentPane.add(lblNewLabel_4);

	JLabel lblNewLabel_5 = new JLabel("Number of days worked:");
	lblNewLabel_5.setBounds(10, 168, 171, 28);
	lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
	contentPane.add(lblNewLabel_5);

	textRate = new JTextField();
	textRate.setBounds(178, 99, 137, 19);
	contentPane.add(textRate);
	textRate.setColumns(10);

	textHours = new JTextField();
	textHours.setBounds(178, 137, 137, 21);
	contentPane.add(textHours);
	textHours.setColumns(10);

	textdays = new JTextField();
	textdays.setBounds(178, 175, 137, 19);
	contentPane.add(textdays);
	textdays.setColumns(10);

	JLabel lblNewLabel_6 = new JLabel("DEDUCTION OF SALARY:");
	lblNewLabel_6.setBounds(366, 69, 208, 19);
	lblNewLabel_6.setForeground(new Color(255, 0, 0));
	lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
	contentPane.add(lblNewLabel_6);

	JLabel lblNewLabel_7 = new JLabel("TAX 15% of Monthly Wage");
	lblNewLabel_7.setBounds(335, 102, 188, 18);
	lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
	contentPane.add(lblNewLabel_7);

	JLabel lblNewLabel_8 = new JLabel("Philhealth 5%");
	lblNewLabel_8.setBounds(426, 145, 97, 13);
	lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
	contentPane.add(lblNewLabel_8);

	JLabel lblNewLabel_9 = new JLabel("SSS 2%");
	lblNewLabel_9.setBounds(464, 183, 59, 13);
	lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
	contentPane.add(lblNewLabel_9);

	textFieldTAX = new JTextField();
	textFieldTAX.setBounds(533, 101, 96, 19);
	contentPane.add(textFieldTAX);
	textFieldTAX.setColumns(10);
	textFieldTAX.setEditable(false);

	textFieldPhilhealth = new JTextField();
	textFieldPhilhealth.setBounds(533, 144, 96, 19);
	contentPane.add(textFieldPhilhealth);
	textFieldPhilhealth.setColumns(10);
	textFieldPhilhealth.setEditable(false);

	textFieldSSS = new JTextField();
	textFieldSSS.setBounds(533, 182, 96, 19);
	contentPane.add(textFieldSSS);
	textFieldSSS.setColumns(10);
	textFieldSSS.setEditable(false);

	JLabel lblNewLabel_10 = new JLabel("Gross Salary:");
	lblNewLabel_10.setBounds(683, 92, 107, 13);
	lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
	contentPane.add(lblNewLabel_10);

	JLabel lblNewLabel_11 = new JLabel("Deduction:");
	lblNewLabel_11.setBounds(701, 130, 80, 13);
	lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
	contentPane.add(lblNewLabel_11);

	JLabel lblNewLabel_12 = new JLabel("GROSS SALARY :");
	lblNewLabel_12.setBounds(32, 264, 137, 13);
	lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 15));
	contentPane.add(lblNewLabel_12);

	textFieldGrossSalary = new JTextField();
	textFieldGrossSalary.setBounds(178, 261, 137, 19);
	contentPane.add(textFieldGrossSalary);
	textFieldGrossSalary.setColumns(10);
	textFieldGrossSalary.setEditable(false);

	JLabel lblNewLabel_13 = new JLabel("TOTAL DEDUCTION :");
	lblNewLabel_13.setBounds(352, 267, 171, 13);
	lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 15));
	contentPane.add(lblNewLabel_13);

	textFieldTotalDeduction = new JTextField();
	textFieldTotalDeduction.setBounds(533, 264, 96, 19);
	contentPane.add(textFieldTotalDeduction);
	textFieldTotalDeduction.setColumns(10);
	textFieldTotalDeduction.setEditable(false);

	textField_9 = new JTextField();
	textField_9.setBounds(786, 92, 96, 19);
	contentPane.add(textField_9);
	textField_9.setColumns(10);

	textField_10 = new JTextField();
	textField_10.setBounds(786, 129, 96, 19);
	contentPane.add(textField_10);
	textField_10.setColumns(10);

	JLabel lblNewLabel_14 = new JLabel("NET SALARY :");
	lblNewLabel_14.setBounds(658, 270, 118, 13);
	lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 16));
	contentPane.add(lblNewLabel_14);

	textFieldNetSalary = new JTextField();
	textFieldNetSalary.setBounds(786, 269, 96, 19);
	contentPane.add(textFieldNetSalary);
	textFieldNetSalary.setColumns(10);
	textFieldNetSalary.setEditable(false);

	JButton btnNewButton = new JButton("Compute");
	btnNewButton.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		// GROSS SALARY
		int rate = Integer.parseInt(textRate.getText());
		int hours = Integer.parseInt(textHours.getText());
		int days = Integer.parseInt(textdays.getText());
		int grossSalary = rate * hours * days;
		textFieldGrossSalary.setText(String.valueOf(grossSalary));

		// DEDUCTIONS
		int tax = (int) (grossSalary * 0.15);
		textFieldTAX.setText(String.valueOf(tax));

		int philhealth = (int) (grossSalary * 0.05);
		textFieldPhilhealth.setText(String.valueOf(philhealth));

		int sss = (int) (grossSalary * 0.02);
		textFieldSSS.setText(String.valueOf(sss));

		int totaldeduction = tax + philhealth + sss;
		textFieldTotalDeduction.setText(String.valueOf(totaldeduction));
		// Net salary
		textField_9.setText(String.valueOf(grossSalary));
		textField_10.setText(String.valueOf(totaldeduction));
		int netsalary = grossSalary - totaldeduction;
		textFieldNetSalary.setText(String.valueOf(netsalary));

	    }
	});
	btnNewButton.setForeground(new Color(255, 255, 255));
	btnNewButton.setBackground(new Color(0, 64, 64));
	btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
	btnNewButton.setBounds(426, 319, 163, 44);
	contentPane.add(btnNewButton);
    }
}