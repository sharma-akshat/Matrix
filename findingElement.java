package matrix;

public class findingElement {
    public static void findElement(int[][] matrix, int n, int x)
    {
        int i=0, j=n-1;
        while(i<n && j>=0)
        {
            if(matrix[i][j]==x)
            {
                System.out.print("Element found at "+i+","+j);
                return;
            }
            if(matrix[i][j]>x)j--;
            else i++;
        }
        System.out.print("Element is not found");
        return;
    }
    public static void main(String gg[])
    {
        int[][] matrix=
        {
            { 10, 20, 30, 40 },
            { 15, 25, 35, 45 },
            { 27, 29, 37, 48 },
            { 32, 33, 39, 50 }
        };
        int k=50;
        findElement(matrix, matrix.length, k);
    }
}
