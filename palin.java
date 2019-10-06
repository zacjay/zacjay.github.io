import java.util.Scanner;
class palin
{
	public static void main(String args[])
	{
		System.out.println("Enter an number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p=0;
        int temp=n;
        while(n != 0)
      	{
          int r=n%10;
          p=p*10+r;
          n = n/10;
      	}
      	if(p==temp)
      	{
      		System.out.println("number is palindrome");
      	}
      	else
      	{
      		System.out.println("number is not palindrome");
      	}
	}
}