package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainView extends JFrame {

    private JComboBox comboBoxCrypto;


    private JButton addPriceButton;
    private JButton showButtonBitcoin;
    private JButton showButtonRipple;
    private JButton showButtonEthereum;

    private JLabel bitcoinCurrentLabel;
    private JLabel rippleCurrentLabel;
    private JLabel ethereumCurrentLabel;

    private JTextField textFieldPret;


    public MainView()
    {

        this.setBounds(100, 100, 508, 350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);

        comboBoxCrypto = new JComboBox();
        comboBoxCrypto.setModel(new DefaultComboBoxModel(new String[] {"BITCOIN", "ETHEREUM", "RIPPLE"}));
        comboBoxCrypto.setBounds(10, 11, 132, 22);
        this.getContentPane().add(comboBoxCrypto);

        textFieldPret = new JTextField();
        textFieldPret.setHorizontalAlignment(SwingConstants.RIGHT);
        textFieldPret.setBounds(191, 12, 105, 20);
        this.getContentPane().add(textFieldPret);
        textFieldPret.setColumns(10);

        JLabel dolarLabel = new JLabel("$");
        dolarLabel.setBounds(306, 15, 46, 14);
        this.getContentPane().add(dolarLabel);

        addPriceButton = new JButton("Add price");
        addPriceButton.setBounds(374, 11, 96, 23);
        this.getContentPane().add(addPriceButton);

        JLabel coinNameLabel = new JLabel("Coin name");
        coinNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        coinNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        coinNameLabel.setBounds(10, 114, 106, 22);
        this.getContentPane().add(coinNameLabel);

        JLabel currentPriceLabel = new JLabel("Current price($)");
        currentPriceLabel.setHorizontalAlignment(SwingConstants.CENTER);
        currentPriceLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        currentPriceLabel.setBounds(166, 114, 132, 22);
        this.getContentPane().add(currentPriceLabel);

        JLabel historyLabel = new JLabel("History");
        historyLabel.setHorizontalAlignment(SwingConstants.CENTER);
        historyLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        historyLabel.setBounds(327, 114, 132, 22);
        this.getContentPane().add(historyLabel);

        showButtonBitcoin = new JButton("Show");
        showButtonBitcoin.setFont(new Font("Tahoma", Font.PLAIN, 16));
        showButtonBitcoin.setBounds(348, 152, 89, 29);
        this.getContentPane().add(showButtonBitcoin);

        showButtonRipple = new JButton("Show");
        showButtonRipple.setFont(new Font("Tahoma", Font.PLAIN, 16));
        showButtonRipple.setBounds(348, 195, 89, 29);
        this.getContentPane().add(showButtonRipple);

        showButtonEthereum = new JButton("Show");
        showButtonEthereum.setFont(new Font("Tahoma", Font.PLAIN, 16));
        showButtonEthereum.setBounds(348, 241, 89, 29);
        this.getContentPane().add(showButtonEthereum);

        JLabel bitcoinLabel = new JLabel("Bitcoin");
        bitcoinLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        bitcoinLabel.setHorizontalAlignment(SwingConstants.CENTER);
        bitcoinLabel.setBounds(27, 161, 69, 20);
        this.getContentPane().add(bitcoinLabel);

        JLabel rippleLabel = new JLabel("Ripple");
        rippleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        rippleLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rippleLabel.setBounds(27, 204, 69, 20);
        this.getContentPane().add(rippleLabel);

        JLabel ethLabel = new JLabel("Ethereum");
        ethLabel.setHorizontalAlignment(SwingConstants.CENTER);
        ethLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        ethLabel.setBounds(27, 245, 69, 20);
        this.getContentPane().add(ethLabel);

        bitcoinCurrentLabel = new JLabel("-");
        bitcoinCurrentLabel.setHorizontalAlignment(SwingConstants.CENTER);
        bitcoinCurrentLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        bitcoinCurrentLabel.setBounds(191, 161, 69, 20);
        this.getContentPane().add(bitcoinCurrentLabel);

        rippleCurrentLabel = new JLabel("-");
        rippleCurrentLabel.setHorizontalAlignment(SwingConstants.CENTER);
        rippleCurrentLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rippleCurrentLabel.setBounds(191, 204, 69, 20);
        this.getContentPane().add(rippleCurrentLabel);

        ethereumCurrentLabel = new JLabel("-");
        ethereumCurrentLabel.setHorizontalAlignment(SwingConstants.CENTER);
        ethereumCurrentLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        ethereumCurrentLabel.setBounds(191, 245, 69, 20);
        this.getContentPane().add(ethereumCurrentLabel);

        this.setVisible(true);
    }

    public void addAddPriceListener(ActionListener action)
    {
        addPriceButton.addActionListener(action);
    }

    public void addShowBitcoinListener(ActionListener action)
    {
        showButtonBitcoin.addActionListener(action);
    }

    public void addShowRippleListener(ActionListener action)
    {
        showButtonRipple.addActionListener(action);
    }

    public void addShowEthereumListener(ActionListener action)
    {
        showButtonEthereum.addActionListener(action);
    }

    public String getComboBoxCrypto() {
        return comboBoxCrypto.getSelectedItem().toString();
    }

    public JLabel getBitcoinCurrentLabel() {
        return bitcoinCurrentLabel;
    }

    public void setBitcoinCurrentLabel(String bitcoinCurrentLabel) {
        this.bitcoinCurrentLabel.setText(bitcoinCurrentLabel);
    }

    public JLabel getRippleCurrentLabel() {
        return rippleCurrentLabel;
    }

    public void setRippleCurrentLabel(String rippleCurrentLabel) {
        this.rippleCurrentLabel.setText(rippleCurrentLabel);
    }

    public JLabel getEthereumCurrentLabel() {
        return ethereumCurrentLabel;
    }

    public void setEthereumCurrentLabel(String ethereumCurrentLabel) {
        this.ethereumCurrentLabel.setText(ethereumCurrentLabel);
    }

    public double getTextFieldPret() {
        return Double.parseDouble(textFieldPret.getText());
    }

    public void setTextFieldPret(String textFieldPret) {
        this.textFieldPret.setText(String.valueOf(textFieldPret));
    }

    public void showMessage(String message)
    {
        JOptionPane.showMessageDialog(this,message);
        refresh();
    }

    public void refresh()
    {
        textFieldPret=null;
    }
}
