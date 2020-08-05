import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class jcomboboxdemo extends JFrame implements ItemListener
{
//vars
JComboBox box;
JLabel lbl;
jcomboboxdemo()
{
Container c=getContentPane();
c.setLayout(null);
box=new JComboBox();

// add item to it

box.addItem("India");
box.addItem("France");
box.addItem("America");
box.addItem("Germany");
box.addItem("Paris");

//set location of combo box
box.setBounds(100,50,100,40);

//add combo box to the ComboBox
c.add(box);
lbl=new JLabel();
lbl.setBounds(100,200,200,40);

c.add(lbl);
// attach itemlistener to the combo box
box.addItemListener(this);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void itemStateChanged(ItemEvent ie)
{
//know which item is selected
String str=(String)box.getSelectedItem();
// display the selected item in label
lbl.setText("Your item is selectes :"+str);
}
public static void main(String args[])
{
jcomboboxdemo demo=new jcomboboxdemo();
demo.setTitle("My combobox");
demo.setSize(500,400);
demo.setVisible(true);
}
}