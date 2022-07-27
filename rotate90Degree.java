package matrix;
public class rotate90Degree {
    public static void rotate(int N, int[][] matrix)
    {
        for(int x=0;x<N/2;x++)
        {
            for(int y=x;y<N-x-1;y++)
            {
                int temp=matrix[x][y];

                matrix[x][y]=matrix[y][N-1-x];

                matrix[y][N-1-x]=matrix[N-1-x][N-1-y];

                matrix[N-1-x][N-1-y]=matrix[N-1-y][x];

                matrix[N-1-y][x]=temp;
            }
        }
    }

    public static void display(int N, int mat[][])
    {
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                System.out.print(" "+mat[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static void main(String gg[])
    {
        int N=4;
        int matrix[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        rotate(N, matrix);
        display (N, matrix);
    }
}
