import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();

       for(int i = 0; i < c; i++)
       {

           int studentNum = sc.nextInt();
           int[] snl = new int[studentNum];
           int result = 0;
           int count = 0;
           for(int j = 0; j< studentNum; j++)
           {
               snl[j] = sc.nextInt();
               result += snl[j];

           }


           for(int k = 0; k<studentNum; k++)
           {


               if(snl[k] > result / studentNum)
               {

                   count += 1;
               }
           }

           double finalResult =  ((double)count / (double)studentNum) * 100;

           System.out.printf("%.3f", finalResult);
           System.out.println("%");

        }
       sc.close();
}
    }
