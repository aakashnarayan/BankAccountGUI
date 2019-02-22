import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BankAccountGUI extends JFrame
{
	
	public BankAccountGUI()
	{
		ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>();
		
		setTitle("Bank Account");
		setBounds(525,250,425,225);
		setLayout(null);
		
		//nameLabel
		JLabel nameLabel = new JLabel("Name: ");
		nameLabel.setBounds(50,25,40,20);
		add(nameLabel);
		
		//nameTextField
		JTextField nameTextField = new JTextField();
		nameTextField.setBounds(105,25,250,20);
		add(nameTextField);
		
		//AccountLabel
		JLabel accountLabel = new JLabel("Account Type: ");
		accountLabel.setBounds(50,60,90,20);
		add(accountLabel);
		
		//AccountTypeComboBox
		JComboBox comboBox = new JComboBox(new String[]{"","Checking", "Savings"});
		comboBox.setBounds(155,60,200,20);
		add(comboBox);
		setVisible(true);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	
		//balanceLabel
		JLabel balanceLabel = new JLabel("Initial Balance: ");
		balanceLabel.setBounds(50,95,90,20);
		add(balanceLabel);
				
		//balanceTextField
		JTextField balanceTextField = new JTextField();
		balanceTextField.setBounds(155,95,200,20);
		add(balanceTextField);
		
		//CreateButton
		JButton createButton = new JButton("Create Account");
		createButton.setBounds(50,130,150,20);
		add(createButton);

		createButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{	
				if (comboBox.getSelectedItem().equals("Checking"))
				{
				//	bankAccounts.add(new CheckingAccount(name, OVER_DRAFT_FEE, TRANSACTION_FEE, FREE_TRANSACTIONS)
				}
			}
		});
		
		
		//DisplayButton
		JButton displayButton = new JButton("Display All Accounts");
		displayButton.setBounds(205,130,150,20);
		add(displayButton);
				
	}
	
	public static void main(String[] args)
	{
		BankAccountGUI frame = new BankAccountGUI();
	}
}
