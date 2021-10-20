package ActiuniCard;

import ArrayLists.ArrayListsForInfo;
import Carduri.Bcr;
import Carduri.Brd;
import Carduri.Raiffeisen;
import Carduri.Transilvania;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Retragere extends JFrame implements ActionListener
{

    JPanel panelsuma = new JPanel();
    JPanel panelcarduri = new JPanel();

    JLabel labelsuma = new JLabel("suma de bani pe care vreti sa o retrageti: ");
    JTextField textFieldSuma = new JTextField();
    JLabel labelcarduri = new JLabel("alegeti cardul de pe care retrageti: ");

    JPanel panelgridcarduri = new JPanel();
    JScrollPane scrollPane = new JScrollPane(panelgridcarduri);


    JButton bancaBcr;
    JButton bancaBrd;
    JButton bancaTransilvania;
    JButton bancaRaiffeisen;


    Bcr bcr = new Bcr();
    Brd brd = new Brd();
    Transilvania transilvania = new Transilvania();
    Raiffeisen raiffeisen = new Raiffeisen();


    public Retragere()
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
            if(bcr.verificareRetragere(Double.parseDouble(textFieldSuma.getText())) == 0)
            {
                ArrayListsForInfo.cardBcr.get(0).retragere(Double.parseDouble(textFieldSuma.getText()));
                this.setVisible(false);
            }
            else
            {
                System.out.println("nu se poate realiza tranzactia");
            }

        }
        else if(e.getSource() == bancaBrd)
        {
            if(brd.verificareRetragere(Double.parseDouble(textFieldSuma.getText())) == 0)
            {
                ArrayListsForInfo.cardBrd.get(0).retragere(Double.parseDouble(textFieldSuma.getText()));
                this.setVisible(false);
            }
            else
            {
                System.out.println("nu se poate realiza tranzactia");
            }
        }
        else if(e.getSource() == bancaTransilvania)
        {
            if(transilvania.verificareRetragere(Double.parseDouble(textFieldSuma.getText())) == 0)
            {
                ArrayListsForInfo.cardTransilvania.get(0).retragere(Double.parseDouble(textFieldSuma.getText()));
                this.setVisible(false);
            }
            else
            {
                System.out.println("nu se poate realiza tranzactia");
            }
        }
        else if(e.getSource() == bancaRaiffeisen)
        {
            if(raiffeisen.verificareRetragere(Double.parseDouble(textFieldSuma.getText())) == 0)
            {
                ArrayListsForInfo.cardRaiffeisen.get(0).retragere(Double.parseDouble(textFieldSuma.getText()));
                this.setVisible(false);
            }
            else
            {
                System.out.println("nu se poate realiza tranzactia");
            }
        }
    }
}

