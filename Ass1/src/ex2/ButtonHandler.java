package ex2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ButtonHandler implements ActionListener {
    CE203_2018_Ex2 frame;
    int action;


    ButtonHandler(CE203_2018_Ex2 frame, int action) {
        this.frame = frame;
        this.action = action;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (action == 1) {
            if (frame.enterWordInTextFied.getText().length() == 0) {
                frame.displayInformation.setText("The TextField is Empty");
                frame.enterWordInTextFied.setText("");
            } else {
                frame.displayInformation.setText("The word " + frame.enterWordInTextFied.getText() + " was added successfully");
                frame.words.add(frame.enterWordInTextFied.getText());
                frame.enterWordInTextFied.setText("");
            }
        }

        if (action == 2) {
            if (frame.enterWordInTextFied.getText().length() == 0) {
                frame.displayInformation.setText("The TextField is Empty");
                frame.enterWordInTextFied.setText("");
            } else {
                ArrayList<String> occurrenceOfWord = new ArrayList<>();
                for (int i = 0; i < frame.words.size(); i++) {
                    char lastLetter = frame.words.get(i).charAt(frame.words.get(i).length() - 1);
                    if (frame.enterWordInTextFied.getText().equals(String.valueOf(lastLetter))) {
                        occurrenceOfWord.add(frame.words.get(i));
                    }
                }
                if (occurrenceOfWord.isEmpty()) {
                    frame.displayInformation.setText("No last occurrence of the letter typed :(");
                    frame.enterWordInTextFied.setText("");
                } else {
                    frame.displayInformation.setText(String.valueOf(occurrenceOfWord));
                }
            }
        }

        if (action == 3){
            int totalWords =0;
            if (frame.enterWordInTextFied.getText().length() == 0) {
                for (int i = 0; i < frame.words.size(); i++) {
                    totalWords++;
                }
                frame.displayInformation.setText("Total Number of words in the list is: "+ totalWords);
                frame.enterWordInTextFied.setText("");
            }else {
                ArrayList<String> findWordPosition = new ArrayList<>();
                String word= "";
                for (int i = 0; i < frame.words.size(); i++) {
                    if (frame.enterWordInTextFied.getText().equals(frame.words.get(i))){
                        totalWords++;
                        findWordPosition.add(String.valueOf(i));
                        word = frame.enterWordInTextFied.getText();
                    }
                }
                if (!(frame.words.contains(frame.enterWordInTextFied.getText()))){
                    frame.displayInformation.setText("'"+frame.enterWordInTextFied.getText()+"' is not found in the list");
                }else {
                    frame.displayInformation.setText(totalWords + " occurrences of the '"+ word+"' at positions"+findWordPosition);
                }
            }
        }

        if (action == 6){
            frame.words.clear();
            frame.displayInformation.setText("ArrayList is cleared :(");

        }

    }
}
