
import java.util.*;
public class Leaders_Array {
    static List<Integer> leaders(int arr[]) {
        // code here
        
        int n = arr.length;
        
        int maxright = arr[n-1];
        ArrayList<Integer> li = new ArrayList<>();
        li.add(maxright);
        
        for(int i = n-2; i>=0;i--){
            
            if(maxright <=arr[i]){
                maxright = arr[i];
                
                li.add(arr[i]);
            }
        }
        Collections.reverse(li);
        return li;
        
    }
}
