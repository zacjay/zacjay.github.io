class bubble
{
	void sort(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	void print(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		bubble ob=new bubble();
		int arr[]={64,34,25,12};
		ob.sort(arr);
		System.out.println("sorted array");
		ob.print(arr);
	}
}

