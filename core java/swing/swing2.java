import  javax.swing.*;
class FrameDemo1 extends JFrame
{
public static void main(String args[])
{
FrameDemo1 obj=new FrameDemo1();
obj.setTitle("My swing frame");
obj.setSize(400,400);
obj.setVisible(true);
obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}