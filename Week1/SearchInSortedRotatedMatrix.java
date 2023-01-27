package Week1;

public class SearchInSortedRotatedMatrix {
    public static void main(String[] args) {
      int arr[][] = {{1,2,3},{4,5,6}};
        System.out.println(searchMatrix(arr,3));
    }


    public static boolean searchMatrix(int[][] matrix, int k) {
        int n = matrix.length;
        int m1 = matrix[0].length;
        int s=0,e=n-1;

        while(s<=e){
            int m = (s+e)/2;

            if(k < matrix[m][0]){
                e = m-1;
            }
            else if(k > matrix[m][m1-1]){

                s = m+1;
            }
            else{
                return bs(m,matrix,k);
            }


        }

        return false;
    }
    public static boolean bs(int midInd, int matrix[][],int k){

        int start =0, end=matrix[0].length-1;
        int mid;
        while (start<=end){
            //Making array half everytime
            mid=(start+end)/2;

            //checking in which part the element is present
            if (matrix[midInd][mid]<k){
                start=mid+1;
            }
            else if (matrix[midInd][mid]>k){
                end=mid-1;
            }
            if (matrix[midInd][mid]==k)
            {
                return true;
            }
        }

        return false;

    }
}
