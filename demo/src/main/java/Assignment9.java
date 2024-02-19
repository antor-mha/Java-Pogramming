import java.util.Scanner;
public class Assignment9 {
    public static void main(String[] args){
        System.out.println("CALL CENTER");
        Scanner input = new Scanner(System.in);
        int opt;
        System.out.println("Insert option between (1-3)");
        opt =input.nextInt();
        switch (opt) {
            case 1:
                System.out.println("Selected language is Bengali.");
                break;
            case 2:
                System.out.println("Selected language is Hindi.");
                break;
            case 3:
                System.out.println("Selected language is Urdu.");
                break;
            default:
                System.out.println("Selected language is English.");
                break;
        }
    }
}
