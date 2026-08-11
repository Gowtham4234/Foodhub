public class EquilibriumArray {
    
    public static void main(String[] args) {
        
        int arr[] = {-7, 1, 5, 2, -4, 3, 0};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            
            int left =0, right = 0;

            for(int j =0;j<i;j++) left += arr[j];

            for(int k = i+1; k<n;k++) right +=arr[k];

            if( left == right){
                System.out.println(i);
                // break;
            }
        }
    }
}
