import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CascoPoint0 implements ActionListener{
    ImageIcon firstImage = new ImageIcon("CascoPoint.PNG");
    JButton purpleButton = new JButton("To sample a sea urchin test, click here");
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Casco Point Urchin barren ecosystem");

    CascoPoint0(){
        label.setBounds(20, 20, 1000, 600);
        label.setIcon(firstImage);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(000000));
        label.setFont(new Font("Verdana", Font.PLAIN, 50));
        label.setIconTextGap(20);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.LEFT);

        // button constructor
        purpleButton.setBounds(850, 260, 400, 150);
        purpleButton.setFocusable(false);
        purpleButton.setFont(new Font(null, Font.PLAIN, 20));
        purpleButton.addActionListener(this);
        purpleButton.setBackground(new Color(177, 88, 247));
        purpleButton.setOpaque(true);

        //adding button and label
        frame.add(purpleButton);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 720);
        frame.getContentPane().setBackground(new Color(127, 154, 255));
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == purpleButton){
            frame.dispose();
            //NewWindow myWindow = new NewWindow();
            CascoPoint1 kelpSlides = new CascoPoint1();
        }
    }
}
