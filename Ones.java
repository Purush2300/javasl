public class Ones {
    public static void main(String[] args) {
        int []nums={1,1,0,1,1,1};
        int left=0;
     
int cursum = 0;
int maxsum=0;

for (int right = 0; right < nums.length; right++) {
   
   
  if(nums[right]!=0){
cursum++;
maxsum=Math.max(cursum,maxsum);
  }
  else{
    cursum=0;
  }
    

    
}

System.out.println(maxsum);
    }
}
