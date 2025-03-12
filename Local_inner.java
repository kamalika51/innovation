class Local_inner
{
void display()
{
class local
{
void show()
{
System.out.println("Local_Inner class Method");
}
}
local L = new local();
L.show();
}

public static void main(String args[])
{
Local_inner Lo = new Local_inner();
Lo.display();
}
}