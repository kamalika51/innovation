class Battery
{
int capacity;
void display()
{
System.out.print("The capacity of battery");
}
}
class Mobile
{
Battery b;
{
b = new Battery();
b.display();
{
System.out.println("Mobile battery");
}
}
}
public class Main
{
public static void main(String args[])
{
Mobile m = new Mobile();
}
}
