import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int[] b = new int[26];
        for(int i = 0; i < b.length; i++)
        {
            b[i] = -1;
        }

        String s = sc.nextLine();

        for(int i = 0; i <s.length(); i++)
        {
           char ch = s.charAt(i);

           if(b[ch - 'a'] == -1){

                b[ch - 'a'] = i;

           }

        }

        for(int result : b){
            System.out.print(result + " ");
        }
    }
}
