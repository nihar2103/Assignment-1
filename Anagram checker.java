import java.util.*;
public class Main{
    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";
        if(str1.length()==str2.length()){
            char ch1[] = str1.toCharArray();
            char ch2[] = str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            boolean result = Arrays.equals(ch1,ch2);
            if(result){
                System.out.println("true");
            }
            else{
                System.out.println("flase");
            }
        }
        else{
            System.out.println("flase");
        }
    }
}
