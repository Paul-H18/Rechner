package de.paul.frame.controls;

import javax.swing.*;

public class NumberButton extends JButton {

    private int number;
    private JFrame parentFrame;

    public NumberButton(int number, JFrame parentFrame, int width, int height) {
        this.number = number;
        this.parentFrame = parentFrame;

        //Methode prüfen
        this.setSize(width, height);


        this.setText(Integer.toString(this.number));
        this.parentFrame.add(this);

        this.setFocusable(false);
    }

    public NumberButton(int number, JFrame parentFrame, int width, int height, int x, int y) {
        this.number = number;
        this.parentFrame = parentFrame;

        //Methode prüfen
        this.setBounds(x, y, width, height);


        this.setText(Integer.toString(this.number));
        this.parentFrame.add(this);

        this.setFocusable(false);
    }

    public int getNumber() {
        return this.number;
    }

    public JFrame getParentFrame() {
        return this.parentFrame;
    }

}
