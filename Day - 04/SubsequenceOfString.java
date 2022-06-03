import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        
        ArrayList<String> ans = gss(str);
        System.out.println(ans);
    }
    
    public static ArrayList<String> gss (String str)
    {
        if(str.length() == 0)
        {
            ArrayList<String> temp =  new ArrayList<>();
            temp.add("");
            return temp;
        }       
        //character
        char ch = str.charAt(0);    
        //rest of the string
        String res = str.substring(1);      
        ArrayList<String> ress = gss(res);
        ArrayList<String> ans =  new ArrayList<>();      
        //not including
        for(String ss : ress)
        {
            ans.add(ss);
        }       
        // including
        for(String ss : ress)
        {
            ans.add(ch+ss);
        }   
        return ans;  
    }
}
