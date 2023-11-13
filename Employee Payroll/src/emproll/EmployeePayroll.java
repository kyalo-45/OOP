package emproll;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EmployeePayroll extends JFrame {

    private JLabel employeeNameLabel;
    private JTextField employeeNameTextField;
    private JLabel ratePerHourLabel;
    private JTextField ratePerHourTextField;
    private JLabel hourPerDayLabel;
    private JTextField hourPerDayTextField;
    private JLabel numberOfDaysWorkedLabel;
    private JTextField numberOfDaysWorkedTextField;
    private JButton computeButton;
    private JLabel regularHoursLabel;
    private JTextField regularHoursTextField;
    private JLabel overtimeHoursLabel;
    private JTextField overtimeHoursTextField;
    private JLabel regularPayLabel;
    private JTextField regularPayTextField;
    private JLabel overtimePayLabel;
    private JTextField overtimePayTextField;
    private JLabel netPayLabel;
    private JTextField netPayTextField;

    public EmployeePayroll() {
	super("Payroll System");

	employeeNameLabel = new JLabel("Employee Name:");
	employeeNameTextField = new JTextField(20);

	ratePerHourLabel = new JLabel("Rate Per Hour:");
	ratePerHourTextField = new JTextField(10);

	hourPerDayLabel = new JLabel("Hour Per Day:");
	hourPerDayTextField = new JTextField(10);

	numberOfDaysWorkedLabel = new JLabel("Number Of Days Worked:");
	numberOfDaysWorkedTextField = new JTextField(10);

	computeButton = new JButton("Compute");
	computeButton.addActionListener(e -> computeSalary());

	regularHoursLabel = new JLabel("Regular Hours:");
	regularHoursTextField = new JTextField(10);
	regularHoursTextField.setEditable(false);

	overtimeHoursLabel = new JLabel("Overtime Hours:");
	overtimeHoursTextField = new JTextField(10);
	overtimeHoursTextField.setEditable(false);

	regularPayLabel = new JLabel("Regular Pay:");
	regularPayTextField = new JTextField(10);
	regularPayTextField.setEditable(false);

	overtimePayLabel = new JLabel("Overtime Pay:");
	overtimePayTextField = new JTextField(10);
	overtimePayTextField.setEditable(false);

	netPayLabel = new JLabel("Net Pay:");
	netPayTextField = new JTextField(10);
	netPayTextField.setEditable(false);

	// Add the GUI components to the frame.
	setLayout(new GridBagLayout());

	GridBagConstraints constraints = new GridBagConstraints();
	constraints.fill = GridBagConstraints.HORIZONTAL;

	// Row 1
	constraints.gridx = 0;
	constraints.gridy = 0;
	add(employeeNameLabel, constraints);

	constraints.gridx = 1;
	constraints.gridy = 0;
	add(employeeNameTextField, constraints);

	// Row 2
	constraints.gridx = 0;
	constraints.gridy = 1;
	add(ratePerHourLabel, constraints);

	constraints.gridx = 1;
	constraints.gridy = 1;
	add(ratePerHourTextField, constraints);

	// Row 3
	constraints.gridx = 0;
	constraints.gridy = 2;
	add(hourPerDayLabel, constraints);

	constraints.gridx = 1;
	constraints.gridy = 2;
	add(hourPerDayTextField, constraints);

    }

}
