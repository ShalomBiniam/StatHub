import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.Border;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class StatHub extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    static StatHub frame = new StatHub();

 
            public void run() {
                try {
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

    public StatHub() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 614, 412);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("StatPad");
        lblNewLabel_1.setBounds(19, 66, 150, 61);
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 39));
        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel = new JLabel("Welcome to the StatHub");
        lblNewLabel.setBounds(6, 333, 271, 45);
        Color borderColor = Color.decode("#FF5733"); 
        Border border = BorderFactory.createLineBorder(borderColor, 1);
        lblNewLabel.setBorder(new LineBorder(new Color(255, 87, 51), 2, true)); 
        lblNewLabel.setBackground(new Color(231, 54, 54));
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("Helvetica", Font.PLAIN, 24));
        contentPane.add(lblNewLabel);

        JButton btnNewButton1 = new JButton("Quiz Mode");
        btnNewButton1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		QuizPage qp = new QuizPage();
        		frame.setVisible(false);
        		qp.run();
        	}
        });
        btnNewButton1.setFont(new Font("Helvetica", Font.ITALIC, 22));
        btnNewButton1.setBounds(404, 6, 130, 36);
        contentPane.add(btnNewButton1);

        JButton btnNewButton2 = new JButton("Analytics");
        btnNewButton2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		AnalyticsPage ap = new AnalyticsPage();
        		frame.setVisible(false);
        		ap.run();
        	}
        });
        btnNewButton2.setFont(new Font("Helvetica", Font.ITALIC, 22));
        btnNewButton2.setBounds(86, 6, 130, 36);
        contentPane.add(btnNewButton2);
        
        JButton btnNewButton3 = new JButton("Revision Mode");
        btnNewButton3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		FlashcardPage fp = new FlashcardPage();
        		frame.setVisible(false);
        		fp.run();
        	}
        });
        btnNewButton3.setFont(new Font("Helvetica", Font.ITALIC, 22));
        btnNewButton3.setBounds(228, 6, 159, 36);
        contentPane.add(btnNewButton3);

        // Create instances of LightUp for each button
        LightUp lightUp1 = new LightUp(btnNewButton1);
        LightUp lightUp2 = new LightUp(btnNewButton2);
        LightUp lightUp3 = new LightUp(btnNewButton3);
        
        JLabel lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setIcon(new ImageIcon("/Users/shalombiniam/Downloads/Isaiah Thomas StatHub.jpeg"));
        lblNewLabel_3.setBounds(0, 6, 608, 372);
        contentPane.add(lblNewLabel_3);
        
        
    }
	//LightUp Constructor	
    class LightUp extends MouseAdapter {//LightUp method inheriting characteristics off MouseAdapter
        private JButton button; //creation of button within StatHub class

        public LightUp(JButton button) { //defining constructor method
            this.button = button;//assigning button to instance variable button in that class
            button.addMouseListener(this);//adding mouse listener to the button passed through constructor
        }

        //Mouse listener applied colour change
        public void mouseEntered(MouseEvent e) {
            // Animate the button when the mouse enters
            Color customColor = new Color(183,220,185); 
            button.setBackground(customColor);
            Color customColor1 = new Color(183,220,185); 
            button.setForeground(customColor1);
        }

        //Mouse listener tracking mouse leave restricted area
        public void mouseExited(MouseEvent e) {
            // Reset the button when the mouse exits
            button.setBackground(UIManager.getColor("Button.background"));
            button.setForeground(UIManager.getColor("Button.foreground"));
        }
    }
}