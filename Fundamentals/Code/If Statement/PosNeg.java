import java.util.Scanner;
public class PosNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       while(true){
        int num= sc.nextInt();
        if(num>0){
            System.out.println("Positive number");
        }
        else if (num<0)
        {
            System.out.println("Negative number");
        }
    }
}
}
