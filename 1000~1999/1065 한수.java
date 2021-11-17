import java.util.Scanner;

public class Main {

    static int count = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.close();
        for (int i = 1; i <= num; i++) {

            if (i < 100)
            {
                count++;
            }
            else
            {
                han(i);
        }

    }
        System.out.println(count);



    }
    public static void han(int n){
        int[] han = new int[3];
        han[0] = n % 10;
        han[1] = (n % 100) / 10;
        han[2] = n / 100;
        if((han[1] - han[0]) == han[2] - han[1])
        {
            count++;
        }
    }

}
