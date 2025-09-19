import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class AnalyticsPage extends JFrame {//Creating revision questions class for easy rules

	private static final long serialVersionUID = 1L;//compatability checker of serialised and deserialsed class
	private JPanel contentPane;//J panel usage
	static AnalyticsPage frame = new AnalyticsPage();//frame variable to represent AnalyticsPage class
	public LinkedList<Integer> scores=new LinkedList<>(); //LinkedList made to store scores as integers
	public LinkedList<String> UserName = new LinkedList<String>();//LinkedList made to store Usernames as strings

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
	public AnalyticsPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 497);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(183, 220, 155));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(62, 116, 75));
		panel.setBounds(6, 6, 634, 457);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel AnalyticsPageTitle = new JLabel("Analytics\n");
		AnalyticsPageTitle.setForeground(Color.WHITE);
		AnalyticsPageTitle.setFont(new Font("Helvetica", Font.BOLD, 45));
		AnalyticsPageTitle.setBounds(210, 6, 213, 53);
		panel.add(AnalyticsPageTitle);
		
		JButton StatHubExit = new JButton("StatHub");
		StatHubExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StatHub sh = new StatHub();
				frame.setVisible(false);
				sh.run();
			}
		});
		StatHubExit.setBounds(6, 422, 129, 35);
		panel.add(StatHubExit);
		LightUp LightUp1 = new LightUp(StatHubExit);
		
		JLabel easyRulesScore = new JLabel("");
		easyRulesScore.setForeground(Color.WHITE);
		easyRulesScore.setBounds(41, 143, 75, 34);
		panel.add(easyRulesScore);
		
		JLabel UserNamePresent = new JLabel("");
		UserNamePresent.setForeground(Color.WHITE);
		UserNamePresent.setBounds(102, 61, 114, 16);
		panel.add(UserNamePresent);
		
		JButton LoadStatsBtn = new JButton("Load User Statistics");//creating button for user to load statistics for that account
		LoadStatsBtn.addActionListener(new ActionListener() {//Action Listener
			public void actionPerformed(ActionEvent e) {
				try
				{
					FileReader fr=new FileReader("scores.txt"); //File Reader fr to read the scores textfile
					BufferedReader br=new BufferedReader(fr); //Buffered Reader br to read each individual line
					String line=br.readLine(); //Line variable created for br
					while(line!=null)//beginning of while loop where loop begins when the line variable has a value i.e isn't empty
					{
						String[] data=line.split(",");
						int intValue = Integer.parseInt(data[2]);
						scores.add(intValue);
						UserName.add(data[0]);
						line=br.readLine();
						
					}
					
					fr.close();
				}
				catch(IOException e1)
				{
					
				}
				easyRulesScore.setText(String.valueOf(scores.get(0)));
				UserNamePresent.setText(UserName.get(0));
				
			}
		});
		
		LoadStatsBtn.setBounds(229, 388, 171, 41);
		panel.add(LoadStatsBtn);
		
		JLabel nbarules = new JLabel("EASY NBA rules:");
		nbarules.setFont(new Font("Helvetica", Font.PLAIN, 19));
		nbarules.setForeground(Color.WHITE);
		nbarules.setBounds(6, 107, 163, 20);
		panel.add(nbarules);
		
		JLabel nbarules1 = new JLabel("MEDIUM NBA rules:");
		nbarules1.setForeground(Color.WHITE);
		nbarules1.setFont(new Font("Helvetica", Font.PLAIN, 19));
		nbarules1.setBounds(6, 189, 180, 20);
		panel.add(nbarules1);
		
		JLabel nbarules2 = new JLabel("HARD NBA rules:");
		nbarules2.setForeground(Color.WHITE);
		nbarules2.setFont(new Font("Helvetica", Font.PLAIN, 19));
		nbarules2.setBounds(6, 283, 163, 20);
		panel.add(nbarules2);
		
		JLabel nbamvp = new JLabel("NBA MVPs 2010s:");
		nbamvp.setForeground(Color.WHITE);
		nbamvp.setFont(new Font("Helvetica", Font.PLAIN, 19));
		nbamvp.setBounds(210, 107, 163, 20);
		panel.add(nbamvp);
		
		JLabel nbachamps = new JLabel("NBA Championships 2010s:");
		nbachamps.setForeground(Color.WHITE);
		nbachamps.setFont(new Font("Helvetica", Font.PLAIN, 16));
		nbachamps.setBounds(414, 107, 214, 20);
		panel.add(nbachamps);
		
		JLabel nbamvp1 = new JLabel("NBA MVPs 2000s:");
		nbamvp1.setForeground(Color.WHITE);
		nbamvp1.setFont(new Font("Helvetica", Font.PLAIN, 19));
		nbamvp1.setBounds(210, 189, 163, 20);
		panel.add(nbamvp1);
		
		JLabel nbamvp2 = new JLabel("NBA MVPs 1990s:");
		nbamvp2.setForeground(Color.WHITE);
		nbamvp2.setFont(new Font("Helvetica", Font.PLAIN, 19));
		nbamvp2.setBounds(210, 283, 163, 20);
		panel.add(nbamvp2);
		
		JLabel nbachamps1 = new JLabel("NBA Championships 2000s:");
		nbachamps1.setForeground(Color.WHITE);
		nbachamps1.setFont(new Font("Helvetica", Font.PLAIN, 16));
		nbachamps1.setBounds(414, 189, 214, 20);
		panel.add(nbachamps1);
		
		JLabel nbachamps2 = new JLabel("NBA Championships 1990s:");
		nbachamps2.setForeground(Color.WHITE);
		nbachamps2.setFont(new Font("Helvetica", Font.PLAIN, 16));
		nbachamps2.setBounds(414, 285, 214, 20);
		panel.add(nbachamps2);
		
		JLabel UserNameOp = new JLabel("UserName:");
		UserNameOp.setForeground(Color.WHITE);
		UserNameOp.setBounds(26, 61, 75, 16);
		panel.add(UserNameOp);
		
		
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
