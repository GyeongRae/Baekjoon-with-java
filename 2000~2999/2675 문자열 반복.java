import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int tc = sc.nextInt();

            for(int i = 0; i < tc; i++)
            {

                int rc = sc.nextInt();
                String text = sc.next();

                for(int j = 0; j < text.length(); j++)
                {
                    for(int k = 0; k < rc; k++) {

                        System.out.print(text.charAt(j));
                    }
                }
                System.out.println();
            }
    }
}
