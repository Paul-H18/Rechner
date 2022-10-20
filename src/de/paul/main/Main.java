package de.paul.main;

import de.paul.frame.Frame;
import de.paul.frame.controls.DisplayLabel;
import de.paul.frame.controls.NumberButton;
import de.paul.math.Operation;
import de.paul.variables.Var;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        startUp();

        //2
    }



    public static void startUp() {
        System.out.println("Calculator is staring...\nBuilding Main Window...");


        Var.mainFrame = new Frame("Calculator", 600, 614, JFrame.EXIT_ON_CLOSE, true, false);

        Var.icon = new ImageIcon("src/de/paul/rsc/icon.png");

        Var.mainFrame.setIconImage(Var.icon.getImage());



        buildMainLabel();

        Var.mainFrame.setLayout(null);

        System.out.println("Building Buttons...");

        buildButtons();

        System.out.println("Buttons successfully built!");


        //removes invisible Button Bug
        Var.mainFrame.repaint();
        System.out.println("Main Window successfully built!");


        System.out.println("Calculator successfully started!");


    }


    public static void buildButtons() {

        Var.numberButtonList = new ArrayList<NumberButton>();


        //Operation is defined
        Var.op = new Operation();

        for (int i = 0; i <= 9; i++) {

            Var.numberButtonList.add(new NumberButton(i, Var.mainFrame, 100, 100));
            Var.numberButtonList.get(i).setBorder(new LineBorder(Var.buttonBorder));

            Var.numberButtonList.get(i).setFocusPainted(false);
            Var.numberButtonList.get(i).setBackground(Var.buttonBg);
            Var.numberButtonList.get(i).setForeground(Var.txt);

            final int j = i;

            Var.numberButtonList.get(i).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Pressed Button " + Var.numberButtonList.get(j).getNumber());

                    if (!Var.mainLabel.isFull()) {
                        if (Objects.equals(Var.mainLabel.getText(), "0")) {
                            if (j == 0) {

                            } else {
                                Var.mainLabel.setText(Integer.toString(j));
                            }
                        } else {
                            Var.mainLabel.addText(Integer.toString(j));
                        }
                    } else {
                        System.out.println("Number not added, because Label is full!");
                    }
                }
            });

            Var.numberButtonFont = new Font("Segoe UI", Font.PLAIN, 38);

            Var.numberButtonList.get(i).setFont(Var.numberButtonFont);


        }

        Var.mainFrame.addKeyListener(Var.keyControl);



        Var.numberButtonList.get(2).setBounds (130, 345, 100, 100);
        Var.numberButtonList.get(3).setBounds (245, 345, 100, 100);
        Var.numberButtonList.get(0).setBounds (15, 460, 100, 100);
        Var.numberButtonList.get(1).setBounds (15, 345, 100, 100);
        Var.numberButtonList.get(6).setBounds (245, 230, 100, 100);
        Var.numberButtonList.get(5).setBounds (130, 230, 100, 100);
        Var.numberButtonList.get(4).setBounds (15, 230, 100, 100);
        Var.numberButtonList.get(7).setBounds (15, 115, 100, 100);
        Var.numberButtonList.get(8).setBounds (130, 115, 100, 100);
        Var.numberButtonList.get(9).setBounds (245, 115, 100, 100);


        Var.deleteCurrentNumbers = new JButton("C");
        Var.deleteCurrentNumbers.setBounds (130, 460, 100, 100);
        Var.deleteCurrentNumbers.setFocusPainted(false);
        Var.deleteCurrentNumbers.setBorder(new LineBorder(Var.buttonBorder));
        Var.deleteCurrentNumbers.setFont(Var.numberButtonFont);
        Var.deleteCurrentNumbers.setBackground(Var.buttonBg);
        Var.deleteCurrentNumbers.setForeground(Var.txt);
        Var.deleteCurrentNumbers.setFocusable(false);
        Var.deleteCurrentNumbers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Pressed Button C");
                Var.mainLabel.reset();
            }
        });

        Var.equals = new JButton("=");
        Var.equals.setBounds (245, 460, 100, 100);
        Var.equals.setFocusPainted(false);
        Var.equals.setBorder(new LineBorder(Var.buttonBorder));
        Var.equals.setFont(Var.numberButtonFont);
        Var.equals.setFocusable(false);
        Var.equals.setBackground(Var.buttonBg);
        Var.equals.setForeground(Var.txt);

        Var.equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Var.op.setB(Var.mainLabel.getContent());

                Var.mainLabel.setText(Integer.toString(Var.op.getResult()));

                System.out.println(Var.op.getA() + " " + Var.op.getOperation() + " " + Var.op.getB() + " = " + Var.op.getResult());
            }
        });


        Var.plus = new JButton("+");
        Var.plus.setBounds (360, 460, 100, 100);
        Var.plus.setFocusPainted(false);
        Var.plus.setBorder(new LineBorder(Var.buttonBorder));
        Var.plus.setFont(Var.numberButtonFont);
        Var.plus.setFocusable(false);
        Var.plus.setBackground(Var.buttonBg);
        Var.plus.setForeground(Var.txt);

        Var.plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Var.op.setOperation(Operation.op.PLUS);
                Var.op.setA(Integer.parseInt(Var.mainLabel.getText()));


                Var.mainLabel.reset();
            }
        });




        Var.minus = new JButton("-");
        Var.minus.setBounds (360, 345, 100, 100);
        Var.minus.setFocusPainted(false);
        Var.minus.setBorder(new LineBorder(Var.buttonBorder));
        Var.minus.setFont(Var.numberButtonFont);
        Var.minus.setFocusable(false);
        Var.minus.setBackground(Var.buttonBg);
        Var.minus.setForeground(Var.txt);

        Var.minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Var.op.setOperation(Operation.op.MINUS);
                Var.op.setA(Integer.parseInt(Var.mainLabel.getText()));


                Var.mainLabel.reset();
            }
        });




        Var.mainFrame.add(Var.minus);
        Var.mainFrame.add(Var.plus);
        Var.mainFrame.add(Var.equals);
        Var.mainFrame.add(Var.deleteCurrentNumbers);
    }

    public static void buildMainLabel() {
        Var.mainLabel = new DisplayLabel();
        Var.mainLabel.setText("0");

        Var.mainLabelFont = new Font("Segoe UI", Font.BOLD, 44);

        Var.mainLabel.setFont(Var.mainLabelFont);
        Var.mainLabel.setForeground(Var.txt);

        Var.mainLabel.setBounds(15, 5, 330, 90);
        Var.mainLabel.setHorizontalAlignment(SwingConstants.RIGHT);

        Var.mainLabel.setBorder(new LineBorder(Var.buttonBorder));



        Var.mainFrame.add(Var.mainLabel);
    }




}
