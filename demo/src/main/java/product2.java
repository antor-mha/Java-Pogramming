import java.util.Scanner;
public class product2 {
    public static void main(String[] args){
        short id;
        String title;
        double price;
        String description;
        String category;

        Scanner input = new Scanner(System.in);
        System.out.printf("Enter your id:\n");
        id = input.nextShort();
        System.out.printf("Enter the title:\n");
        title = input.next();
        System.out.printf("Enter the price:\n");
        price = input.nextDouble();
        input.nextLine();
        System.out.printf("Enter the description:\n");
        description = input.nextLine();
        System.out.printf("Enter the category:\n");
        category = input.next();

        System.out.printf("id: %s\ntitle: %s\nprice: %.2f\ndescription: %s\ncategory: %s\n",id,title,price,description,category);

    }
}
