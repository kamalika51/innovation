import java.util.Scanner;
public class Sum_of_even
{
public static void main(String args[])
{
Scanner obj = new Scanner(System.in);
System.out.println("Enter the number for sum:");
int n = obj.nextInt();
int sum=0;
for(int i=2; i<=n; i +=2)
{
sum+=i;
}
System.out.println("the sum of the even number are:"+sum);
obj.close();
}
}
