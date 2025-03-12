class Computer
{
private String a = "Monitor";
void display()
{
System.out.println("Display method shows the  "+a);
}


class Processor
{
void show()
{
System.out.println("Processor are processing");
}
}


public static void main(String args[])
{
Computer c =new Computer();
Computer.Processor p = c.new Processor();
c.display();
p.show();
}
}


