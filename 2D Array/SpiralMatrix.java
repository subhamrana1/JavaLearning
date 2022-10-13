
public class SpiralMatrix {
    public static void spiral(int matrix[][]) {
        int startrow = 0;
        int startcolumn = 0;
        int endrow = matrix.length - 1;
        int endcolumn = matrix[0].length - 1;

        while (startrow <= endrow && startcolumn <= endcolumn) {
            // j = column and i = rows
            for (int j = startcolumn; j <= endcolumn; j++) {
                System.out.print(matrix[startrow][j] + " ");
            }
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(matrix[i][endcolumn] + " ");
            }
            for (int j = endcolumn - 1; j >= startcolumn; j--) {
                if(startrow == endrow){
                    break;
                }
                System.out.print(matrix[endrow][j] + " ");
            }
            for (int i = endrow - 1; i >= startrow +1 ; i--) {
                if(startcolumn == endcolumn){
                    break;
                }
                System.out.print(matrix[i][startcolumn] + " ");

            }
            startcolumn++;
            startrow++;
            endcolumn--;
            endrow--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 3, 3, 5 }, { 4, 8, 6 } };
        spiral(matrix);
        System.out.println("hello");
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[0].length; j++) {
        // System.out.print(matrix[i][j] + " ");

        // }
        // System.out.println();
    }

}
