import java.util.Scanner;
public class Assignment8 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Have you completed your masters? y/n");
        char msc = input.next().charAt(0);
        System.out.println("Are you fluent in English? y/n");
        char eng = input.next().charAt(0);
        
        if(msc=='y' && eng=='y'){
            System.out.println("you're eligible for the job interview.");
        }
        else{
            System.out.println("Sorry, You're not eligible for the job interview.");
        }
    }
}
