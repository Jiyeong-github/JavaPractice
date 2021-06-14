package getjava;

public class Static2 {
    public static void main(String[] args) {
        double result1 = 10 * 10 * Static.pi;
        int result2 = Static.plus(10, 5);
        int result3 = Static.minus(10, 5);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
