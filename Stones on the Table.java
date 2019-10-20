import java.util.Scanner;
public class EEEE {
    public static void main(String[] args) {
        int s=0;
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        String k=in.nextLine();
        for(int i=0; i<n-1; i++){ if(k.charAt(i)==k.charAt(i+1)) {s++;} }
        System.out.print(s);
    }
}
