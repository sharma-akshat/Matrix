package matrix;

public class findMedian {

    public static int findSmallerThanMid(int[] a, int mid, int n)
    {
        int min=0, max=n-1;
        while(min<=max)
        {
            int md=(min+max)>>1;
            if(a[md]<=mid)min=md+1;
            else max=md-1;
        }
        return min;
    }
    public static int findMed(int[][] matrix, int n, int m)
    {
        int min=findMinimum(matrix, n, m);
        int max=findMaximum(matrix, n, m);
        
        while(min<=max){
            int mid=(min+max)>>1;
            int count=0;
            for(int i=0;i<n;i++){
                count+=findSmallerThanMid(matrix[i], mid, m);
            }
            if(count<=(n*m)/2)min=mid+1;
            else max=mid-1;
        }
        return min;
    }
    public static int findMinimum(int array[][], int row, int col)
    {
        int min=array[0][0];
        for(int i=0;i<row;i++)
        {
            for(int j=1;j<col;j++)
            {
                if(array[i][j]<min) min=array[i][j];
            }
        }
        return min;
    }
    public static int findMaximum(int array[][], int row, int col)
    {
        int max=array[0][0];
        for(int i=0;i<row;i++)
        {
            for(int j=1;j<col;j++)
            {
                if(array[i][j]>max) max=array[i][j];
            }
        }
        return max;
    }
    public static void main(String gg[])
    {
        int row=3, col=3;
        int array[][]={{2,3,5},{2,3,4},{1,7,9}};
        System.out.print("Median of the given matrix is "+findMed(array, row, col));
    }

}
