package ds.arrays2d;

public class Test {


    public static void main(String[] args) {
        int[][] array = new int[2][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = j;
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
