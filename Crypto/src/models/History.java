package models;

import java.util.ArrayList;
import java.util.List;

public class History {

    private List<Coin> Bitcoin;
    private List<Coin> Ripple;
    private List<Coin> Ethereum;

    public History()
    {
        this.Bitcoin = new ArrayList<>();
        this.Ripple = new ArrayList<>();
        this.Ethereum = new ArrayList<>();
    }

    public List<Coin> getBitcoin() {
        return Bitcoin;
    }

    public void setBitcoin(List<Coin> bitcoin) {
        Bitcoin = bitcoin;
    }

    public List<Coin> getRipple() {
        return Ripple;
    }

    public void setRipple(List<Coin> ripple) {
        Ripple = ripple;
    }

    public List<Coin> getEthereum() {
        return Ethereum;
    }

    public void setEthereum(List<Coin> ethereum) {
        Ethereum = ethereum;
    }
}
