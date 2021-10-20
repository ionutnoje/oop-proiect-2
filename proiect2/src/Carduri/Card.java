package Carduri;

public interface Card
{
    public void initializare();
    public void depunere(double suma);
    public void retragere(double suma);
    public double interogare_sold();
    public int verificareRetragere(double suma);

}
