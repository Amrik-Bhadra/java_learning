package basics.arrays;

public class Array_2D {
    public static void main(String[] args) {
        int[][] mat = new int[3][3];  // [rows][columns]
        int[][] mat2 = { {1, 2, 3},
                         {4, 5, 6}};

        // access elements
        System.out.println(mat2[1][1]);

        for(int i=0; i<mat2.length; i++){
            for(int j=0; j<mat2[i].length; j++){
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }
    }
}


/*

    Jagged array: array of arrays of different length

    a b c
    d e f g
    h i j
    k l

 */
