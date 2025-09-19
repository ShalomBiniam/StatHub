import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class StartPage extends JFrame {

	private static final long serialVersionUID = 1L;//compatability checker of serialised and deserialsed class
	private JPanel contentPane;//private jpanel means that it is only accesible from wihtin this class
	static StartPage frame = new StartPage(); //frame only belonging to this class instead of all instances of startpage class

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
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
	public StartPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 574);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(183, 220, 155));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(62, 116, 75));
		panel.setBounds(6, 6, 758, 534);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("StatPad");
		lblNewLabel.setBounds(320, 19, 177, 57);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Khmer Sangam MN", Font.BOLD, 43));
		panel.add(lblNewLabel);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(49, 107, 339, 136);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage lp = new LoginPage();
				frame.setVisible(false);
				lp.run();
			}
		});
		btnLogin.setFont(new Font("Lucida Grande", Font.PLAIN, 27));
		panel.add(btnLogin);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(413, 327, 339, 136);
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrationPage rp = new RegistrationPage();
				frame.setVisible(false);
				rp.run();
			}
		});
		btnRegister.setFont(new Font("Lucida Grande", Font.PLAIN, 27));
		panel.add(btnRegister);
		
		LightUp lightUpbtnLogin = new LightUp(btnLogin);
	    LightUp lightUpRegister = new LightUp(btnRegister);
	    
	    JLabel lblNewLabel_1 = new JLabel("New label");
	    lblNewLabel_1.setIcon(new ImageIcon("/Users/shalombiniam/Downloads/garnett2.jpeg"));
	    lblNewLabel_1.setBounds(6, 6, 750, 518);
	    panel.add(lblNewLabel_1);
	}
	//Lightup Constructor	
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
