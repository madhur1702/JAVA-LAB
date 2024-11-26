import java.util.*;
class Array
{
    public static void main (String[] args) {
        int a[]=new int[5];
        int i,num;
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter any 5 elements of array a:");
        for (i=0;i<5;i++)
        {
            System.out.println("Enter any number");
             num = Scan.nextInt();
            a[i]=num;
        }
        System.out.println("Display");
        for(i=0;i<5;i++)
        {
            System.out.print(" "+a[i]);
        }
    }
}
