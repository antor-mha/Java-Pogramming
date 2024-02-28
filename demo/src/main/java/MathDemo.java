public class MathDemo {
    public static void main(String[] args){
        int x = 20, y = 10, c= -23;

        int max = Math.max(x, y);
        System.out.println("Max value is: "+max);

        int min = Math.min(x, y);
        System.out.println("Min value is: "+min);

        int absolute = Math.abs(c);
        System.out.println("Absolute value of c is: "+absolute);
    }
}
