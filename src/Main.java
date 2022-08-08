public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4},{4,5},{6,7}};
        System.out.println(findMaxArr(arr));
    }
    public static int findMaxArr(int [][] arr) {
        int max;
        max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    };
}
