import java.util.Scanner;
public class oddeven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
        int val=sc.nextInt();
        
         if(val%2==0)
         {
            System.out.println("Even Number");
         }
         else if(val%2!=0)
         {
            System.out.println("Odd Number");
         }
    }
}
}
