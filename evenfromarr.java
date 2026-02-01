public class evenfromarr {
    public static void main(String[] args) {

        int[] arr = {1, 3, 6, 4, 22, 18, 19};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
