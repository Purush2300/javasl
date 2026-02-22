public class Min {
    public static void main(String[] args) {
        int []a={2,3,1,2,4,3};
        int k=7;
        int j=0;
        int i=0;
       int sum=0;
       
        int len=Integer.MIN_VALUE;
       while(j<a.length){
        sum+=a[j];
        while (sum>=k) {
             
            
             sum-=a[i];
             i++;
        }
        len=Math.max(len,j-i+1);
        j++;
       }
       System.out.println(len);
    }
}
