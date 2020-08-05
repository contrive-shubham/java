import java.awt.*;
import java.awt.event.*;
class myframe3 extends Frame
{
public static void main(String...s)
{
myframe3 f=new myframe3();
f.setTitle("my second frame");
f.setSize(300,400);
f.setVisible(true);
f.addWindowListener(new myclass1());
}
public static class myclass1 extends WindowAdapter
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
}}




