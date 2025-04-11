import java.util.* ;
class  
{
    public static void main( String args[])
     {
        int i ;
        int a[]=new int[10] ;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter 10 numbers:");
        for (i=0;i<=9;i++)
        {
              a[i]=sc.nextInt();
        }
        System.out.println("numbers are:");
        for (i=0;i<=9;i++)
        {
               System.out.println(a[i]);
        }
     }
}
