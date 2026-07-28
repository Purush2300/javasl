
import static java.lang.Math.abs;
import java.util.HashMap;

public class July1 {
    public static void main(String[] args) {
        HashMap <Integer,Integer> map=new HashMap<>();
        int[]arr={1,1,1};
        int k=3;
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int prev=map.get(arr[i]);
                if(abs(i-prev)<=k){
                    found=true;
                    break;
                }
            }
            map.put(arr[i], i);
        }
       System.out.println(found);
    }
}
