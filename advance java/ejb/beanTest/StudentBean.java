

package beanpack;

import java.sql.*;

public class StudentBean
{
	String name,rollno;
	int marks;
	String grade;
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{	return(name);
	}
	public void setRollno(String rno)
	{	rollno=rno;
	}
	public String getRollno()
	{	return(rollno);
	}
	public void setMarks(int marks)
	{	this.marks=marks;
	}
	public int getMarks()	
	{	return(marks);
	}
	public void setGrade(String grade)
	{	this.grade=grade;
	}
	public String getGrade()
	{	
		return(grade);
	}
	public boolean register()
	{
		try
		{
			/*Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:mydsn");
                      
                        Connection con = DriverManager.getConnection("Jdbc:Odbc:asd","system","system");*/
Class.forName("oracle.jdbc.driver.OracleDriver");

Connection c =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");

			//PreparedStatement ps=c.prepareStatement("insert into student1 values(?,?,?,?)");
   PreparedStatement ps=c.prepareStatement("insert into student1(marks,name,grade,rollno) values(?,?,?,?)");
			if(marks>=80)
				grade="A";
			else if(marks>=60)
				grade="B";
			else if(marks>=40)
				grade="C";
			else
				grade="D";
			
			/*ps.setString(1,name);
			ps.setString(2,rollno);
			ps.setInt(3,marks);
			ps.setString(4,grade);*/

                        ps.setString(2,name);
			ps.setString(4,rollno);
			ps.setInt(1,marks);
			ps.setString(3,grade);
              
			int s=ps.executeUpdate();
               System.out.println(s);
			return(true);
		}
		catch(Exception e)
		{
                  System.out.println(e);
			e.printStackTrace();
			return(false);	
		}
	}
}

	

		
	