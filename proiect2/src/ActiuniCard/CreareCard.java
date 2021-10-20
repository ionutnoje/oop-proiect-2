package ActiuniCard;

import ArrayLists.ArrayListsForInfo;
import Carduri.Bcr;
import Carduri.Brd;
import Carduri.Raiffeisen;
import Carduri.Transilvania;
import Frameuri.DateCarduriFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreareCard extends JFrame implements ActionListener
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



    public CreareCard()
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
            if(DateCarduriFrame.contorBcr == 0)
            {
                ArrayListsForInfo.cardBcr.add(new Bcr(Double.parseDouble(textFieldSuma.getText())));
                this.setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"nu puteti avea mai multe carduri la aceeasi banca","eroare la adaugare",JOptionPane.ERROR_MESSAGE);
            }

        }
        else if(e.getSource() == bancaBrd)
        {
            if(DateCarduriFrame.contorBrd == 0)
            {
                ArrayListsForInfo.cardBrd.add(new Brd(Double.parseDouble(textFieldSuma.getText())));
                this.setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"nu puteti avea mai multe carduri la aceeasi banca","eroare la adaugare",JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(e.getSource() == bancaTransilvania)
        {
            if(DateCarduriFrame.contorTransilvania == 0)
            {
                ArrayListsForInfo.cardTransilvania.add(new Transilvania(Double.parseDouble(textFieldSuma.getText())));
                this.setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"nu puteti avea mai multe carduri la aceeasi banca","eroare la adaugare",JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(e.getSource() == bancaRaiffeisen)
        {
            if(DateCarduriFrame.contorRaiffeisen == 0)
            {
                ArrayListsForInfo.cardRaiffeisen.add(new Raiffeisen(Double.parseDouble(textFieldSuma.getText())));
                this.setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"nu puteti avea mai multe carduri la aceeasi banca","eroare la adaugare",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

