import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class qquestions1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField a1;
	private JTextField a2;
	public LinkedList<String> qs=new LinkedList<String>(); //LinkedList created for the questions that come from the data array
	public LinkedList<String> ans=new LinkedList<String>(); //LinkedList created for the questions that come from the data array
	private JTextField a3;
	private JTextField a4;
	private JTextField a5;
	static qquestions1 frame = new qquestions1();
	public static int total=0;
	

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
	public qquestions1() {
		setTitle("Quiz Mode\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 571);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(183, 220, 155));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(62, 117, 76));
		panel.setBounds(6, 6, 576, 531);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel q1 = new JLabel("");
		q1.setBounds(6, 80, 190, 38);
		panel.add(q1);
		
		JLabel q2 = new JLabel("");
		q2.setBounds(6, 147, 190, 38);
		panel.add(q2);
		JLabel c1 = new JLabel("");
		c1.setBounds(497, 91, 61, 16);
		panel.add(c1);
		
		JLabel c2 = new JLabel("");
		c2.setBounds(497, 157, 61, 16);
		panel.add(c2);
		
		JButton checkQs = new JButton("Check answers");
		checkQs.setBounds(199, 459, 166, 38);
		panel.add(checkQs);
		
		a2 = new JTextField();
		a2.setBounds(208, 147, 265, 38);
		panel.add(a2);
		a2.setColumns(10);
		
		a1 = new JTextField();
		a1.setBounds(208, 80, 265, 38);
		panel.add(a1);
		a1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("EASY NBA rules");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Helvetica", Font.BOLD, 39));
		lblNewLabel.setBounds(125, 17, 322, 51);
		panel.add(lblNewLabel);
		
		JLabel q4 = new JLabel("");
		q4.setBounds(6, 301, 190, 38);
		panel.add(q4);
		
		JLabel q3 = new JLabel("");
		q3.setBounds(6, 225, 190, 38);
		panel.add(q3);
		
		JLabel q5 = new JLabel("");
		q5.setBounds(6, 368, 190, 38);
		panel.add(q5);
		
		a3 = new JTextField();
		a3.setColumns(10);
		a3.setBounds(208, 225, 265, 38);
		panel.add(a3);
		
		a4 = new JTextField();
		a4.setColumns(10);
		a4.setBounds(208, 301, 265, 38);
		panel.add(a4);
		
		a5 = new JTextField();
		a5.setColumns(10);
		a5.setBounds(208, 368, 265, 38);
		panel.add(a5);
		
		JLabel c3 = new JLabel("");
		c3.setBounds(497, 236, 61, 16);
		panel.add(c3);
		
		JLabel c4 = new JLabel("");
		c4.setBounds(497, 312, 61, 16);
		panel.add(c4);
		
		JLabel c5 = new JLabel("");
		c5.setBounds(497, 379, 61, 16);
		panel.add(c5);
		
		JButton btnRecordScores = new JButton("Record Scores");
		btnRecordScores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileWriter fw=new FileWriter("scores.txt",true);
					fw.write(LoginPage.finaluser+","+LoginPage.finalpwd+","+total+"\n");
					fw.close();
					QuizPage qp = new QuizPage();
					frame.setVisible(false);
					qp.run();
				}
				catch(IOException e1)
				{
					
				}
			}
		});
		btnRecordScores.setBounds(376, 459, 166, 38);
		panel.add(btnRecordScores);
		
		JButton btnNewButton_1 = new JButton("Load Questions");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					FileReader fr=new FileReader("mediumRules.txt");
					BufferedReader br=new BufferedReader(fr);
					String line=br.readLine();
					while(line!=null)
					{
						String[] data=line.split(",");
						qs.add(data[0]);
						ans.add(data[1]);
						line=br.readLine();
					}
					fr.close();
				}
				catch(IOException e1)
				{
					
				}
				q1.setText(qs.get(0));
				q2.setText(qs.get(1));
				q3.setText(qs.get(2));
				q4.setText(qs.get(3));
				q5.setText(qs.get(4));
			}
		});
		btnNewButton_1.setBounds(6, 459, 166, 38);
		panel.add(btnNewButton_1);
		checkQs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					
					String a11=a1.getText();
					
					String a21=a2.getText();
					
					String a31=a3.getText();	
				
					String a41=a2.getText();
				
					String a51=a2.getText();
				
					if(ans.get(0).equals(a11)) {c1.setText("Correct!");total++;}
					else {c1.setText("Incorrect!");}
					
					if(ans.get(1).equals(a21)) {c2.setText("Correct!");total++;}
					else {c2.setText("Incorrect!");}
					
					if(ans.get(2).equals(a31)) {c3.setText("Correct!");total++;}
					else {c3.setText("Incorrect!");}
					
					if(ans.get(3).equals(a41)) {c4.setText("Correct!");total++;}
					else {c4.setText("Incorrect!");}
					
					if(ans.get(4).equals(a51)) {c5.setText("Correct!");total++;}
					else {c5.setText("Incorrect!");}
					
				
			}
		});
		
		
	}

}
