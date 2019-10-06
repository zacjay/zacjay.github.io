import java.io.*;
class palstring
{
	public static void main(String args[])throws IOException
	{
		System.out.println("Enter String");
		DataInputStream ob=new DataInputStream(System.in);
  		String x=ob.readLine();
  		char y[]=x.toCharArray();
  		int size=y.length;
  		char a[]=new char[size];
  		int i=0;
  		while(i!=size)
  		{
  			a[size-1-i]=y[i];
  			i++;
  		}
  		i=0;
  		while(i!=size)
  		{
  			if(a[i]!=y[i])
  			{
  				System.out.println("Not Palindrom");
  				System.exit(0);
  			}
  			else
  			{
  				i++;
  			}
  		}
  		System.out.println("Palindrom");
	}
}