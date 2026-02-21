//rsb= xorALL & - xorALL
//This only works if two elements are unique and the rest have only 2 duplicates
public class TwoUnique {
    static void find2uni(int[] arr) {
        int res = 0;
        int n1=0,n2=0;
        for (int i = 0; i < arr.length; i++) {
            res = res ^ arr[i];
        }
        int rsb= res & (-res);

        for(int i=0;i<arr.length;i++){
            if((arr[i] & rsb) !=0){
                n1 ^=arr[i];
            }
            else{
                n2^=arr[i];
            }
        }
        System.out.println(n1+","+n2);
    }
       public static void main(String args[]){
        int arr[]={1,2,7,5,1,2};
           find2uni(arr);
        }
    }

