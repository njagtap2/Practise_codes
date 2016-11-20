import java.util.Scanner;

public class MaxTimeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] input = new int[4];
int h1=-1, h2=-1,m1=-1,m2=-1;
int[] b = new int [10];

for(int j=0;j<10;j++)
{
   b[j]=0;
}
System.out.println("Enter 4 numbers");
Scanner scan = new Scanner(System.in);
for(int i =0;i<4;i++)
{
	input[i]= scan.nextInt();
	b[input[i]]+=1;
}

if(b[2]>0)
{
h1=2;
b[2]--;
for(int j=3;j>=0;j--)
{ if(b[j]>0)
{
    h2=j;
    b[j]--;
     break;
     }
}

for(int j=5;j>=0;j--)
{ if(b[j]>0)
{
   m1=j;
   b[j]--;
   break;
}
}

for(int j=9;j>=0;j--)
{ if(b[j]>0)
{
   m2=j;
   b[j]--;
   break;
}
}
}
else
{
	for(int j=1;j>=0;j--)
	{     if(b[j]>0)
	           {
				h1=j;
				b[j]--;
				break;
				}
	}
	
	for(int j=9;j>=0;j--)
	{    if(b[j]>0)
	    {
		    h2=j;
		    b[j]--;
		    break;
	    }
	     
	}
	for(int j=5;j>=0;j--)
	{       
	if(b[j]>0)
    {
		m1=j;
		b[j]--;
		break;
	}
	}
	for(int j=9;j>=0;j--)
	{ if(b[j]>0)
    {
	   m2=j;
	   b[j]--;
	   break;
	}
	}
}	
if(h1==-1 ||h2==-1||m1==-1||m2==-1)
{
	System.out.println("Maximum Time Not Possible");}
else
	System.out.println(h1+""+h2+":"+m1+""+m2);
	}

}

