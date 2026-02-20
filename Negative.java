public class Negative {
   public static void main(String[] args) {
    int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        if (k > arr.length) {
            System.out.println("Window size is larger than array length");
            return;
        }

        for (int i = 0; i <= arr.length - k; i++) {

            int max = arr[i];

            for (int j = i; j < i + k; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }

            System.out.print(max + " ");
        }

   } 
}
