public class Negative {
   public static void main(String[] args) {
    int []a={12, -1, -7, 8, -15, 30, 16, 28};
    int k=3;
    for (int i = 0; i < k; i++) {
        for (int j = i; j < i+k; j++) {
            if(a[j]<0){
            System.out.println(a[j]);
        }
        }
    }

   } 
}
