import java.util.*;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        display(arr,0);
    }
    
    public static void display (int[] arr,int i)
    {
        if(i < arr.length )
        {
            System.out.println(arr[i]);
            display(arr,i+1);
        }
    }
}
