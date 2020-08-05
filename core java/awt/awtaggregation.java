import java.awt.*;
import java.awt.event.*;
class MyFrame3 extends Frame
{
public static void main(String args[])
{
MyFrame3 f=new MyFrame3();
f.setTitle("MY AWT FRAME");
f.setSize(400,200);
f.setVisible(true);
f.addwindowListener(new MyClass());
}
}
class MyClass1 extends WindowAdapter
{
public void windowClosing(WindowEvent e)
{System.exist(0);
}
}