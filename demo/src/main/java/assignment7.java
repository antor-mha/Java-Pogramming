import java.util.Scanner;
public class assignment7 {
    public static void main(String[] args)
    {
        char ch;
        System.out.println("Do you love java?");
        System.out.println("if you love java then use y/Y");
        System.out.println("if not then n/N");
        Scanner input = new Scanner( System.in);
        ch = input.next().charAt(0);
        if (ch=='y' || ch=='Y') {
            System.out.println("You are a java lover.");
        }
        else if (ch=='n' || ch=='N') {
            System.out.println("You are not a java lover.");
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
