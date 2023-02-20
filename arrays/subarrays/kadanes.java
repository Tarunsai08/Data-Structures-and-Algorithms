public class kadanes
{
	public static void main(String args[])
	{
		int arr[] = {1,-2,6,-1,3};
		//in the kadane's algorithm negative is considered as zero 
		int maxSum = 0;
		int currSum = 0;
		for(int i=0;i<arr.length;i++)
		{
			currSum += arr[i];
			if(currSum<0)
				currSum = 0;
			if(maxSum<currSum)
				maxSum = currSum;
		}
		System.out.println(maxSum);
	}
}