package ActiuniCard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transfer_bani extends JFrame implements ActionListener
{
    JButton bcr1,brd1,transilvania1,raiffeisen1;
    JButton bcr2,brd2,transilvania2,raiffeisen2;
    JButton transfer_bani;
    JLabel suma_bani = new JLabel("suma pe care vreti sa o transferati");
    JTextField suma_introdus = new JTextField();

    JPanel panel_bani = new JPanel();
    JPanel panel_carduri = new JPanel();
    JPanel panelcarduri1 = new JPanel();
    JPanel panelcarduri2 = new JPanel();
    JPanel transfer = new JPanel();



    public Transfer_bani()
    {

        //FRAME
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        //this.setSize(500,500);
        this.setLayout(new GridLayout(3,1,10,10));
        this.setPreferredSize(new Dimension(600,400));
        this.add(panel_bani);
        this.add(panel_carduri);
        this.add(transfer);

        this.pack();
        this.setVisible(true);


        //BUTTONS
        bcr1 = new JButton("card Bcr");
        brd1 = new JButton("card Brd");
        transilvania1 = new JButton("card Transilvania");
        raiffeisen1 = new JButton("card Raiffeisen");

        bcr2 = new JButton("card Bcr");
        brd2 = new JButton("card Brd");
        transilvania2 = new JButton("card Transilvania");
        raiffeisen2 = new JButton("card Raiffeisen");

        transfer_bani = new JButton("Finalizati tranzactia");



        //LABELS


        //TEXTFIELDS



        //PANELS
        panel_bani.setLayout(null);
        panel_bani.add(suma_bani);
        suma_bani.setBounds(10,10,300,50);
        panel_bani.add(suma_introdus);
        suma_introdus.setBounds(220,10,300,50);


        panel_carduri.setLayout(new GridLayout(1,2));
        panel_carduri.add(panelcarduri1);
        panel_carduri.add(panelcarduri2);


        panelcarduri1.setLayout(new GridLayout(4,1,10,10));
        panelcarduri1.add(bcr1);
        panelcarduri1.add(brd1);
        panelcarduri1.add(transilvania1);
        panelcarduri1.add(raiffeisen1);


        panelcarduri2.setLayout(new GridLayout(4,1,10,10));
        panelcarduri2.add(bcr2);
        panelcarduri2.add(brd2);
        panelcarduri2.add(transilvania2);
        panelcarduri2.add(raiffeisen2);

        transfer.setLayout(new FlowLayout());
        transfer.add(transfer_bani);
        transfer_bani.setPreferredSize(new Dimension(200,50));




    }






    @Override
    public void actionPerformed(ActionEvent e) {



    }
}
