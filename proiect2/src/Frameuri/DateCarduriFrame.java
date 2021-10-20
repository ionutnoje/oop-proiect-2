package Frameuri;

import ArrayLists.ArrayListsForInfo;
import Carduri.Bcr;
import Carduri.Brd;
import Carduri.Raiffeisen;
import Carduri.Transilvania;
import Persoana.Persoana;
import Meniu.Meniu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DateCarduriFrame extends JFrame implements ActionListener {

    JLabel nume, prenume, sumabani, tipcard, labelgol;
    JTextField numet, prenumet, sumabanit;
    JPanel panel = new JPanel();
    JScrollPane pane = new JScrollPane(panel);

    JButton brd, bcr, transilvania, raiffeisen;

    public static int contorBcr = 0;
    public static int contorBrd = 0;
    public static int contorTransilvania = 0;
    public static int contorRaiffeisen = 0;




    public DateCarduriFrame() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new GridLayout(10, 2, 10, 10));
        this.setPreferredSize(new Dimension(400, 500));
        this.add(nume = new JLabel("nume: "));
        this.add(numet = new JTextField());
        this.add(prenume = new JLabel("prenume: "));
        this.add(prenumet = new JTextField());
        this.add(sumabani = new JLabel("sumabani: "));
        this.add(sumabanit = new JTextField("0"));
        this.add(tipcard = new JLabel("tip-card: "));
        this.add(labelgol = new JLabel(" "));
        this.add(pane);


        this.pack();
        this.setVisible(true);


        pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);


        panel.setLayout(new GridLayout(4, 1));
        panel.add(bcr = new JButton("Banca BCR"));
        panel.add(brd = new JButton("Banca BRD"));
        panel.add(raiffeisen = new JButton("Banca RAIFFEISEN"));
        panel.add(transilvania = new JButton("BANCA TRANSILVANIA"));


        brd.addActionListener(this);
        bcr.addActionListener(this);
        transilvania.addActionListener(this);
        raiffeisen.addActionListener(this);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bcr) {

            ArrayListsForInfo.date.add(new Persoana(numet.getText(), prenumet.getText()));
            ArrayListsForInfo.cardBcr.add(new Bcr(Double.parseDouble(sumabanit.getText())));
            contorBcr = contorBrd + 1;
            this.setVisible(false);
            new Meniu();
        } else if (e.getSource() == brd) {

            ArrayListsForInfo.date.add(new Persoana(numet.getText(), prenumet.getText()));
            ArrayListsForInfo.cardBrd.add(new Brd(Double.parseDouble(sumabanit.getText())));
            contorBrd = contorBrd + 1;
            this.setVisible(false);
            new Meniu();

        } else if (e.getSource() == transilvania) {

            ArrayListsForInfo.date.add(new Persoana(numet.getText(), prenumet.getText()));
            ArrayListsForInfo.cardTransilvania.add(new Transilvania(Double.parseDouble(sumabanit.getText())));
            contorTransilvania = contorTransilvania + 1;
            this.setVisible(false);
            new Meniu();

        } else if (e.getSource() == raiffeisen) {

            ArrayListsForInfo.date.add(new Persoana(numet.getText(),prenumet.getText()));
            ArrayListsForInfo.cardRaiffeisen.add(new Raiffeisen(Double.parseDouble(sumabanit.getText())));
            contorRaiffeisen = contorRaiffeisen + 1;
            this.setVisible(false);
            new Meniu();

        }
    }
}



