import java.util.Scanner;

public class UniqueString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = scan.nextLine();
		int flag=0;
		/*This boolean array is of size 126 because numbers from 0-9, 
		 * all alphbets(both lower and upper case),all punctuation marks fit under 126 ascii characters*/  
		boolean[] setValus = new boolean[126];
		
		for(int i=0;i<input.length();i++)
		{
			//Convert char value into ASCII values
			int val = input.charAt(i);
			if(setValus[val])
			{
				flag =1;
				 break;
			}
			setValus[val]=true;
		}
			
		if (flag==1)
		{
			System.out.println("String in not unique");
		}
		else
			System.out.println("String is unique");
		
	}

}
