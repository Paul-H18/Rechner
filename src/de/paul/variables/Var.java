package de.paul.variables;

import de.paul.frame.Frame;
import de.paul.frame.controls.DisplayLabel;
import de.paul.frame.controls.KeyControl;
import de.paul.frame.controls.NumberButton;
import de.paul.math.Operation;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;

public class Var {

    public static int i;

    public static Frame mainFrame;

    public static ImageIcon icon;

    public static File iconFile;


    //Jbuttons for Numbers
    public static JButton test;

    public static ArrayList<NumberButton> numberButtonList;

    public static JButton equals, deleteCurrentNumbers;

    public static JButton plus, minus;


    public static DisplayLabel mainLabel;

    public static Font numberButtonFont, mainLabelFont;


    //Operation Handler
    public static Operation op;

    //Colours
    public static Color buttonBorder = Color.LIGHT_GRAY, buttonBg = Color.GRAY ,frameBg = Color.DARK_GRAY, txt = Color.WHITE;

    public static KeyControl keyControl = new KeyControl();


}
