import java.util.Scanner;
public class assignment5{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the age of a person:");
        int age = input.nextInt();
        if (age == 18 || age>18) {
            System.out.println("Voter");
        }
        else{
            System.out.println("Invalid voter");
        }
    }
}