import java.util.*;
public class anagramsEfficient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String 1 :");
		String s = scan.next();
		System.out.println("Enter String 2 :");
		String t = scan.next();
		if(ifAnagram(s,t))
		{System.out.println("Strings are Anagrams of each other");}
		else System.out.println("Strings are not anagrams of each other");
	}
public static boolean ifAnagram(String a, String b)
{
int[] stringArray = new int[127];
char[] aArray = a.toCharArray();
for(char i :aArray )
{ stringArray[i] =1;
}
for(int i=0;i<b.length();i++)
{
	if(stringArray[b.charAt(i)]==0)
		return false;
}
 return true;

}
}
