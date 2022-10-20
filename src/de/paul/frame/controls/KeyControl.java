package de.paul.frame.controls;

import de.paul.variables.Var;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Objects;

public class KeyControl implements KeyListener {





    @Override
    public void keyTyped(KeyEvent e) {
        if(e.getKeyChar() == '0' || e.getKeyChar() == '1' || e.getKeyChar() == '2' || e.getKeyChar() == '3' || e.getKeyChar() == '4' || e.getKeyChar() == '5' || e.getKeyChar() == '6' || e.getKeyChar() == '7' || e.getKeyChar() == '8' || e.getKeyChar() == '9') {

            if(!Var.mainLabel.isFull()) {

                if(Objects.equals(Var.mainLabel.getText(), "0")) {
                    if(e.getKeyChar() == '0') {

                    } else {
                        String s = "" + e.getKeyChar();
                        Var.mainLabel.setText(s);
                        System.out.println("Added " + e.getKeyChar() + " as Keyboard input!");
                    }
                } else {
                    Var.mainLabel.addTextChar(e.getKeyChar());
                    System.out.println("Added " + e.getKeyChar() + " as Keyboard input!");
                }
            } else {
                System.out.println(e.getKeyChar() + " was not added due to full Label!");
            }
        } else if(e.getKeyChar() == 'c' || e.getKeyChar() == 'C') {
            Var.mainLabel.reset();
            System.out.println("Cleared through Keyboard input!");

        } else if(e.getKeyChar() == KeyEvent.VK_ENTER) {

            Var.op.setB(Var.mainLabel.getContent());

            Var.mainLabel.setText(Integer.toString(Var.op.getResult()));

            System.out.println("Pressed Key ENTER");
            System.out.println(Var.op.getA() + " " + Var.op.getOperation() + " " + Var.op.getB() + " = " + Var.op.getResult());
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
