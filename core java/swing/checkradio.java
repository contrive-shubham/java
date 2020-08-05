import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class CheckRadio extends JFrame implements ActionListener
{
JCheckBox cb1,cb2;
JRadioButton rb1,rb2;
JTextArea ta;
ButtonGroup bg;
String msg="";
CheckRadio()
{
Container c=getContentPane();
c.setLayout(new FlowLayout());
ta=new JTextArea(10,20);
cb1=new JCheckBox("java",true);
cb2=new JCheckBox("j2ee");
rb1=new JRadioButton("male",true);
rb2=new JRadioButton("female");
bg=new ButtonGroup();
bg.add(rb1);
bg.add(rb2);
c.add(cb1);
c.add(cb2);
c.add(rb1);
c.add(rb2);
c.add(ta);
cb1.addActionListener(this);
cb2.addActionListener(this);
rb1.addActionListener(this);
rb2.addActionListener(this);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae)
{
if(cb1.getModel().isSelected())
{
System.out.println(cb1.getModel().isSelected());
msg+="\njava";
}
if(cb2.getModel().isSelected())
{
System.out.println(cb2.getModel().isSelected());
msg+="\nj2ee";
}
if(rb1.getModel().isSelected())
msg+="\nmale";
else
msg+="\nfemale";
ta.setText(msg);
msg="";
}
public static void main(String args[])
{
CheckRadio cr=new CheckRadio();
cr.setTitle("My checkboxes are radiobutton");
cr.setSize(500,500);
cr.setVisible(true);
}}