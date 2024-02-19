import java.util.Scanner;
public class Triangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double base,height,area;
        System.out.printf("Enter the base: \n");
        base = input.nextDouble();
        System.out.printf("Enter the height: \n");
        height = input.nextDouble();

        area = 0.5 * (base * height);
        System.out.println("The area of the triangle: "+area);
    }
}
