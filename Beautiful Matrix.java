import java.util.Scanner;
public class EEEE {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int k=0, h=0;
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                int c=in.nextInt();
                if(c==1) {k=i; h=j;} }
        }
        int y=Math.abs(k-2)+Math.abs(h-2);
        System.out.print(y);
    }
}
