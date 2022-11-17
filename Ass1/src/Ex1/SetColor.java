package Ex1;

import Ex1.CE203_2018_Ex1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetColor implements ActionListener {
    CE203_2018_Ex1 frame;

    public SetColor(CE203_2018_Ex1 frame) {
        this.frame = frame;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int red = 0;
        int green = 0;
        int yellow = 0;
        try {
            red = Integer.parseInt(frame.textFieldRed.getText());
            green = Integer.parseInt(frame.textFieldGreen.getText());
            yellow = Integer.parseInt(frame.textFieldYellow.getText());
            if (red < 0) {
                red = 200;
                frame.textFieldRed.setText("200");
            }
            if (green < 0) {
                green = 200;
                frame.textFieldGreen.setText("200");
            }
            if (yellow < 0) {
                yellow = 200;
                frame.textFieldYellow.setText("200");
            }

            if (red > 255) {
                red = 255;
                frame.textFieldRed.setText("255");
            }
            if (yellow > 255) {
                yellow = 255;
                frame.textFieldYellow.setText("255");
            }
            frame.displayInformation.setText("CE203 Assignment 1, submitted by: 1508035");
            frame.displayInformation.setForeground(new Color(red, green, yellow));
            frame.repaint();
        } catch (NumberFormatException ex) {
            if (red == 0) {
                frame.textFieldRed.setText("");
            }
            if (yellow == 0) {
                frame.textFieldYellow.setText("");
            }
            if (green == 0) {
                frame.textFieldGreen.setText("");
            }
            frame.displayInformation.setText("Invalid Input");
            frame.displayInformation.setForeground(Color.BLUE);


        }


    }
}
