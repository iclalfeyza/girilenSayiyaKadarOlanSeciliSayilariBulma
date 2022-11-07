import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz:");
        k = input.nextInt();


        int i = 1;
        while (i <= k) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                System.out.println(i);
            }
            i++;
        }

        /*
        for (int i = 1; i <= k; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                System.out.println(i);
            }
        }
        */
    }
}
