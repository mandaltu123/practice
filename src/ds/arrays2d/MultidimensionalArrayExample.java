package ds.arrays2d;

public class MultidimensionalArrayExample {

    public static void main(String[] args) {
        // creating and initializing a two dimensional array
        int[][] arrayInt = {{1,2}, {4, 5, 5}};
        // Iterate over this two dimensional array and print the data in it
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                System.out.print(arrayInt[i][j] + " ");
            }
            System.out.println(" ");
        }


        // showing multidimensional array initialization here
        int[][] arrayMulti = new int[3][4];
        // Row 1
        arrayMulti[0][0] = 1;
        arrayMulti[0][1] = 2;
        arrayMulti[0][2] = 3;
        arrayMulti[0][3] = 4;
        // Row 2
        arrayMulti[1][0] = 5;
        arrayMulti[1][1] = 6;
        arrayMulti[1][2] = 7;
        arrayMulti[1][3] = 8;
        // Row 3
        arrayMulti[2][0] = 9;
        arrayMulti[2][1] = 10;
        arrayMulti[2][2] = 11;
        arrayMulti[2][3] = 12;
        // Now go ahead and print the array data
        System.out.println("Printing multi dimensional array.....");
        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j =0; j < arrayMulti[i].length; j++) {
                System.out.print(arrayMulti[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
