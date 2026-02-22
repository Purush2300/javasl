public class Ones1 {
    public static void main(String[] args) {
        int []a={1,1,1,0,0,1,1,1,1,0};
        int k=1;
        int count=0;
        int len=0;
        int left=0;
        for (int right = 0; right < a.length; right++) {
            if(a[right]==0){
                count++;
            }
            while (count>k) {
                if(a[left]==0){
                    count--;
                     
                }
                  left++; 
       
                            
            }
                     len=Math.max(len, right-left+1);
        }
        System.out.println(len);
    }
}
