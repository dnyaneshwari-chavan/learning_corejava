public class Jagged {
    public static void main(Strings[] args){
// 10 20
// 30 40 50 60
// 70 80 90

        int[][] arr = new int[3][];

        arr[0] = new int[] { 10, 20 };
        arr[1] = new int[] { 30, 40, 50, 60 };
        arr[2] = new int[] { 70, 80, 90 };

        for(int i = 0; i < arr.length; i++;){
            for(int j = 0; j < arr[i].length; j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
