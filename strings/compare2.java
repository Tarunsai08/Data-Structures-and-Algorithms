import java.util.Scanner;

public class compare2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two strings : ");
		String str1 = sc.next();
		String str2 = sc.next();
		char hash[] = new char[26];
		char hash2[] = new char[26];
		char matched[] = new char[10];
		char unmatched[] = new char[10];
		int k=0,l=0;
		for(int i=0;i<26;i++)
		{
			hash[i] = '$';
			hash2[i] = '#';
		}
		for(int i=0;i<str1.length();i++)
		{
			int value = str1.charAt(i)-'a';
			if(hash[value]!=str1.charAt(i))
			{
				hash[value] = str1.charAt(i);
			}
		}
		for(int i=0;i<str2.length();i++)
		{
			int value = str2.charAt(i)-'a';
			if(hash2[value]!=str2.charAt(i))
			{
				hash2[value] = str2.charAt(i);
			}
		}
		for(int i=0;i<26;i++)
		{
			if(hash[i]==hash2[i])
			{
				matched[k] = hash[i];
				k++;
			}
			else
			{
				if((hash[i]>='a'&&hash[i]<='z')||(hash[i]>='A'&&hash[i]<='Z'))
				{
					unmatched[l] = hash[i];
					l++;
				}
				if((hash2[i]>='a'&&hash2[i]<='z')||(hash2[i]>='A'&&hash2[i]<='Z'))
				{
					unmatched[l] = hash2[i];
					l++;
				}
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