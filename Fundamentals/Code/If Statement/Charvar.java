import java.util.Scanner;
public class Charvar {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        char a= sc.next().charAt(0);
        if(a>='A'&& a<='Z' || a>='a'&& a<='z'){
            System.out.println("Alphabet");
        }
        else if(a>='0' && a<='9'){
        System.out.println("Digit");
        }
        else{
        System.out.println("Special Character");
        }
        
        
    }
}
