
import static java.lang.Math.abs;

public class July1 {
    public static void main(String[] args) {
        int[]arr={1,2,3,2,3,1};
        int k=3;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j] &&(abs(i-j)<=k)){
                    System.out.println("true "+arr[i]+" "+arr[j]+" "+i+" "+j);
                    return;
                }
            }
        }
        System.out.println("false");
    }
}
