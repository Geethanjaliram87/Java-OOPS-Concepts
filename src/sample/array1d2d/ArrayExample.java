package sample.array1d2d;

public class ArrayExample {
    public static void main(String[] args) {
        // Single-dimensional array
        int[] singleArray = {1, 2, 3, 4, 5};
        System.out.println("Single-dimensional array:");
        for (int i = 0; i < singleArray.length; i++) {
            System.out.println(singleArray[i]);
        }

        // Two-dimensional array
        int[][] twoDimArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Two-dimensional array:");
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
