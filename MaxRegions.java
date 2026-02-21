public class MaxRegions {
    static int maxReg(int lines){
        return ((lines*(lines+1))/2)+1;
    }
    static int maxCut(int cut){
        return ((cut*(cut+1))/2)+1;
    }

    public static void main(String[] args) {
        System.out.println(maxReg(5));
        System.out.println(maxCut(7));
    }
}
