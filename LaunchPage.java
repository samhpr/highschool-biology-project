import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LaunchPage implements ActionListener{
	JFrame frame = new JFrame();
	JButton pisaButton = new JButton("Pisa Point kelp forest");
	JButton cascoButton = new JButton("Casco Point urchin barren");
	JLabel label = new JLabel();
	JLabel subtext = new JLabel();
	ImageIcon firstImage = new ImageIcon("FirstImage.PNG");
			
	LaunchPage()
	{
		// label constructor (image + text) HEADER 
		label.setText("Welcome to Attu Island");
		label.setIcon(firstImage);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(000000));
        label.setFont(new Font("Verdana", Font.PLAIN, 50));
        label.setIconTextGap(75);
        
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.LEFT);
        label.setBounds(25,10,1500,1000);
        
		// subtext above buttons
        subtext.setText("Select sampling location: ");
        subtext.setForeground(new Color(000000));
        subtext.setBounds(800, 125, 350, 80);
        subtext.setFont(new Font("Verdana", Font.PLAIN, 25));
        
		// button constructor
        pisaButton.setBounds(800, 210, 350, 80);
		pisaButton.setBackground(new Color(211, 107, 34));
		pisaButton.setFont(new Font(null, Font.PLAIN, 20));
		pisaButton.setFocusable(false);
		pisaButton.addActionListener(this);
		
		// button constructor
        cascoButton.setBounds(800, 350, 350, 80);
		cascoButton.setBackground(new Color(177, 88, 247));
		cascoButton.setFont(new Font(null, Font.PLAIN, 20));
		cascoButton.setFocusable(false);
		cascoButton.addActionListener(this);
		
		
		//adds button and label
		frame.add(pisaButton);
		frame.add(cascoButton);
		frame.add(label);
		frame.add(subtext);
		
		//frame configs
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1280, 720);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(true);
		frame.getContentPane().setBackground(new Color(127, 154, 255));
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == pisaButton)
		{
			frame.dispose();
			KelpForest0 myWindow = new KelpForest0();
		}
		
		if (e.getSource() == cascoButton)
		{
			frame.dispose();
			CascoPoint0 myWindow1 = new CascoPoint0();
		}
	}
}
