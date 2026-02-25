import java.util.HashMap;
public class New3 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[]a={1,2,1,1,2,3};
        int k=2;
        int count=0;
        int l=0;
        for (int r = 0; r < a.length; r++) {
            map.put(a[r], map.getOrDefault(a[r], 0)+1);
            
            if(map.size()>2){
                
            map.put(a[l], map.get(a[l])-1) ;
            if(map.get(a[l])==0){
                map.remove(a[l]);
            }
            l++;
            }
         count+=(r-l+1);
            
        }
        System.out.println(count);
    }
}
