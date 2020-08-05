import java.awt.*;
import java.awt.event.*;
class mybutton extends Frame implements ActionListener
{
Button b1,b2,b3;
mybutton()
{
this.setLayout(null);
b1=new Button("Yellow");
b2=new Button("Pink");
b3=new Button("Orange");

b1.setBounds(100,100,80,60);
b2.setBounds(100,160,80,60);
b3.setBounds(100,220,80,60);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
this.add(b1);
this.add(b2);
this.add(b3);


addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
});
}


public void actionPerformed(ActionEvent ae)
{
String str=ae.getActionCommand(); //know the button click
if(str.equals("Yellow"))
//System.out.println(str.equals);
this.setBackground(Color.yellow);
if(str.equals("Pink"))
this.setBackground(Color.pink);
if(str.equals("Orange"))
this.setBackground(Color.orange);
}

public static void main(String args[])
{
mybutton d=new mybutton();
d.setTitle("My Button");
d.setSize(400,600);
d.setVisible(true);
}
}
