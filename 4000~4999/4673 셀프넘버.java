public class Main {
    public static void main(String[] args) {
        boolean[] check = new boolean[10001];
        for (int i = 1; i < 10001; i++) {
            int n = selfNum(i);

            if (n < 10001) {
                check[n] = true;
            }
        }

        for (int i = 1; i < 10001; i++)
        {
            if(!check[i]){
                System.out.println(i);
            }
        }
    }
    public static int selfNum(int num){
            int sum = num;

            while(num > 0){
                sum += num % 10;
                num /= 10;
            }
            return sum;
    }


}

