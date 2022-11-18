import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
/*
created by gabrieliyinbor 1508035
 */

public class CE203_2018_Ex2 {

    private LinkedList<String> wordList = new LinkedList<>();
    private JTextField input = new JTextField(10);

    public static void main(String[] args) {
        //create instance of the class
        CE203_2018_Ex2 swingLayoutDemo = new CE203_2018_Ex2();
        //call the method to create the gui
        swingLayoutDemo.createAndShowGUI();
    }

    private void createAndShowGUI() {
        JFrame mainFrame = new JFrame("CE203 2018 Ex2");
        mainFrame.setSize(450, 450);
        //using border layout for top/center/bottom parts
        mainFrame.setLayout(new BorderLayout());
        //when close buttonListener is pressed, execution will terminate
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //define top panel with 2x3 grid layout
        JPanel topPanel = new JPanel(new GridLayout(2, 3));
        JButton addWord = new JButton("Add word");
        topPanel.add(addWord);
        //create findByEnding buttonListener with its text
        JButton findByEnding = new JButton("Find by ending");
        topPanel.add(findByEnding);
        JButton findWord = new JButton("Find word");
        topPanel.add(findWord);
        //create removeLast buttonListener with its text
        JButton removeLast = new JButton("Remove last");
        topPanel.add(removeLast);
        //create removeAll buttonListener with its text
        JButton removeAll = new JButton("Remove all");
        topPanel.add(removeAll);
        JButton clearList = new JButton("Clear list");
        topPanel.add(clearList);
        mainFrame.add(topPanel, BorderLayout.NORTH);

        //define center panel with grid layout so its content will be vertically centered
        JPanel centerPanel = new JPanel(new GridLayout());
        //label for displaying output horizontally centered
        JLabel displayLabel = new JLabel("", SwingConstants.CENTER);
        //default color is blue
        displayLabel.setForeground(Color.BLUE);
        centerPanel.add(displayLabel);
        mainFrame.add(centerPanel, BorderLayout.CENTER);

        //define bottom panel
        JPanel bottomPanel = new JPanel();
        bottomPanel.add(new JLabel("Input:"));
        bottomPanel.add(input);
        //add bottom panel to the Frame frame, positioned to the bottom
        mainFrame.add(bottomPanel, BorderLayout.SOUTH);

        //when add buttonListener is pressed
        addWord.addActionListener(e -> {
            String word = input.getText();
            //it has at least one character, first character is letter and contains only letters, digits and hyphens
            if (!word.isEmpty() && Character.isLetter(word.charAt(0)) && word.matches("[a-zA-Z0-9-]*")) {
                //add the word to the list
                wordList.add(word);
                //display the message
                displayLabel.setText("Word ‘" + word + "’ has been added to the list");
            } else {
                //display the error message
                displayLabel.setText("The string ‘" + word + "’ was not added to the list as it is not a valid word.");
            }
            clearInputAndGainFocus();
        });

        findByEnding.addActionListener(e -> {
            String letter = input.getText();
            if (letter.length() == 1) {
                //filter out all the words ending with the letter from the input
                //comparing values converted to upper case
                //resulting list is converted to comma separated string
                String result = wordList.stream().filter(w -> w.toUpperCase().endsWith(letter.toUpperCase())).collect(Collectors.joining(", "));
                //if result is empty
                if (result.isEmpty()) {
                    displayLabel.setText("There are no words ending with '" + letter + "' in the list");
                } else {
                    displayLabel.setText(result);
                }
            } else {
                displayLabel.setText("Incorrect input - should be one letter only");
            }
            clearInputAndGainFocus();
        });

        findWord.addActionListener(e -> {
            //get the string from the input
            String word = input.getText();
            //if the input is empty
            if (word.isEmpty()) {
                //display the total number of the words in the linked list
                displayLabel.setText("Total number of the words in the list is " + wordList.size());
            } else {
                int count = 0;
                //init list of the positions to be displayed
                List<Integer> positions = new ArrayList<>();
                //for each entry in the list
                for (int i = 0; i < wordList.size(); i++) {
                    String s = wordList.get(i);
                    if (s.equals(word)) {
                        count++;
                        positions.add(i);
                    }
                }
                //if no word is found
                if (count == 0) {
                    displayLabel.setText("'" + word + "' is not found in the list");
                    //else
                } else {
                    displayLabel.setText(count + " occurrences of the '" + word + "' at positions " + positions);
                }
            }
            clearInputAndGainFocus();
        });

        removeLast.addActionListener(e -> {
            //get the string from the input
            String word = input.getText();
            if (wordList.removeLastOccurrence(word)) {
                displayLabel.setText("Last occurrence of ‘" + word + "’ has been removed from the list");
            } else {
                displayLabel.setText("'" + word + "' was not removed!");
            }
            clearInputAndGainFocus();
        });

        removeAll.addActionListener(e -> {
            String word = input.getText();
            if (wordList.removeAll(Collections.singleton(word))) {
                displayLabel.setText("All occurrences of the '" + word + "' has been removed from the list");
            } else {
                displayLabel.setText("No word is removed from the list");
                clearInputAndGainFocus();
            }
        });

        clearList.addActionListener(e -> {
            wordList.clear();
            displayLabel.setText("Linked list is emptied");
            clearInputAndGainFocus();
        });

        mainFrame.setVisible(true);
    }

    private void clearInputAndGainFocus() {
        input.setText("");
        input.requestFocus();
    }
}
