import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class QuizPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static QuizPage frame = new QuizPage();

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
	public QuizPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(105, 164, 122));
		panel.setBounds(6, 6, 636, 385);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quiz Mode");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Helvetica", Font.BOLD, 43));
		lblNewLabel.setBounds(195, 6, 230, 52);
		panel.add(lblNewLabel);
		
		JButton rulesEasy = new JButton("Basketball rules EASY");
		rulesEasy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				qquestions qq = new qquestions();
				frame.setVisible(false);
				qq.run();
			}
		});
		rulesEasy.setBounds(20, 108, 178, 44);
		panel.add(rulesEasy);
		
		JButton rulesMedium = new JButton("Basketball rules MEDIUM");
		rulesMedium.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				qquestions1 qq = new qquestions1();
				frame.setVisible(false);
				qq.run();
			}
		});
		rulesMedium.setBounds(20, 176, 178, 44);
		panel.add(rulesMedium);
		
		JButton rulesHard = new JButton("Basketball rules HARD");
		rulesHard.setBounds(20, 252, 178, 44);
		panel.add(rulesHard);
		
		JButton mvpBtn2010 = new JButton("NBA MVPs 2010s");
		mvpBtn2010.setBounds(234, 108, 178, 44);
		panel.add(mvpBtn2010);
		
		JButton mvpBtn2000 = new JButton("NBA MVPs 2000s");
		mvpBtn2000.setBounds(234, 176, 178, 44);
		panel.add(mvpBtn2000);
		
		JButton mvpBtn1990 = new JButton("NBA MVPs 1990s");
		mvpBtn1990.setBounds(234, 252, 178, 44);
		panel.add(mvpBtn1990);
		
		JButton champs2010 = new JButton("NBA Championships 2010s");
		champs2010.setBounds(436, 108, 194, 44);
		panel.add(champs2010);
		
		JButton champs2000 = new JButton("NBA Champiopnships 2000s");
		champs2000.setBounds(436, 176, 194, 44);
		panel.add(champs2000);
		
		JButton champs1990 = new JButton("NBA Championships 1990");
		champs1990.setBounds(436, 252, 194, 44);
		panel.add(champs1990);
		
		JButton statHubExit = new JButton("StatHub");
		statHubExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StatHub sh = new StatHub();
				frame.setVisible(false);
				sh.run();
			}
		});
		statHubExit.setBackground(Color.RED);
		statHubExit.setBounds(6, 342, 153, 37);
		panel.add(statHubExit);
		
		JLabel LarryB = new JLabel("");
		LarryB.setIcon(new ImageIcon("/Users/shalombiniam/Downloads/larryB.jpeg"));
		LarryB.setBounds(6, 6, 624, 373);
		panel.add(LarryB);
		
		LightUp backhome = new LightUp(statHubExit);
		LightUp easy = new LightUp(rulesEasy);
		LightUp medium = new LightUp(rulesMedium);
		LightUp hard = new LightUp(rulesHard);
		LightUp mvp1 = new LightUp(mvpBtn2010);
		LightUp mvp2 = new LightUp(mvpBtn2000);
		LightUp mvp3 = new LightUp(mvpBtn1990);
		LightUp champ1 = new LightUp(champs2010);
		LightUp champ2 = new LightUp(champs2000);
		LightUp champ3 = new LightUp(champs1990);
		
	}
	public void showQuizPage() {
        setVisible(true);
    }
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
