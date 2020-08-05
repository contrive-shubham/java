import java.awt.*;
import.java.awt.event.*;
class event extends JFrame implements ActionListener
{
private void BtnPlusActionPerformed(java.awt.event.ActionEvent evt)
{
Float x,y,z;
x=Float.parseFloat(TxtNum1.getText());
y=Float.parseFloat(TxtNum2.getText());
z=x+y;
TxtResult.setText(""+z);
}
private void BtnMinusActionPerformed(java.awt.event.ActionEvent evt)
{
Float x,y,z;
x=Float.parseFloat(TxtNum1.getText());
y=Float.parseFloat(TxtNum2.getText());
z=x-y;
TxtResult.setText(""+z);
}
private void BtnMulActionPerformed(java.awt.event.ActionEvent evt)
{
Float x,y,z;
x=Float.parseFloat(TxtNum1.getText());
y=Float.parseFloat(TxtNum2.getText());
z=x*y;
TxtResult.setText(""+z);
}
private void BtnDivActionPerformed(java.awt.event.ActionEvent evt)
{
Float x,y,z;
x=Float.parseFloat(TxtNum1.getText());
y=Float.parseFloat(TxtNum2.getText());
z=x/y;
TxtResult.setText(""+z);
}
private void BtnclearActionPerformed(java.awt.event.ActionEvent evt)
TxtNum1.setText("");
TxtNum2.setText("");
TxtResult.setText("");
}
private void BtnOffActionPerformed(java.awt.event.ActionEvent evt)
{
System.exit(0);
}
