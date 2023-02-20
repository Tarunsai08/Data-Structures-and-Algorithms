import java.util.Scanner;
public class rainwater
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of blocks : ");
		int n = sc.nextInt();

		System.out.print("Enter size of the each bar : ");
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}

		int leftMax[] = new int[n];
		int rightMax[] = new int[n];
		int trappedWater = 0,min;

		leftMax[0] = arr[0];
		for(int i=1;i<n;i++)
		{
			if(leftMax[i-1]<arr[i])
				leftMax[i] = arr[i];
			else
				leftMax[i] = leftMax[i-1];
		}

		rightMax[n-1] = arr[n-1];
		for(int i=n-2;i>=0;i--)
		{
			if(rightMax[i+1]<arr[i])
				rightMax[i] = arr[i];
			else
				rightMax[i] = rightMax[i+1];
		}

		for(int i=0;i<n;i++)
		{
			if(leftMax[i] < rightMax[i])
				min = leftMax[i];
			else 
				min = rightMax[i];
			if(min>arr[i])
				trappedWater += min - arr[i];
		}

		System.out.println(trappedWater);
	}
}
			
		