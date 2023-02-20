public class approach1
{
	public static void main(String args[])
	{
		int arr[] = {1,-2,6,-1,3};
		int maxSum=0;
		for(int i=0;i<arr.length;i++)
		{
			int start = i;
			for(int j=i;j<arr.length;j++)
			{
				int end = j;
				int currSum = 0;
				for(int k = start;k<=end;k++)
					currSum += arr[k];
				if(maxSum < currSum)
					maxSum = currSum;
			}
		}
		System.out.println(maxSum);
	}
}