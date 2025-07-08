import java.util.Scanner;
public class MaleFemale {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    String gender =sc.nextLine();
    int age = sc.nextInt();
    if(gender.equalsIgnoreCase("Female")&& age >=1 && age <=58){
        System.out.println("Intrest is : 8.2%");
    }
    else if(gender.equalsIgnoreCase("Female") && age >=59 && age<=100)
    System.out.println("Intrest is : 9.2%");

    else if (gender.equalsIgnoreCase("Male")&& age >=1 && age<=58)
    System.out.println("Intrest is : 8.4");

    else if(gender.equalsIgnoreCase("Male")&& age>=59 && age<=100)
    System.out.println("Intrest is : 10.5");

    else
    System.out.println("Enter The valid gender ");

}
}