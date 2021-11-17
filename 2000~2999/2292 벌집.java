import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int count = 1;

            int j = 1;
            for(int i = 1; i < n; j++)
            {
                count ++;

                i = (j * 6) + i;

            }

        System.out.println(count);
    }
}
