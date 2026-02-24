public class New {
    public static void main(String[] args) {
        int[]a={1,1,1};
        int left=0;
        int len=0;
        int count=0;
        
        for (int right = 0; right < a.length; right++) {
            if(a[right]==0){
                count++;
            }
            while (count>1) {
                
                 if(a[left]==0){
                    count--;
                 }
                 left++;
            }
            
              len=Math.max(len, right-left);
        }
        System.out.println(len-1);
    }
}
