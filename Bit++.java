import java.util.Scanner;
public class EEEE {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        int x=0;
        for(int i=0; i<n; i++){
            String x2=in.nextLine();
            if(x2.contains("+")) {x++;} else {x--;}
        }
        System.out.print(x);
    }
}
