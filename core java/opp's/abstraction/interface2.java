//interface can extends interface
interface my1
{ void show();
}
interface my extends my1
{ void disp();
}
class child implements my
{ public void show()
{ System.out.println("child show");
}
public void disp()
{ System.out.println("child display");
}
public static void main(String...s)
{ child c=new child();
c.show();
c.disp();
}
}