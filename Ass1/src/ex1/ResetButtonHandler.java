package ex1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetButtonHandler implements ActionListener {

    CE203_2018_Ex1 frame;

    public ResetButtonHandler(CE203_2018_Ex1 f){
        this.frame = f;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.displayInformation.setText("CE203 Assignment 1, submitted by: 1508035");
        frame.displayInformation.setForeground(Color.BLUE);
        frame.textFieldRed.setText("");
        frame.textFieldGreen.setText("");
        frame.textFieldYellow.setText("");
    }
}
