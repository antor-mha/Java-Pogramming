import java.util.Scanner;
public class Assignment4 {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)){
            int phonePrice = 1800;
            int numberOfInstallment, installmentPerMonth;
            System.out.print("Number of Installments?");
            numberOfInstallment = input.nextInt();

            installmentPerMonth = phonePrice / numberOfInstallment;

            System.out.println("Monthly installment Amount: "+installmentPerMonth);

        }
    }
}
