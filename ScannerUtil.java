import java.util.Scanner;

public class ScannerUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter please an Integer value (2 value): ");

        int a = scanner.nextInt();

        int tmp1 = a / 3;
        int tmp1_ = a % 3;

        int tmp2 = tmp1 / 3;
        int tmp2_ = tmp1 % 3;

        int tmp3 = tmp2 / 3;
        int tmp3_ = tmp2 % 3;

        int tmp4 = tmp3 / 3;
        int tmp4_ = tmp3 % 3;

        int tmp5 = tmp4 / 3;
        int tmp5_ = tmp4 % 3;

        System.out.println("Your number converted in Base3-system is: " + tmp5_ + tmp4_ + tmp3_ + tmp2_ + tmp1_);

        scanner.close();

    }

}
