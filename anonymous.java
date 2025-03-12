

public class anonymous 
{
public static void main(String[] args) 
{
Runnable runnable = new Runnable() {
@Override
public void run()
{
System.out.println("Running in an anonymous inner class!");
}
}
Thread thread = new Thread(runnable);
thread.start();
}
}
