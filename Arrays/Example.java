
public class Example {
    public static void main(String[] args) {

        int[][] arr = new int[3][];

        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];

        arr[0][0] = 10;

        arr[1][0] = 20;
        arr[1][1] = 30;

        arr[2][0] = 40;
        arr[2][1] = 50;
        arr[2][2] = 60;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}