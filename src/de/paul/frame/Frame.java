package de.paul.frame;

import de.paul.variables.Var;

import javax.swing.*;

public class Frame extends JFrame {



    public Frame(String Title, int width, int height, int operation, boolean visible, boolean resizeable) {
        this.setTitle(Title);
        this.setSize(width, height);
        this.setDefaultCloseOperation(operation);
        this.setVisible(visible);
        this.setResizable(resizeable);

        this.setLocationRelativeTo(null);

        this.getContentPane().setBackground(Var.frameBg);
    }


}
