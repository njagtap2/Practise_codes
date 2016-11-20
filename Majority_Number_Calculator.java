/*Given an array, calculate a majority element in that array. If there is no majority number in array return "No majority number in given array".
A number is called majority Number if it occur in array more than N/2 times (N is a length of an array).*/

import java.io.File;
import java.util.Scanner;
public class Majority_Number_Calculator {

	/**
	 * @author -NEHA JAGTAP
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("Enter the Size of the array");
int size = scan.nextInt();
int candidate =0;
int[] input = new int[size];
System.out.println("Enter elements of the array");
for(int i=0;i<size;i++)
{
	input[i]=scan.nextInt();
}
candidate= findMajorityElement(input);
if (ifMajorityElement(input,candidate)==true)
{
	System.out.println(candidate+" "+"is a majority element in given array");
}
else
	System.out.println("No majority element in given array");
}
//This method finds a potential majority number	
public static int findMajorityElement(int a[])
{
	int count =1;
	int majorityCount=0;
	int number=a[0];
	for(int i =1;i<a.length;i++)
	{
		if(a[i]==a[majorityCount])
		{
			count++;
		}
		else
			count--;
		
		if(count==0)
		{
			majorityCount=i;
			count=1;
		}
	}
	
	return a[majorityCount];
}
//This methods check if the potential majority number is actually present more than N/2 times in array.
public static boolean ifMajorityElement(int a[], int candidate)
{ int  count=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==candidate)
		{count++;}
	}
	if(count>=(a.length/2))
		return true;
	else return false;
}
}
