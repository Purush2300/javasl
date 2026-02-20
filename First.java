public class First {
    public static void main(String[] args) {
        
        int []a={2,1,5,1,3,2};
        int size=3;
        int sum=0;
        int maxsum=0;
        for (int i = 0; i <size; i++) {
            sum+=a[i];
        }
        maxsum=sum;
        for (int i = size; i < a.length; i++) {
            sum=sum+a[i]-a[i-size];
            maxsum=Math.max(maxsum, sum);
        }
        System.out.println(maxsum);
    }
}
