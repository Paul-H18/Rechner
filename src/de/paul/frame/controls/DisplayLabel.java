package de.paul.frame.controls;

import javax.swing.*;

public class DisplayLabel extends JLabel {

    private int maxContent = 13;


    public int getCountOfContent() {
        char[] t = this.getText().toCharArray();

        //bei text = "000" ist t.length = 3

        return t.length;
    }


    public void addText(String s) {
        String current = this.getText();

        this.setText(current + s);
    }

    public void addTextChar(char c) {
        String current = this.getText();

        this.setText(current + c);
    }

    public boolean isFull() {
        if(this.getCountOfContent() == this.getMaxContent()) {
            return true;
        } else {
            return false;
        }
    }

    public void setMaxContent(int maxContent) {
        this.maxContent = maxContent;
    }

    public int getMaxContent() {
        return this.maxContent;
    }

    public void reset() {
        this.setText("0");
    }



}
