import java.awt.*;
import java.awt.event.*;
class Event extends Frame implements ActionListener
{
TextField tf;
Event()
{
tf=new TextField();
tf.setBounds(60,50,170,20);
Button b=new Button("Click me");
b.setBounds(100,120,80,30);
b.addActionListener(this);

add(tf);
add(b);
setSize(300,400);
setLayout(null);
setVisible(true);
}
public void WindowClosing(WindowEvent a)
{
System.exit(0);
}

public void actionPerformed(ActionEvent e)
{
tf.setText("Happy Valentines Day");
}
public static void main(String args[])
{
new Event();
}
}