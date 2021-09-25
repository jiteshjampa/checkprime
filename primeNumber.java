import java.util.Scanner;
import java.lang.*;
public class primeNumber{
public static void prime(int n)
{
int flag=0;
if((n==1)||(n==0))
{
flag=1;
System.out.println("Not prime");
}
else if((n==2)||(n==3))
{
flag=0;
}
else if((n%2==0)||(n%3==0))
{
flag=1;
System.out.println("Notprime");
}
for(int i=5;i*i<=n;i=i+6)
{
if((n%i==0)||(n%(i+2)==0))
{
flag=1;
System.out.println("Notprime");
}
}
if(flag==0)
{
System.out.println("prime");
}
}
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number:");
n=s.nextInt();
prime(n);
}
}