import java.util.Scanner;

public class integraltest {
    public static void main(String[] args) {
        Scanner tgb= new Scanner(System.in);
            double a,b;

            System.out.println("Undre gräns?");

            a = tgb.nextDouble();

            System.out.println("Övre gräns?");
            b = tgb.nextDouble();

            System.out.println(integraler.integral(a , b));
    }
}
