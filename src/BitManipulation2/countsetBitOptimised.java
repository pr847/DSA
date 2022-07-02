package BitManipulation2;

public class countsetBitOptimised {

    static int countSetBitOptimised(int n){

        int count=0;
        while (n>0)
        {
            count++;
            n=(n&(n-1));
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(countSetBitOptimised(8));
    }
}
