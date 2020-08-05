import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class employee extends JFrame implements ActionListener
  { 
    //static Image img;
    JLabel l1,l2,l3,l4,t;
    JTextField t1,t2,t3,t4;
    JButton b1,b2,b3,b4;
    employee()
     { 
       setSize(650,500);
       setVisible(true);
       
     Container c=getContentPane();
      c.setLayout(null);
    Color c1=new Color(101,70,0);
      c.setBackground(c1);
     
       
    Font f=new Font("Serif",Font.BOLD,20);
     Font f1=new Font("Serif",Font.BOLD+Font.ITALIC,28);
    

      t=new JLabel("Employee's Data Form");
      l1=new JLabel("Id");
      l2=new JLabel("Name");
      l3=new JLabel("Address");
      l4=new JLabel("Ph-No:");
      t1=new JTextField();
      t2=new JTextField();
      t3=new JTextField();
      t4=new JTextField();
      b1=new JButton("Insert");
      b2=new JButton("Delete");
      b4=new JButton("Exit");
      b3=new JButton("Update");
  
  l1.setFont(f);
  l2.setFont(f);
  l3.setFont(f);
  l4.setFont(f);
  t.setFont(f1);
  b1.setFont(f);
  b2.setFont(f);
  b3.setFont(f);
  b4.setFont(f);
  

    t.setBounds(200,20,300,40);
    l1.setBounds(150,80,100,30);
    l2.setBounds(150,140,100,30);
    l3.setBounds(150,200,100,30);
    l4.setBounds(150,260,100,30);
    t1.setBounds(240,80,150,30);
    t2.setBounds(240,140,150,30);
    t3.setBounds(240,200,150,30);
    t4.setBounds(240,260,150,30);
    b1.setBounds(160,350,100,30);
    b2.setBounds(280,350,100,30);
    b3.setBounds(400,350,100,30);
    b4.setBounds(520,350,100,30);
    
   t.setForeground(Color.red);
   l1.setForeground(Color.black);
   l2.setForeground(Color.black);  
   l3.setForeground(Color.black);
   l4.setForeground(Color.black);  

  c.add(l1);
  c.add(l2);
  c.add(l3);
  c.add(l4);
  c.add(t1);
  c.add(t2);
  c.add(t3);
  c.add(t4);
  c.add(t);
  c.add(b1);
  c.add(b2);
  c.add(b3);
  c.add(b4);
   
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  b4.addActionListener(this);
    }
  public void actionPerformed(ActionEvent e)
     {
       String str=e.getActionCommand();
       String text1,text2,text3,text4;
       if(str.equals("Insert"))
         {
           text1=t1.getText();
           text2=t2.getText();
           text3=t3.getText();
           text4=t4.getText();

           JOptionPane.showMessageDialog(this,"your Data is inserted"+text1+text2+text3+text4 );
           t1.setText("");
           t2.setText("");
           t3.setText("");
           t4.setText(""); 
            //new ImageButton();
         }
      else if(str.equals("Delete"))
           {
         JOptionPane.showMessageDialog(this,"Your data is deleted");
          t1.setText("");
           t2.setText("");
           t3.setText("");
           t4.setText("");
             //new ImageButton();
           }
      else if(str.equals("Update"))
           {
           text1=t1.getText();
           text2=t2.getText();
           text3=t3.getText();
           text4=t4.getText();

           JOptionPane.showMessageDialog(this,"your Data is updated"+text1+text2+text3+text4 );

           t1.setText("");
           t2.setText("");
           t3.setText("");
           t4.setText("");
           }
    else if(str.equals("Exit"))
           {
             System.exit(0);
           }
         
      
    }

    
          
	
         
     public static void main(String...s)
      {
         new employee();
       }
 }
 
  
   