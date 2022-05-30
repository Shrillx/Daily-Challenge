import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        incdec(x);
    }
    public static void incdec (int x )
    {
       System.out.println(x);
        if(x > 1)
        incdec(x-1);
    System.out.println(x);
    }
}
