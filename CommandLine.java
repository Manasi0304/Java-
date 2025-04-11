public class CommandLine
{
  public static void main(String [] args)
{
  int sum=0;
  int i;
 System.out.println("input numbers are:");
  for(int c=0;c<args.length;c++)
{
   i=Integer.parseInt(args[c]);
  
   System.out.println(i);
   sum+=i;
}
  System.out.println("Addition of given input number is:"+sum);
}

}