import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class LoginPage extends JFrame {//Creation of Login page after inheriting characteristics from Jframe

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField un;
	private JPasswordField pw;
	static LoginPage frame = new LoginPage();
	public static String finaluser;
	public static String finalpwd;
	

	/**
	 * Launch the application.
	 */

			public void run() {
				try {
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

	/**
	 * Create the frame.
	 */
	public LoginPage() { //components of LoginPage
		setTitle("Login Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 428);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(151, 181, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(62, 117, 76));
		panel.setBounds(6, 6, 566, 388);
		contentPane.add(panel);
		panel.setLayout(null);
		
		un = new JTextField();
		un.setBounds(151, 196, 130, 31);
		panel.add(un);
		un.setColumns(10);
		
		JButton LoginBtn = new JButton("Login");//Creation of the Login button
		LoginBtn.addActionListener(new ActionListener() {//Action Listener for the button to run components
			public void actionPerformed(ActionEvent e) {//Action event method to call on following actions
				String un1=un.getText();//String for getting username from textfield
				String pw1=pw.getText();//String for getting password from textfield
				boolean flag=false; //flag to check if user input matches txt file
				try
				{
					FileReader fr=new FileReader("Login.txt"); //File reader
					BufferedReader br=new BufferedReader(fr);//Buffer reader to interpret each line from fr
					String line=br.readLine(); //line variable made
					while(line!=null)//while loop with condition making line holding a value compulsory
					{
						String[] data=line.split(",");//data array created to store 'line' variable
						if(data[0].equals(un1)&&data[1].equals(pw1))//if statement to check if array stores user inputs
						{
							flag=true;
							finaluser=data[0];
							finalpwd=data[1];
						}
						line=br.readLine();
					}
					if(flag)
					{
						StatHub sh = new StatHub();
						frame.setVisible(false);
						sh.run();
					}
					else {
						JOptionPane.showMessageDialog(null, "Invalid login deatils!","ERROR", JOptionPane.ERROR_MESSAGE);
					}
					fr.close();
				}
				catch(IOException e1)
				{
					
				}
				
			}
		});
		LoginBtn.setBounds(74, 353, 117, 29);
		panel.add(LoginBtn);
		
		JLabel lblNewLabel_1 = new JLabel("StatPad");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Helvetica", Font.ITALIC, 40));
		lblNewLabel_1.setBounds(30, 81, 154, 41);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Username\n");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Malayalam MN", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(16, 196, 123, 26);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Password");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Malayalam MN", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(16, 256, 123, 26);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Helvetica", Font.ITALIC, 20));
		lblNewLabel.setBounds(74, 134, 77, 29);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("/Users/shalombiniam/Downloads/BillRussellLogin.jpeg"));
		lblNewLabel_2.setBounds(293, 52, 262, 261);
		panel.add(lblNewLabel_2);
		
		pw = new JPasswordField();
		pw.setBounds(151, 253, 130, 29);
		panel.add(pw);
	}
}
