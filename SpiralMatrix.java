public class SpiralMatrix {
    
    public static void main(String[] args) {
        
        int arr[][] = {
            {1,2,3},
            {4,5,6}, 
            {7,8,9}
        };
        int n = arr.length;

        int rowStart = 0, rowEnd = n-1;
        int colStart = 0, colEnd = n-1;

        while (rowStart<=rowEnd && colStart<=colEnd) {
            
            for(int i= colStart;i<=colEnd;i++){
                System.out.print(arr[rowStart][i]+" ");
            }
            rowStart++;
            for(int i=rowStart;i<=rowEnd;i++){
                System.out.print(arr[i][colEnd]+" ");
            }
            colEnd--;
            for(int i =colEnd;i>=colStart;i--){
                System.out.print(arr[rowEnd][i]+" ");
            }
            rowEnd--;
            for(int i=rowEnd;i>=rowStart;i--){
                System.out.print(arr[i][colStart]+" ");
            }
            colStart++;
        }
    }
}
