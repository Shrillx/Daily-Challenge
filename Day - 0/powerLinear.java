import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();
        System.out.println(powerLinear(x,n));
    }
    public static int powerLinear (int x, int n )
    {
        if(n==0)return 1; 
        return x* powerLinear(x,n-1);
    }
}
