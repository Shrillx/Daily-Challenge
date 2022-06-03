import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int source = scan.nextInt();
        int desti = scan.nextInt();
        int helper = scan.nextInt();

        toh(n,source,desti,helper);
    }

    public static void toh(int n, int source, int desti, int helper){
        if(n == 0)return;

        toh(n-1,source,helper,desti);
        System.out.println(n+"["+source+" -> "+ desti+"]");
        toh(n-1,helper,desti,source);

    }

}
