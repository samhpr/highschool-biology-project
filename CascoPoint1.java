import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CascoPoint1 implements ActionListener{
    Random r = new Random();
    int randomNum = r.nextInt(108);
    int rotateNum = r.nextInt(5) + 1;

    ImageIcon ima = new ImageIcon();
    JButton againButton = new JButton("To sample another sea urchin test, click here");
    JButton exitButton = new JButton("To leave, click here");
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Casco Point Urchin barren ecosystem");
    JLabel label2 = new JLabel("Test diameter: ");

    CascoPoint1(){

        if (randomNum >= 0 && randomNum <= 2){
            label2 = new JLabel("Test diameter: " + (r.nextInt((45 - 35) + 1) + 35));
        }else if (randomNum >= 3 && randomNum <= 8){
            label2 = new JLabel("Test diameter: " + (r.nextInt((50 - 46) + 1) + 46));
        }else if (randomNum >= 9 && randomNum <= 25){
            label2 = new JLabel("Test diameter: " + (r.nextInt((55 - 51) + 1) + 51));
        }else if (randomNum >= 26 && randomNum <= 56){
            label2 = new JLabel("Test diameter: " + (r.nextInt((62 - 56) + 1) + 56));
        }else if (randomNum >= 57 && randomNum <= 81){
            label2 = new JLabel("Test diameter: " + (r.nextInt((67 - 63) + 1) + 63));
        }else if (randomNum >= 82 && randomNum <= 97){
            label2 = new JLabel("Test diameter: " + (r.nextInt((72 - 68) + 1) + 68));
        }else if (randomNum >= 98 && randomNum <= 103){
            label2 = new JLabel("Test diameter: " + (r.nextInt((82 - 73) + 1) + 73));
        }else if (randomNum >= 104 && randomNum <= 107){
            label2 = new JLabel("Test diameter: " + (r.nextInt((87 - 83) + 1) + 83));
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
        exitButton.setBackground(new Color(177, 88, 247));
        exitButton.setOpaque(true);

        againButton.setBounds(800, 260, 450, 150);
        againButton.setFocusable(false);
        againButton.setFont(new Font(null, Font.PLAIN, 20));
        againButton.addActionListener(this);
        againButton.setBackground(new Color(177, 88, 247));
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
            CascoPoint1 kelpSlides = new CascoPoint1();
        }
        if (e.getSource() == exitButton)
        {
            frame.dispose();
            LaunchPage launchPage = new LaunchPage();
        }

    }
}
