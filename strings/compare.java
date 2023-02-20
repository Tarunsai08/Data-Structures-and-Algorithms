import java.util.Scanner;

public class compare
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string 1:");
		String str1 = sc.next();
		System.out.print("Enter string 2: ");
		String str2 = sc.next();
		char matched[] = new char[10];
		char unmatched[] = new char[10];
		boolean checked;
		int k=0,l=0;
		for(int i=0;i<str1.length();i++)
		{
			checked = false;
			for(int j=0;j<str2.length()&&!checked;j++)
			{
				if(str1.charAt(i)==str2.charAt(j))
				{
					matched[k] = str1.charAt(i);
					checked = true;
					k++;
				}
			}
			if(!checked)
			{
				unmatched[l] = str1.charAt(i);	
				l++;
			}
		}
		for(int i=0;i<str2.length();i++)
		{
			checked = false;
			for(int j=0;j<k&&!checked;j++)
			{
				if(str2.charAt(i)==matched[j])
					checked = true;
			}
			if(!checked)
			{
				unmatched[l] = str2.charAt(i);	
				l++;
			}
		}
		System.out.print("matched:");
		for(int i=0;i<k;i++)
		{
			System.out.print(matched[i]);
		}
		System.out.println();
		System.out.print("unmatched:");
		for(int i=0;i<l;i++)
		{
			System.out.print(unmatched[i]);
		}
	}
}