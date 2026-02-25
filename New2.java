import java.util.HashMap;
public class New2 {
    public static void main(String[] args) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int []a={2,1,1,1,3,4,3,2};
        int k=3;
        int sum=0;
        int l=0;
        int maxsum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
            map.put(a[i], map.getOrDefault(a[i],0)+1);
            if(i-l+1>k){
                sum-=a[l];
              
                map.put(a[l], map.get(a[l])-1) ;
            if(map.get(a[l])==0){
                map.remove(a[l]);
            }
            l++;
            
            }
            if (i - l + 1 == k && map.size() == k) {
                maxsum = Math.max(maxsum, sum);
            }
            
        }
System.out.println(maxsum);


    }
}
