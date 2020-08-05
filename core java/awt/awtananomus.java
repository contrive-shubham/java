import java.awt.*;
import java.awt.event.*;
class MyFrame4 extends Frame
{
public static void main(String args[])
{
MyFrame4 f=new MyFrame4();
f.setTitle("MY AWT FRAME");
f.setSize(400,400);
f.setVisible(true);
f.addwindowListener(new windowAdapter()
{
public void windowClosing(WindowEvent e)
{System.exist(0);
}
});
}
}