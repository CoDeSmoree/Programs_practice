public class HeartOwn {
    public static void main(String args[]){
        for(int i=0;i<7;i++){
            if(i%3==0)
                System.out.print("   ");
            else
                System.out.print(" * ");
        }
        System.out.println();
        for(int i=0;i<7;i++){
            if(i%3==0)
                System.out.print(" * ");
            else
                System.out.print("   ");
        }
        System.out.println();
        for(int i=0;i<4;i++){
            for(int j=0;j<7-i;j++){
                if(j==i || j==7-i-1)
                    System.out.print(" * ");
                System.out.print("  ");

            }
            System.out.println();
        }
    }
}
