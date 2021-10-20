package Carduri;

public class Raiffeisen implements Card{

    private double sold;


    public Raiffeisen()
    {

    }


    public Raiffeisen(double suma)
    {
        this.sold = suma;
    }


    @Override
    public void initializare() {
        this.sold = 0;
    }

    @Override
    public void depunere(double suma) {
        this.sold = this.sold + suma;
    }

    @Override
    public void retragere(double suma) {
        this.sold = this.sold - suma;
    }

    @Override
    public double interogare_sold() {
        return this.sold;
    }

    @Override
    public int verificareRetragere(double suma)
    {
        if(sold < suma)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    public double getSold() {
        return sold;
    }
}

