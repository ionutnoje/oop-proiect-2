package Meniu;

import ActiuniCard.CreareCard;
import ActiuniCard.Depunere;
import ActiuniCard.Retragere;
import ActiuniCard.Transfer_bani;
import ArrayLists.ArrayListsForInfo;
import Frameuri.DateCarduriFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Meniu extends JFrame implements ActionListener
{
    JLabel utilizator;
    JLabel sumatotala;
    JLabel sumacardBcr ;
    JLabel sumacardBrd;
    JLabel sumacardTransilvania;
    JLabel sumacardRaiffeisen;
    JLabel soldcardurilor = new JLabel("soldul cardurilor: ");
    JLabel meniu = new JLabel("Meniu: ");

    JButton cumparare,retragere,depunere,adaugare_card,transfer_bani;


    double suma_totala_conturi = 0;

    JMenuBar menuBar = new JMenuBar();
    JMenu navigare = new JMenu("navigare");
    JMenu refresh = new JMenu("refresh");

    JMenuItem refreshh = new JMenuItem("refresh");

    JMenuItem exit = new JMenuItem("exit");

    JPanel panel = new JPanel();
    JPanel meniu_carduri = new JPanel();

    public Meniu()
    {
        //FRAME



        suma_totala_conturi = ArrayListsForInfo.suma_contRaiffeisen() + ArrayListsForInfo.suma_contTransilvania() + ArrayListsForInfo.suma_contBcr() + ArrayListsForInfo.suma_contBrd();








        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(700,500);
        this.add(utilizator = new JLabel("utilizator: " + ArrayListsForInfo.date.get(0).nume+ " " + ArrayListsForInfo.date.get(0).prenume));
        this.add(sumatotala = new JLabel("suma totala din toate conturile: " + suma_totala_conturi));
        this.setJMenuBar(menuBar);
        this.add(panel);
        this.add(meniu_carduri);




        this.setVisible(true);





        //LABELS

        utilizator.setBounds(10,10,200,50);
        sumatotala.setBounds(300,10,250,50);

        if(ArrayListsForInfo.suma_contBcr() != null)
        {
            sumacardBcr = new JLabel();
            sumacardBcr.setText("CARD BCR: " + ArrayListsForInfo.suma_contBcr());
        }
        else
        {
            sumacardBcr = new JLabel();
            sumacardBcr.setText("CARD BCR: 0.0");
        }
        if(ArrayListsForInfo.suma_contBrd() != null)
        {
            sumacardBrd = new JLabel();
            sumacardBrd.setText("CARD BRD: " + ArrayListsForInfo.suma_contBrd());
        }
        else
        {
            sumacardBrd = new JLabel();
            sumacardBrd.setText("CARD BRD: 0.0");
        }
        if(ArrayListsForInfo.suma_contTransilvania() != null)
        {
            sumacardTransilvania = new JLabel();
            sumacardTransilvania.setText("CARD TRANSILVANIA: " + ArrayListsForInfo.suma_contTransilvania());
        }
        else
        {
            sumacardTransilvania = new JLabel();
            sumacardTransilvania.setText("CARD TRANSILVANIA: 0.0");
        }
        if(ArrayListsForInfo.suma_contRaiffeisen() != null)
        {
            sumacardRaiffeisen = new JLabel();
            sumacardRaiffeisen.setText("CARD RAIFFEISEN: " + ArrayListsForInfo.suma_contRaiffeisen());
        }
        else
        {
            sumacardRaiffeisen = new JLabel();
            sumacardRaiffeisen.setText("CARD RAIFFEISEN: 0.0");
        }










        //JMENUITEMS
        menuBar.add(navigare);
        menuBar.add(refresh);

        navigare.add(exit);
        refresh.add(refreshh);

        exit.addActionListener(this);


        refreshh.addActionListener(this);



        //PANEL
        panel.setLayout(new GridLayout(5,1,10,0));
        panel.add(soldcardurilor);
        panel.add(sumacardBcr);
        panel.add(sumacardBrd);
        panel.add(sumacardTransilvania);
        panel.add(sumacardRaiffeisen);
        panel.setBounds(10,250,200,100);




        meniu_carduri.setLayout(new GridLayout(5,1,10,0));
        meniu_carduri.setBounds(300,250,200,100);
        meniu_carduri.add(meniu);
        meniu_carduri.add(transfer_bani = new JButton("transfer bani"));
        meniu_carduri.add(retragere = new JButton("retragere suma"));
        meniu_carduri.add(depunere = new JButton("depunere suma"));
        meniu_carduri.add(adaugare_card = new JButton("adaugare card"));




        transfer_bani.addActionListener(this);
        retragere.addActionListener(this);
        depunere.addActionListener(this);
        adaugare_card.addActionListener(this);




    }







    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == exit)
        {
            System.exit(0);
        }
        else if(e.getSource() == refreshh)
        {
            this.setVisible(false);
            new Meniu();
        }
        else if(e.getSource() == transfer_bani)
        {
            System.out.println("cumparare");
            new Transfer_bani();
        }
        else if(e.getSource() == retragere)
        {
            System.out.println("retragere");
            new Retragere();
        }
        else if(e.getSource() == depunere)
        {
            System.out.println("depunere");
            new Depunere();
        }
        else if(e.getSource() == adaugare_card)
        {
            System.out.println("creati card");
            new CreareCard();
        }
    }
}

