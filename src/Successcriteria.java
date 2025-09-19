import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class Successcriteria extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Successcriteria frame = new Successcriteria();
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
	public Successcriteria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 765, 434);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(6, 0, 760, 400);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Time Stamps");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 33));
		lblNewLabel.setBounds(271, 18, 219, 34);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("A.1 - 0:51");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(26, 104, 76, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("A.2 - 1:39");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setBounds(26, 143, 76, 16);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("A.3 - 1:05");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setBounds(26, 180, 76, 16);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("B.1 - 1:56");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setBounds(140, 104, 76, 16);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("C.1 - 4:53");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setBounds(254, 104, 76, 16);
		panel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("C.2 - 5:04");
		lblNewLabel_1_5.setForeground(Color.WHITE);
		lblNewLabel_1_5.setBounds(254, 143, 76, 16);
		panel.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("D.1 - 3:20");
		lblNewLabel_1_6.setForeground(Color.WHITE);
		lblNewLabel_1_6.setBounds(362, 104, 76, 16);
		panel.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("D.2 - 3:39");
		lblNewLabel_1_7.setForeground(Color.WHITE);
		lblNewLabel_1_7.setBounds(362, 143, 76, 16);
		panel.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("D.3 - 4:21");
		lblNewLabel_1_8.setForeground(Color.WHITE);
		lblNewLabel_1_8.setBounds(362, 180, 76, 16);
		panel.add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_9 = new JLabel("D.4 - 3:31");
		lblNewLabel_1_9.setForeground(Color.WHITE);
		lblNewLabel_1_9.setBounds(362, 220, 76, 16);
		panel.add(lblNewLabel_1_9);
		
		JLabel lblNewLabel_1_10 = new JLabel("E.1 - 2:13");
		lblNewLabel_1_10.setForeground(Color.WHITE);
		lblNewLabel_1_10.setBounds(460, 104, 78, 16);
		panel.add(lblNewLabel_1_10);
		
		JLabel lblNewLabel_1_11 = new JLabel("E.2 - 2:58");
		lblNewLabel_1_11.setForeground(Color.WHITE);
		lblNewLabel_1_11.setBounds(460, 143, 78, 16);
		panel.add(lblNewLabel_1_11);
		
		JLabel lblNewLabel_1_12 = new JLabel("Extensibility feature 1 - 5:23");
		lblNewLabel_1_12.setForeground(Color.WHITE);
		lblNewLabel_1_12.setBounds(550, 104, 192, 16);
		panel.add(lblNewLabel_1_12);
		
		JLabel lblNewLabel_1_13 = new JLabel("Extensibility feature 2 - 5:36");
		lblNewLabel_1_13.setForeground(Color.WHITE);
		lblNewLabel_1_13.setBounds(550, 143, 182, 16);
		panel.add(lblNewLabel_1_13);
		
		JLabel lblNewLabel_1_11_1 = new JLabel("E.2 - 2:28");
		lblNewLabel_1_11_1.setForeground(Color.WHITE);
		lblNewLabel_1_11_1.setBounds(460, 180, 78, 16);
		panel.add(lblNewLabel_1_11_1);
	}

}
