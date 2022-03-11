package models;

public class Coin {

    private String nume;
    private double price;

    public Coin(String nume, double price) {
        this.nume = nume;
        this.price = price;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "nume='" + nume + '\'' +
                ", price=" + price +
                '}';
    }
}
