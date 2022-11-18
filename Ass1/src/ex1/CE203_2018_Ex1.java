package ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;

public class CE203_2018_Ex1 extends JFrame {
    public int width = 400;
    public int height = 400;
    public JTextField textFieldRed;
    public JTextField textFieldGreen;
    public JTextField textFieldYellow;
    public JLabel displayInformation;
    private JPanel jPanelTwo;
    private JPanel jPanelThree;
    private JPanel jPanelOne;

    private JLabel labelRed;
    private JLabel labelGreen;
    private JLabel labelYellow;

    public JButton submit;
    public JButton reset;

    public CE203_2018_Ex1() {
        setSize(width, height);
        textFieldRed = new JTextField(5);
        textFieldGreen = new JTextField(5);
        textFieldYellow = new JTextField(5);

        jPanelOne = new JPanel();
        jPanelTwo = new JPanel(new GridLayout());
        jPanelThree = new JPanel();



        add(jPanelOne, BorderLayout.NORTH);
        add(jPanelTwo, BorderLayout.CENTER);
        add(jPanelThree, BorderLayout.SOUTH);

        reset = new JButton("Reset");
        jPanelOne.add(reset);

        reset.addActionListener(new ResetButtonHandler(this));

        displayInformation = new JLabel("CE203 Assignment 1, submitted by: 1508035",SwingConstants.CENTER);
        displayInformation.setForeground(Color.BLUE);
        jPanelTwo.add(displayInformation, BorderLayout.CENTER);

        labelRed = new JLabel("Red");
        labelGreen = new JLabel("Green");
        labelYellow = new JLabel("Yellow");

        jPanelThree.add(labelRed);
        jPanelThree.add(textFieldRed);
        jPanelThree.add(labelGreen);
        jPanelThree.add(textFieldGreen);
        jPanelThree.add(labelYellow);
        jPanelThree.add(textFieldYellow);

        submit = new JButton("Enter");
        jPanelThree.add(submit);


        submit.addActionListener(new SetColor(this));




    }



}
