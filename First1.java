public class First1 {
    public static void main(String[] args) {
        int []a={4,3,2,6,1};
        int size=2;
        int sum=5;
        int total=0;
        int count=0;
        for (int i = 0; i < size; i++) {
            total+=a[i];
        }
        if(total>sum){
            count++;
        }
        for (int i = size; i < a.length; i++) {
            total=total+a[i]-a[i-size];
            if(total>=sum){
                count++;
            }
        }
System.out.println(count);
    }
}
