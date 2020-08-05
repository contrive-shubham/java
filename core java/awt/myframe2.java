import java.awt.*;
import java.awt.event.*;
class myframe2 extends Frame
{
public static void main(String...s)
{
myframe2 f=new myframe2();
f.setTitle("my first frame");
f.setSize(400,600);
f.setVisible(true);
f.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
});
}
}