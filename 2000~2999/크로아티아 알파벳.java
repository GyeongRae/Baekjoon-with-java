import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        String cro[] = {"c=", "c-", "dz=", "d-", "lj", "nj","s=", "z="};
        
        String alph = in.next();
        
        
        for(int i=0;i<cro.length;i++) {      
        	alph = alph.replace(cro[i], "a");        	
        }
        
        System.out.println(alph.length());
        
    }
}
