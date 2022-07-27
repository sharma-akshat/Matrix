package matrix;


public class max1s {

    static int R=4;
    static int C=4;
    public static int maximum1s(int mat[][])
    {
        int max_row_index=0, max=-1;
        int i, index;
        for(i=0;i<R;i++)
        {
            index=first(mat[i], 0, C-1);
            if(index!=-1 && C-index>max)
            {
                max=C-index;
                max_row_index=i;
            }
        }
        return max_row_index;
    }
    public static int first(int[] array, int low, int high)
    {
        if(low<=high)
        {
            int mid=low+(high-low)/2;

            if((mid==0 || (array[mid-1]==0)) && array[mid]==1)
                return mid;

            else if(array[mid]==0) return first(array, (mid+1), high);

            else return first(array, low, (mid-1));
        }
        return -1;
    }

    public static void main(String gg[])
    {
        int mat[][]=
        {
            {0,0,0,1},
            {0,1,1,1},
            {1,1,1,1},
            {0,0,0,0}
        };
        System.out.println("Index of row with maximum 1s is "+maximum1s(mat));
    }
}
