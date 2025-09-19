import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class RegistrationPage extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField un;
	private JPasswordField pw;
	static RegistrationPage frame = new RegistrationPage();

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
	public RegistrationPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 425);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(151, 181, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(62, 117, 76));
		panel.setBounds(6, 6, 603, 385);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("StatPad");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Helvetica", Font.ITALIC, 45));
		lblNewLabel.setBounds(33, 22, 218, 96);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Register\n");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Helvetica", Font.ITALIC, 20));
		lblNewLabel_1.setBounds(88, 118, 80, 21);
		panel.add(lblNewLabel_1);
		
		JLabel un1 = new JLabel("Username");
		un1.setFont(new Font("Malayalam MN", Font.PLAIN, 16));
		un1.setForeground(Color.WHITE);
		un1.setBounds(18, 182, 131, 16);
		panel.add(un1);
		
		JLabel pw1 = new JLabel("Password");
		pw1.setForeground(Color.WHITE);
		pw1.setFont(new Font("Malayalam MN", Font.PLAIN, 16));
		pw1.setBounds(18, 232, 131, 16);
		panel.add(pw1);
		
		un = new JTextField();
		un.setBounds(175, 177, 130, 26);
		panel.add(un);
		un.setColumns(10);
		
		
		JButton RegisterBtn = new JButton("Register");
		RegisterBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String un1=un.getText();
				String pw1=pw.getText();
				boolean flag=false;
				try
				{
					FileReader fr=new FileReader("Login.txt");
					BufferedReader br=new BufferedReader(fr);
					String line=br.readLine();
					while(line!=null)
					{
						String[] data=line.split(",");
						if(data[0].equals(un1)&&data[1].equals(pw1))
						{
							flag=true;
							LoginPage.finaluser=data[0];
							LoginPage.finalpwd=data[1];

						}
						line=br.readLine();
					}
					if(flag)
					{
						JOptionPane.showMessageDialog(null, "Duplicate login deatils!","ERROR", JOptionPane.ERROR_MESSAGE);
					}
					else {
						FileWriter fw=new FileWriter("Login.txt",true);
						fw.write("\n"+un1+","+pw1+"\n");
						fw.close();
						StatHub sh = new StatHub();
						frame.setVisible(false);
						sh.run();
					}
					fr.close();
					
				}
				catch(IOException e1)
				{
					
				}
				
			}
		});
		RegisterBtn.setBounds(54, 337, 117, 29);
		panel.add(RegisterBtn);
		
		pw = new JPasswordField();
		pw.setBounds(175, 232, 130, 26);
		panel.add(pw);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("/Users/shalombiniam/Downloads/billLogin.jpeg"));
		lblNewLabel_3.setBounds(197, 6, 503, 405);
		panel.add(lblNewLabel_3);
		
		 class LightUp extends MouseAdapter {
		        private JButton button;

		        public LightUp(JButton button) {
		            this.button = button;
		            button.addMouseListener(this);
		        }

		        //Mouse listener applied colour change
		        public void mouseEntered(MouseEvent e) {
		            // Animate the button when the mouse enters
		            Color customColor = new Color(183,220,185); 
		            button.setBackground(customColor);
		            Color customColor1 = new Color(183,220,185); 
		            button.setForeground(customColor);
		        }

		        //Mouse listener tracking mouse leave restricted area
		        public void mouseExited(MouseEvent e) {
		            // Reset the button when the mouse exits
		            button.setBackground(UIManager.getColor("Button.background"));
		            button.setForeground(UIManager.getColor("Button.foreground"));
		        }
		    }
	}

}
