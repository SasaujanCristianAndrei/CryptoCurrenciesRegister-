package controllers;

import models.Coin;
import models.History;
import views.HistoryView;
import views.MainView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainController {

    private MainView mainView;
    private HistoryView historyView;
    private History history;

    public MainController(MainView mainView, HistoryView historyView, History history) {
        this.mainView = mainView;
        this.historyView = historyView;
        this.history = history;

        this.historyView.addExistListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                historyView.setVisible(false);
                mainView.setVisible(true);
            }
        });

        this.mainView.addShowRippleListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(history.getRipple().size()==0) historyView.setTitluLabel("No price history available for Ripple");
                else historyView.setTitluLabel("Showing last "+history.getRipple().size()+" prices for RIPPLE");


                String afis="<html>";
                for(int i=0;i<history.getRipple().size();i++)
                {

                    afis=afis+String.valueOf(i+1)+": "+history.getRipple().get(i).getPrice()+"$<br>";

                }
                afis=afis+"</html>";
                historyView.setHistoryLabel(afis);
                mainView.setVisible(false);
                historyView.setVisible(true);
            }
        });

        this.mainView.addShowEthereumListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(history.getEthereum().size()==0) historyView.setTitluLabel("No price history available for Ethereum");
                else historyView.setTitluLabel("Showing last "+history.getEthereum().size()+" prices for Ethereum");

                String afis="<html>";
                for(int i=0;i<history.getEthereum().size();i++)
                {

                    afis=afis+String.valueOf(i+1)+": "+history.getEthereum().get(i).getPrice()+"$<br>";

                }
                afis=afis+"</html>";
                historyView.setHistoryLabel(afis);
                mainView.setVisible(false);
                historyView.setVisible(true);
            }
        });

        this.mainView.addShowBitcoinListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(history.getBitcoin().size()==0) historyView.setTitluLabel("No price history available for BITCOIN");
                else historyView.setTitluLabel("Showing last "+history.getBitcoin().size()+" prices for Bitcoin");

                String afis="<html>";
                for(int i=0;i<history.getBitcoin().size();i++)
                {

                    afis=afis+String.valueOf(i+1)+": "+history.getBitcoin().get(i).getPrice()+"$<br>";

                }
                afis=afis+"</html>";
                historyView.setHistoryLabel(afis);
                mainView.setVisible(false);
                historyView.setVisible(true);
            }
        });

        this.mainView.addAddPriceListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double pret = mainView.getTextFieldPret();
                    String nume = mainView.getComboBoxCrypto();
                    Coin coin = new Coin(nume, pret);

                    if (nume.equals("BITCOIN"))
                    {
                        history.getBitcoin().add(coin);
                        mainView.setBitcoinCurrentLabel(String.valueOf(pret));
                    }

                    if(nume.equals("RIPPLE"))
                    {
                        history.getRipple().add(coin);
                        mainView.setRippleCurrentLabel(String.valueOf(pret));
                    }
                    if(nume.equals("ETHEREUM"))
                    {
                        history.getEthereum().add(coin);
                        mainView.setEthereumCurrentLabel(String.valueOf(pret));
                    }
                }catch (Exception exception)
                {
                    mainView.showMessage("Bad Input");
                }
            }
        });

    }
}
