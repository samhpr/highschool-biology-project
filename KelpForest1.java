import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// range = 4 
public class KelpForest1 implements ActionListener {
    Random r = new Random();
    int randomNum = r.nextInt(111);
    int rotateNum = r.nextInt(5) + 1;

    ImageIcon ima = new ImageIcon();
    JButton againButton = new JButton("To sample another sea urchin test, click here");
    JButton exitButton = new JButton("To leave, click here");
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Pisa Point Kelp forest ecosystem");
    JLabel label2 = new JLabel("Test diameter: ");


    KelpForest1(){
        if (randomNum >= 0 && randomNum <= 4){
            label2 = new JLabel("Test diameter: " + (r.nextInt((10 - 5) + 1) + 5));
        }else if (randomNum >= 5 && randomNum <= 20){
            label2 = new JLabel("Test diameter: " + (r.nextInt((15 - 10) + 1) + 10));
        }else if (randomNum >= 21 && randomNum <= 43){
            label2 = new JLabel("Test diameter: " + (r.nextInt((20 - 16) + 1) + 16));
        }else if (randomNum >= 44 && randomNum <= 74){
            label2 = new JLabel("Test diameter: " + (r.nextInt((25 - 21) + 1) + 21));
        }else if (randomNum >= 75 && randomNum <= 95){
            label2 = new JLabel("Test diameter: " + (r.nextInt((30 - 26) + 1) + 26));
        }else if (randomNum >= 96 && randomNum <= 106){
            label2 = new JLabel("Test diameter: " + (r.nextInt((35 - 31) + 1) + 31));
        }else if (randomNum >= 107 && randomNum <= 110){
            label2 = new JLabel("Test diameter: " + (r.nextInt((40 - 36) + 1) + 36));
        }else{
            label2 = new JLabel("Test diameter: undefinable ");
        }

        for (int i = 1; i <= 5; i++){
            if (rotateNum == i){
                ima = new ImageIcon("SeaUrchin1" + i + ".PNG");
            }
        }



        exitButton.setBounds(20, 20, 400, 70);
        exitButton.setFocusable(false);
        exitButton.setFont(new Font(null, Font.PLAIN, 20));
        exitButton.addActionListener(this);
        exitButton.setBackground(new Color(211, 107, 34));
        exitButton.setOpaque(true);

        againButton.setBounds(800, 260, 450, 150);
        againButton.setFocusable(false);
        againButton.setFont(new Font(null, Font.PLAIN, 20));
        againButton.addActionListener(this);
        againButton.setBackground(new Color(211, 107, 34));
        againButton.setOpaque(true);

        label2.setBounds(300, 300, 1000, 600);
        label2.setFont(new Font("Verdana", Font.PLAIN, 50));

        label.setBounds(20, 5, 1000, 600);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(000000));
        label.setFont(new Font("Verdana", Font.PLAIN, 50));
        label.setIconTextGap(20);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.LEFT);
        label.setIcon(ima);

        frame.add(label);
        frame.add(label2);
        frame.add(againButton);
        frame.add(exitButton);
    
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 720);
        frame.getContentPane().setBackground(new Color(127, 154, 255));
        frame.setLayout(null);
        frame.setVisible(true);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == againButton)
        {
            frame.dispose();
            KelpForest1 kelpSlides = new KelpForest1();
        }
        if (e.getSource() == exitButton)
        {
            frame.dispose();
            LaunchPage launchPage = new LaunchPage();
        }

    }
}
