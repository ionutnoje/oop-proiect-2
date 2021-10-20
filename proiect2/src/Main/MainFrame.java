package Main;

import Frameuri.DateCarduriFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener
{
    JLabel label = new JLabel("Aplicatie cu carduri!");
    JButton button = new JButton("LAUNCH");

    public MainFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(2,1,10,10));
        this.add(label);
        this.add(button);
        this.pack();
        this.setVisible(true);


        button.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button)
        {
            this.setVisible(false);
            new DateCarduriFrame();

        }
    }
}

