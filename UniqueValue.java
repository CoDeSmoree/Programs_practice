//uses xor as same values cancel out in xor
//only works if duplicate values are repeated in the multiples of two
public class UniqueValue {
    public static void main(String[] args) {
        int [] arr={4,5,3,4,3,2,1,2,1};
        int res=0;
        for(int i=0;i<arr.length;i++){
            res=res^arr[i];
        }
        System.out.println(res);
    }
}
