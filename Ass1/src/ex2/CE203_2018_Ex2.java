package ex2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CE203_2018_Ex2 extends JFrame {
    public int width = 500;
    public int height = 400;

    public ArrayList<String> words = new ArrayList<>();
    private JPanel jPanelTop;
    private JPanel jPanelCenter;
    private JPanel jPanelBottom;
    public JTextField enterWordInTextField;
    public JLabel displayInformation;
    public JButton jButtonAdd;
    public JButton jButtonDisplayAllWords;
    public JButton jButtonSearch;
    public JButton jButtonRemove;
    public JButton jButtonRemoveAll;
    public JButton jButtonClear;


    public CE203_2018_Ex2(){
        setSize(width,height);
        jPanelTop = new JPanel(new GridLayout(2,3));
        jPanelCenter = new JPanel(new GridLayout());
        jPanelBottom = new JPanel();

        jButtonAdd = new JButton("Add");
        jButtonDisplayAllWords = new JButton("FindWordLastLetter");
        jButtonSearch = new JButton("Search");
        jButtonRemove = new JButton("RemoveLast");
        jButtonRemoveAll = new JButton("RemoveAll");
        jButtonClear = new JButton("Clear List");

        add(jPanelTop,BorderLayout.NORTH);
        jPanelTop.add(jButtonAdd);
        jPanelTop.add(jButtonDisplayAllWords);
        jPanelTop.add(jButtonSearch);
        jPanelTop.add(jButtonRemove);
        jPanelTop.add(jButtonRemoveAll);
        jPanelTop.add(jButtonClear);

        jButtonAdd.addActionListener(new ButtonHandler(this,1));
        jButtonDisplayAllWords.addActionListener(new ButtonHandler(this, 2));
        jButtonSearch.addActionListener(new ButtonHandler(this,3));
        jButtonRemove.addActionListener(new ButtonHandler(this,4));
        jButtonRemoveAll.addActionListener(new ButtonHandler(this, 5));
        jButtonClear.addActionListener(new ButtonHandler(this,6));

        displayInformation = new JLabel("",SwingConstants.CENTER);
        add(jPanelCenter,BorderLayout.CENTER);
        jPanelCenter.add(displayInformation,BorderLayout.CENTER);


        enterWordInTextField = new JTextField(10);
        add(jPanelBottom, BorderLayout.SOUTH);
        jPanelBottom.add(enterWordInTextField);

    }

}
