public class SwapUsingArray {
    static void swap(int[] ar){
        int temp=ar[0];
        ar[0]=ar[1];
        ar[1]=temp;
    }

    public static void main(String[] args) {
        int x=10,y=20;
        System.out.println(x+" ,"+y);
        int[] arr={x,y};
        swap(arr);
        x=arr[0];
        y=arr[1];
        System.out.println(x+" ,"+y);
    }
}
