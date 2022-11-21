package ex2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

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
            if (frame.enterWordInTextField.getText().length() == 0) {
                frame.displayInformation.setText("The TextField is Empty");
                frame.enterWordInTextField.setText("");
            } else {
                frame.displayInformation.setText("The word " + frame.enterWordInTextField.getText() + " was added successfully");
                frame.words.add(frame.enterWordInTextField.getText());
                frame.enterWordInTextField.setText("");
            }
        }

        if (action == 2) {
            if (frame.enterWordInTextField.getText().length() == 0) {
                frame.displayInformation.setText("The TextField is Empty");
                frame.enterWordInTextField.setText("");
            } else {
                ArrayList<String> occurrenceOfWord = new ArrayList<>();
                for (int i = 0; i < frame.words.size(); i++) {
                    char lastLetter = frame.words.get(i).charAt(frame.words.get(i).length() - 1);
                    if (frame.enterWordInTextField.getText().equals(String.valueOf(lastLetter))) {
                        occurrenceOfWord.add(frame.words.get(i));
                    }
                }
                if (occurrenceOfWord.isEmpty()) {
                    frame.displayInformation.setText("No last occurrence of the letter typed :(");
                    frame.enterWordInTextField.setText("");
                } else {
                    frame.displayInformation.setText(String.valueOf(occurrenceOfWord));
                    frame.enterWordInTextField.setText("");
                }
            }
        }

        if (action == 3) {
            int totalWords = 0;
            if (frame.enterWordInTextField.getText().length() == 0) {
                for (int i = 0; i < frame.words.size(); i++) {
                    totalWords++;
                }
                frame.displayInformation.setText("Total Number of words in the list is: " + totalWords);
                frame.enterWordInTextField.setText("");
            } else {
                ArrayList<String> findWordPosition = new ArrayList<>();
                String word = "";
                for (int i = 0; i < frame.words.size(); i++) {
                    if (frame.enterWordInTextField.getText().equals(frame.words.get(i))) {
                        totalWords++;
                        findWordPosition.add(String.valueOf(i));
                        word = frame.enterWordInTextField.getText();
                    }
                }
                if (!(frame.words.contains(frame.enterWordInTextField.getText()))) {
                    frame.displayInformation.setText("'" + frame.enterWordInTextField.getText() + "' is not found in the list");
                } else {
                    frame.displayInformation.setText(totalWords + " occurrences of the '" + word + "' at positions" + findWordPosition);
                }
            }
        }

        if (action == 6) {
            frame.words.clear();
            frame.displayInformation.setText("ArrayList is cleared :(");
        }

        if (action == 4) {
            try {
                int lastOccurrence = frame.words.lastIndexOf(frame.enterWordInTextField.getText());
                frame.displayInformation.setText("Last occurrence of '" + frame.enterWordInTextField.getText() + "' was removed from the ArrayList");
                frame.words.remove(lastOccurrence);
                frame.enterWordInTextField.setText("");
            } catch (IndexOutOfBoundsException ex) {
                frame.displayInformation.setText("The word '" + frame.enterWordInTextField.getText() + "' was not found");
                frame.enterWordInTextField.setText("");
            }
        }

        if (action == 5) {
            if (!frame.words.contains(frame.enterWordInTextField.getText())) {
                frame.displayInformation.setText("NOT FOUND");
                frame.enterWordInTextField.setText("");
            } else {
                frame.displayInformation.setText("All occurrences of '"+frame.enterWordInTextField.getText()+"' was removed successfully");
                frame.words.removeAll(Collections.singleton(frame.enterWordInTextField.getText()));
                frame.enterWordInTextField.setText("");

            }

        }

    }
}
