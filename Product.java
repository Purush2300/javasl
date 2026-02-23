public class Product {
    public static void main(String[] args) {
        int[] nums={10,5,2,6};
        int mul=1;
        int count=0;
        int left=0;
        for (int right  = 0; right < nums.length; right++) {
            mul*=nums[right];
          
           
           
          
            while (mul>=100) {
                mul/=nums[left];
                
                left++;
               
            }
           count+=(right-left+1);
        }
        System.out.println(count);
    }
}
