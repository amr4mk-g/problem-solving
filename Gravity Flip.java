import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] x=new int[n];
        for(int i=0;i<n;i++){
            x[i]=in.nextInt();
        }
        Arrays.sort(x);
        for(int i=0;i<n;i++){
            System.out.print(x[i]+" ");
        }
    }
}