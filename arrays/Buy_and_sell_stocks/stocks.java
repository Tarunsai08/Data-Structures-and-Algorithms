public class stocks
{
	public static void main(String args[])
	{
		int arr[] = {7,1,5,3,6,4};
		int buyingPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(buyingPrice < arr[i])
			{
				int profit = arr[i] - buyingPrice;
				maxProfit = Math.max(maxProfit,profit);	
			}
			else
				buyingPrice = arr[i];
		}
		System.out.println(maxProfit);
	}
}