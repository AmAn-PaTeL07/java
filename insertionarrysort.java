public class insertionarrysort {
    public static void main(String[] args) {
        int[][] array = {
            {3, 5, 2},
            {7, 6, 4},
            {5, 1, 2}
        };

        for (int[] row : array) {
            for (int i = 1; i < row.length; i++) {
                int key = row[i];
                int j = i - 1;

                while (j >= 0 && row[j] > key) {
                    row[j + 1] = row[j];
                    j--;
                }
                row[j + 1] = key;
            }
        }

        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
        
