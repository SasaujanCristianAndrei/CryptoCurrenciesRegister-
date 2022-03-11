package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowListener;

public class HistoryView extends JFrame {

    private JLabel titluLabel;
    private JLabel historyLabel;


    public HistoryView()
    {

        this.getContentPane().setEnabled(false);
        this.setBounds(100, 100, 600, 350);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.getContentPane().setLayout(null);

        titluLabel = new JLabel("");
        titluLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        titluLabel.setBounds(28, 11, 357, 33);
        this.getContentPane().add(titluLabel);

        historyLabel = new JLabel("");
        historyLabel.setHorizontalAlignment(SwingConstants.LEFT);
        historyLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        historyLabel.setBounds(28, 55, 162, 217);
        this.getContentPane().add(historyLabel);
        this.setVisible(false);
    }
    public void addExistListener(WindowListener action)
    {
        this.addWindowListener(action);
    }


    public void setTitluLabel(String titluLabel) {
        this.titluLabel.setText(titluLabel);
    }


    public void setHistoryLabel(String historyLabel) {
        this.historyLabel.setText(historyLabel);
    }
}
