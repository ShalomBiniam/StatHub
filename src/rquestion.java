import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class rquestion extends JFrame {//Creating revision questions class for easy rules

	private static final long serialVersionUID = 1L;//compatability checker of serialised and deserialsed class
	private JPanel contentPane;//J panel usage
	public LinkedList<String> qs=new LinkedList<String>();//LinkedList made to store questions as strings
	public LinkedList<String> ans=new LinkedList<String>();//LinkedList made to store answers as strings
	static rquestion frame = new rquestion();

	
	

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
	public rquestion() {
		setTitle("Revision Questions");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 663, 519);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(181, 217, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(62, 117, 76));
		panel.setBounds(6, 0, 651, 485);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel a1 = new JLabel("");
		a1.setForeground(Color.WHITE);
		a1.setBounds(180, 114, 465, 16);
		panel.add(a1);
		
		JLabel a2 = new JLabel("");
		a2.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		a2.setForeground(Color.WHITE);
		a2.setBounds(42, 176, 603, 16);
		panel.add(a2);
		
		JLabel q2 = new JLabel("");
		q2.setForeground(new Color(181, 217, 153));
		q2.setBounds(6, 146, 315, 16);
		panel.add(q2);
		
		JLabel q1 = new JLabel("");
		q1.setForeground(new Color(181, 217, 153));
		q1.setBounds(6, 86, 492, 16);
		panel.add(q1);
		
		JButton btnNewButton = new JButton("Load Questions");
		btnNewButton.setBounds(263, 450, 156, 29);
		panel.add(btnNewButton);
		
		JLabel q3 = new JLabel("");
		q3.setForeground(new Color(181, 217, 153));
		q3.setBounds(6, 204, 492, 16);
		panel.add(q3);
		
		JLabel a3 = new JLabel("");
		a3.setForeground(Color.WHITE);
		a3.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		a3.setBounds(303, 232, 342, 16);
		panel.add(a3);
		
		JLabel q4 = new JLabel("");
		q4.setForeground(new Color(181, 217, 153));
		q4.setBounds(6, 260, 492, 16);
		panel.add(q4);
		
		JLabel a4 = new JLabel("");
		a4.setForeground(Color.WHITE);
		a4.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		a4.setBounds(42, 298, 603, 16);
		panel.add(a4);
		
		JLabel q5 = new JLabel("");
		q5.setForeground(new Color(181, 217, 153));
		q5.setBounds(6, 334, 492, 16);
		panel.add(q5);
		
		JLabel a5 = new JLabel("");
		a5.setForeground(Color.WHITE);
		a5.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		a5.setBounds(153, 367, 492, 16);
		panel.add(a5);
		
		JLabel lblNewLabel = new JLabel("EASY NBA rules");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Helvetica", Font.BOLD, 39));
		lblNewLabel.setBounds(180, 6, 315, 52);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Revision Mode");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FlashcardPage fp = new FlashcardPage();
				fp.run();
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(6, 450, 117, 29);
		panel.add(btnNewButton_1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					FileReader fr=new FileReader("easyRules.txt");
					BufferedReader br=new BufferedReader(fr);
					String line=br.readLine();
					while(line!=null)
					{
						String[] data=line.split(",");//data array used to split line variable into different elements in array for later access
						qs.add(data[0]);//text file values being converted into strings allows for access
						ans.add(data[1]);
						line=br.readLine();
					}
					fr.close();
					q1.setText(qs.get(0));
					a1.setText(ans.get(0));
					
					q2.setText(qs.get(1));
					a2.setText(ans.get(1));
					
					q3.setText(qs.get(2));
					a3.setText(ans.get(2));
					
					q4.setText(qs.get(3));
					a4.setText(ans.get(3));
					
					q5.setText(qs.get(4));
					a5.setText(ans.get(4));
					
					
				}
				catch(IOException e1)
				{
					
				}
			}
		});
		
	}

}
