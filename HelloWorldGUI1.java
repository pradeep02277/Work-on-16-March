package pradeep;

import java.awt.*;
import java.awt.event.*;

public class HelloWorldGUI1 extends Frame implements ActionListener {
private Label lableblCount;
private TextField textCount;
private Button buttonCount;
private int count = 0;

public HelloWorldGUI1() {
setLayout(new FlowLayout());

lableblCount = new Label("");
add(lableblCount);

textCount = new TextField(count + "", 10);
textCount.setEditable(false);
add(textCount);

buttonCount = new Button("Count");
add(buttonCount);
buttonCount.addActionListener(this);

setSize(250, 100);
setTitle("AWT Counter");
setVisible(true);
}

@Override
public void actionPerformed(ActionEvent evt) {
++count;
textCount.setText(count + "");

}

public static void main(String[] args) {

new HelloWorldGUI1();
}
}

