import javax.swing.JFrame;//Importing J frames
import javax.swing.JPanel;//Importing panels
import javax.swing.UIManager;//Importing java management over user interface
import javax.swing.border.EmptyBorder;//importing border controls
import java.awt.Color;//importing colour palletes
import javax.swing.JLabel;//importing J labels
import java.awt.Font;//Importing font options
import javax.swing.JButton;//Importing buttons
import javax.swing.ImageIcon;//Importing image icons
import java.awt.event.ActionListener;//Importing action listeners for mouse interactions
import java.awt.event.MouseAdapter;//Mouse adapters being imported 
import java.awt.event.MouseEvent;//Importing so I can track when mouse performs
import java.awt.event.ActionEvent;//When components perform

public class FlashcardPage extends JFrame {//Flashcardpage inheriting from jframe

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static FlashcardPage frame = new FlashcardPage();
	

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
	public FlashcardPage() {//components of flashcard page
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 460);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(183, 220, 155));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(105, 164, 122));
		panel.setBounds(6, 6, 616, 420);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Revision Mode");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Helvetica", Font.BOLD, 40));
		lblNewLabel.setBounds(183, 25, 300, 46);
		panel.add(lblNewLabel);
		
		JButton rulesEasy = new JButton("basketball Rules EASY");
		rulesEasy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rquestion r1=new rquestion();
				r1.run();
	
				
			}
		});
		rulesEasy.setBounds(6, 107, 172, 37);
		panel.add(rulesEasy);
		
		JButton rulesMedium = new JButton("basketball Rules MEDIUM");
		rulesMedium.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FlashcardPage fp = new FlashcardPage();
				frame.setVisible(false);
				fp.run();
				
			}
		});
		rulesMedium.setBounds(6, 196, 172, 37);
		panel.add(rulesMedium);
		
		JButton rulesHard = new JButton("basketball Rules HARD");
		rulesHard.setBounds(6, 283, 172, 37);
		panel.add(rulesHard);
		
		JButton nbaMvps2010 = new JButton("NBA MVPs 2010");
		nbaMvps2010.setBounds(221, 107, 172, 37);
		panel.add(nbaMvps2010);
		
		JButton nbaMvps2000 = new JButton("NBA MVPs 2000s");
		nbaMvps2000.setBounds(221, 196, 172, 37);
		panel.add(nbaMvps2000);
		
		JButton nbaMvps1990 = new JButton("NBA MVPs 1990s");
		nbaMvps1990.setBounds(221, 283, 172, 37);
		panel.add(nbaMvps1990);
		
		JButton champs2010 = new JButton("NBA Championships 2010s");
		champs2010.setBounds(421, 107, 189, 37);
		panel.add(champs2010);
		
		JButton champs2000 = new JButton("NBA Championships 2000s");
		champs2000.setBounds(421, 196, 189, 37);
		panel.add(champs2000);
		
		JButton champs1990 = new JButton("NBA Championships 1990s");
		champs1990.setBounds(421, 283, 189, 37);
		panel.add(champs1990);
		
		JButton statHubExit = new JButton("StatHub");
		statHubExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StatHub sh = new StatHub();
				frame.setVisible(false);
				sh.run();
			}
		});
		statHubExit.setBounds(0, 374, 155, 46);
		panel.add(statHubExit);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("/Users/shalombiniam/Downloads/larryB.jpeg"));
		lblNewLabel_1.setBounds(6, 6, 604, 414);
		panel.add(lblNewLabel_1);
		LightUp backhome = new LightUp(statHubExit);
		LightUp easy = new LightUp(rulesEasy);
		LightUp medium = new LightUp(rulesMedium);
		LightUp hard = new LightUp(rulesHard);
		LightUp mvp1 = new LightUp(nbaMvps2010);
		LightUp mvp2 = new LightUp(nbaMvps2000);
		LightUp mvp3 = new LightUp(nbaMvps1990);
		LightUp champ1 = new LightUp(champs2010);
		LightUp champ2 = new LightUp(champs2000);
		LightUp champ3 = new LightUp(champs1990);
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
