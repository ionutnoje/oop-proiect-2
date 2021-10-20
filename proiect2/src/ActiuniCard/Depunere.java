package ActiuniCard;

import ArrayLists.ArrayListsForInfo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Depunere extends JFrame implements ActionListener
{

    JPanel panelsuma = new JPanel();
    JPanel panelcarduri = new JPanel();

    JLabel labelsuma = new JLabel("suma de bani pe care vreti sa o introduceti: ");
    JTextField textFieldSuma = new JTextField();
    JLabel labelcarduri = new JLabel("alegeti cardul pe care depozitati: ");

    JPanel panelgridcarduri = new JPanel();
    JScrollPane scrollPane = new JScrollPane(panelgridcarduri);


    JButton bancaBcr;
    JButton bancaBrd;
    JButton bancaTransilvania;
    JButton bancaRaiffeisen;



    public Depunere()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(500,300));
        this.add(panelsuma,BorderLayout.NORTH);
        this.add(panelcarduri,BorderLayout.CENTER);
        this.pack();
        this.setVisible(true);


        //PANELS
        panelsuma.setLayout(new GridLayout(1,2,10,10));
        panelsuma.add(labelsuma);
        panelsuma.add(textFieldSuma);


        panelcarduri.setLayout(new GridLayout(1,2,10,10));
        panelcarduri.add(labelcarduri);
        panelcarduri.add(scrollPane);
        panelgridcarduri.setLayout(new GridLayout(4,1,10,10));
        panelgridcarduri.add(bancaBcr = new JButton("Card Bcr"));
        panelgridcarduri.add(bancaBrd = new JButton("Card Brd"));
        panelgridcarduri.add(bancaRaiffeisen = new JButton("Card Raiffeisen"));
        panelgridcarduri.add(bancaTransilvania = new JButton("Card Transilvania"));




        //BUTTONS
        bancaBcr.addActionListener(this);
        bancaBrd.addActionListener(this);
        bancaTransilvania.addActionListener(this);
        bancaRaiffeisen.addActionListener(this);


        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    }





    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bancaBcr)
        {
            //ArrayListsForInfo.cardBcr.add(new Bcr(Double.parseDouble(textFieldSuma.getText())));
            ArrayListsForInfo.cardBcr.get(0).depunere(Double.parseDouble(textFieldSuma.getText()));
            this.setVisible(false);
        }
        else if(e.getSource() == bancaBrd)
        {
            ArrayListsForInfo.cardBrd.get(0).depunere(Double.parseDouble(textFieldSuma.getText()));
            this.setVisible(false);
        }
        else if(e.getSource() == bancaTransilvania)
        {
            ArrayListsForInfo.cardTransilvania.get(0).depunere(Double.parseDouble(textFieldSuma.getText()));
            this.setVisible(false);
        }
        else if(e.getSource() == bancaRaiffeisen)
        {
            ArrayListsForInfo.cardRaiffeisen.get(0).depunere(Double.parseDouble(textFieldSuma.getText()));
            this.setVisible(false);
        }
    }
}

