/*Day 1
Data Types
*/

import java.util.Scanner;
public class Solution1
{
	public static void main(String []args)
	{
		int i=4;
		double d=4.0;
		String s = "HakerRank ";

		Scanner sc=new Scanner(System.in);
		int j=sc.nextInt();
		double d2=sc.nextDouble();
		sc.nextLine();
		String s1=sc.nextLine();
		System.out.println(i+j);
		System.out.println(d+d2);
		System.out.print(s);
		System.out.println(s1);

		sc.close();
	}
}