<h1> CE203 ASSIGNMENT 1 2018</h1>
<h2> Exercise 1</h2>
 <p>A colour may be specified by its RGB value – the amount of red, green and blue it
contains. These amounts are integers between 0 and 255. For example, red is
represented by (255, 0, 0), blue by (0, 0, 255) and yellow (which is made up from
red and green) by (255, 255, 0). White is (255, 255, 255) and black is (0, 0, 0). The
Color class has a constructor with 3 arguments that allows a user to create a
Color object by providing the RGB values.</p>
<p>
Write, in a file called CE203_2018_Ex1.java, a frame-based application that
allows the user to specify RGB values in three text fields, and, when a button is
pressed, displays your registration number in the chosen colour. The button and the
input fields should be placed at the bottom of the frame, and the text should be
written on a panel positioned at the centre (on both the horizontal and vertical
axis). The program should contain the following features:</p>
<ol type="a">
  <li>The application should initially display the following welcome message (in
blue) on the centre panel: “CE203 Assignment 1, submitted by: “(this should be
followed by your registration number).</li>
<li>If, when the button is pressed, the content of any of the text fields is not an
integer, the invalid field(s) should be cleared and an appropriate message
should appear on the centre panel; text fields containing integers should,
however, never be cleared.</li>
<li>If any of the text fields contain a value less than 0, the value 200 should be used
in its place when generating the colour – the displayed value in the text field
should also be changed to 200. Similarly, if any of the fields contains a number
greater than 255, the value 255 should be used and displayed.</li>
<li>Add a “Reset” button at the top of the application which, if pressed, will result
in all text fields being emptied and the initial welcome message being
displayed.</li>
<li>Any possible exceptions should be captured by the program.</li>
</ol>


<h1>CE203 ASSIGNMENT 1 2018</h1>
<h2>Exercise 2</h2>
<p>
Write, in a file called CE203_2018_Ex2.java, a frame-based application that
allows the user to store a list of words. The layout should be such that any buttons
will be displayed at the top of the panel, user input is provided in a text field at the
bottom and any system output will be displayed in the centre. The application
should provide features and corresponding buttons that allow the user to</p>

<ol type="a">
  <li>add a word to the list (the word to be added is provided in a text field at the
bottom of the application).</li>
  <li>display all of the words from the list that end with a specified letter (this
method should be case-insensitive, e.g. no matter whether the user input is 'A'
or ‘a’, all words ending with 'a' should be displayed)</li>
  <li>search the list for a word (that is provided in the text field) and display how
many times it is found and the positions in the list in which it is found; if
however the text field is empty when this button is pressed, then the system
should display the total number of all words in the list (together with an
appropriate message)</li>
  <li>remove from the list the last occurrence of a word</li>
  <li>remove from the list all occurrences of a word</li>
  <li>clear the list</li>
</ol>
<p>
The list may contain duplicate entries. Words may contain only letters, numbers,
and hyphens (-) and must begin with a letter.<br>

For each action specified above an appropriate message should be displayed on the
centre panel confirming the action, e.g. <br>

<em>“Word ‘toast’ has been added to the list”.</em><br>

An appropriate error message should be displayed if any of the actions failed, e.g.<br>
“The string ‘12’ was not added to the list as it is not a valid word.”<br>
The list should be implemented using a LinkedList.<br>
You should aim to make your user interface easy to use.</p>
