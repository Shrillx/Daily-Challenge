import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner (System.in);

        int n = scan.nextInt();

        ArrayList<String> ans = getStairPaths(n);
        System.out.println(ans);
    }

    public static ArrayList<String> getStairPaths(int n) {
        
        if(n == 0)
        {
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base;
        }

        ArrayList<String> myPath = new ArrayList<String>(); 
        //step 1
        if(n >=1 )
        {
            ArrayList<String> firstStep = getStairPaths(n-1);
            for(String path: firstStep)
            {
                myPath.add('1'+path);
            }
        }

        // setep 2
        if(n >=2 )
        {
            ArrayList<String> second = getStairPaths(n-2);
            for(String path: second)
            {
                myPath.add('2'+path);
            }
        }
        
        // 3 step 
        if(n >=3)
        {
            ArrayList<String> third = getStairPaths(n-3);
            for(String path: third)
            {
                myPath.add('3'+path);
            }
        }

        return myPath;     
    }
}
