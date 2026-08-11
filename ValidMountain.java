public class ValidMountain {
    
        public boolean validMountainArray(int[] arr) {
        
        int n = arr.length;

        int climb =0;
        while(climb<n-1 && arr[climb]<arr[climb+1]){
            climb+=1;
        }

        if(climb==0 || climb== n-1){
            return false;
        }

        while(climb<n-1 && arr[climb]>arr[climb+1]){
            climb+=1;
        }

        if(climb == n-1){
            return true;
        }
        else{
            return false;
        }
    }
}
