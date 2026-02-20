public class First {
    public static void main(String[] args) {
        
        int []a={2,1,5,1,3,2};
        int size=3;
        int sum=0;
      double avg=size;
       
        for (int i = 0; i <size; i++) {
            sum+=a[i];
         avg=(double)sum/size;
           
        }
          System.out.println(avg);
       double maxsum=avg;
        for (int i = size; i < a.length; i++) {
            sum=sum+a[i]-a[i-size];
           avg=(double)sum/size;
        maxsum=Math.max(maxsum, avg);
        }
       System.out.println(maxsum);
    }
}
