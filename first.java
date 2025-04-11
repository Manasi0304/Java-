import java.util.Scanner;
class first
{
           public static void main (String args[])
           {
         	 int n1,n2;
	 String s;
	 Scanner sc= new Scanner(System.in);
        	 System.out.println ("enter 2 number:");
 	 n1=sc.nextInt();
	 n2=sc.nextInt();
	 if(n1>n2)
	{
	     System.out.println ("  greater="+n1);
	}
 	else
	{
	    System.out.println ("greater="+n2);
	 }
         }

}