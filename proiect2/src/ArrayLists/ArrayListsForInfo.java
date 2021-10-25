package ArrayLists;



import Carduri.Bcr;
import Carduri.Brd;
import Carduri.Raiffeisen;
import Carduri.Transilvania;
import Persoana.Persoana;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListsForInfo
{
    public static ArrayList<Persoana> date = new ArrayList<>();
    public static ArrayList <Bcr> cardBcr = new ArrayList<>();
    public static ArrayList <Brd> cardBrd = new ArrayList<>();
    public static ArrayList <Transilvania> cardTransilvania = new ArrayList<>();
    public static ArrayList <Raiffeisen> cardRaiffeisen = new ArrayList<>();

    String nume,prenume;
    double suma;

//    public ArrayListsForInfo(String nume, String prenume, double suma)
//    {
//
//        this.suma = suma;
//        this.nume = nume;
//        this.prenume = prenume;
//
//    }
//    public void getInfo(String nume,String prenume, double suma)
//    {
//        this.nume = nume;
//        this.prenume = prenume;
//        this.suma = suma;
//    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }


    public static Double suma_contBcr()
    {
        if(ArrayListsForInfo.cardBcr.isEmpty() == false)
        {
            return ArrayListsForInfo.cardBcr.get(0).getSold();
        }
        else
            return 0.0;

    }
    public static Double suma_contBrd()
    {
        if(ArrayListsForInfo.cardBrd.isEmpty() == false)
        {
            return ArrayListsForInfo.cardBrd.get(0).getSold();
        }
        else
            return 0.0;

    }
    public static Double suma_contTransilvania()
    {
        if(ArrayListsForInfo.cardTransilvania.isEmpty() == false)
        {
            return ArrayListsForInfo.cardTransilvania.get(0).getSold();
        }
        else
            return 0.0;

    }
    public static Double suma_contRaiffeisen()
    {
        if(ArrayListsForInfo.cardRaiffeisen.isEmpty() == false)
        {
            return ArrayListsForInfo.cardRaiffeisen.get(0).getSold();
        }
        else
            return 0.0;

    }



}

