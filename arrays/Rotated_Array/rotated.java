import java.util.Scanner;

public class rotated
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of elements in the array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the rotated array : ");
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		System.out.print("Enter the target element to be searched : ");
		int target = sc.nextInt();
		
		int left = 0;
		int right = n - 1;
		while(left<=right)
		{
			int mid = (left + right)/2;
			if(arr[mid]==target)	
			{
				System.out.println("Target found at " + mid);
				return;
			}
			else if(arr[left] < arr[mid])
			{
				if(arr[left] <= target && target <= arr[mid])
					right = mid - 1;
				else 
					left = mid + 1;
			}
			else
			{
				if(arr[mid]<=target && target<=arr[right])
					left = mid+1;
				else
					right = mid-1;
			}
		}
		System.out.println("Target not found");
	}
}