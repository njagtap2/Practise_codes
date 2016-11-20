import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * @author NEHA JAGTAP
 *
 */
public class SubsequenceofArray {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
      
		int start=0,end=0;
		int min=0,max=0;
		int s,e;
		//input file has a input array from which we have to find minimum array which we need to sort.
        File fileDir = new File("input.txt");
        ArrayList<Integer> input = new ArrayList<Integer>();
		 Scanner scan = new Scanner(fileDir);
        while( scan.hasNextInt())
        {
        input.add(scan.nextInt());	
        }
        for(int i=0;i<input.size()-1;i++)
        {//checks the lower limit that breaks the sequence
        	if(input.get(i)>input.get(i+1))
        	{
        		start=i;
        		break;
        	}
        }
        for(int i=input.size()-1;i>0;i--)
        {
        	//check the upper limit that breaks the sequence
        	if(input.get(i)<input.get(i-1))
        	{
        		end=i;
        		break;
        	}
        }
        s= start;
        e = end;
        min= input.get(s);
        max= input.get(s);
      //Find the minimum and minimum number in between lower and upper bound of subarray
        for(int i=s; i<e;i++)
        {        
        	if(input.get(i)<input.get(i+1))
        	{
        			if(input.get(i)<=min)
        			{
        				min=input.get(i);
        				start =i;
        			}
        			else if (input.get(i+1)>=max)
        			{
        				max=input.get(i+1);
        				end =i+1;
        			}
        	}
        	else if(input.get(i)>input.get(i+1))
        	{
        			if(input.get(i)>=max)
        			{
        				max=input.get(i);
        				end =i;
        			}
        			if(input.get(i+1)<=min)
        			{
        				min=input.get(i+1);
        				end =i+1;
        			}
        	}
       }
        for(int i=0;i<=start;i++)
        {
        	if(input.get(i)>min)
        	{
        		start =i;
        		break;
        	}
        }
        for (int i =input.size()-1;i>=end;i--)
        {
        	if(input.get(i)<max)
          {
        	  end =i;
        	  break;
	      }
        }
        if(start==end)
        {System.out.println("0");}
        else 
        System.out.println(end+1-start);
	}

}
