package hackerrank.src;

public class DivisibleSumPairs {

    // Complete the divisibleSumPairs function below.
    static int divisibleSumPairsBruteForce(int n, int k, int[] ar) {
        int count=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if((ar[i]+ar[j])%k==0)
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args){

        System.out.println("result: " + divisibleSumPairsBruteForce(6, 3, new int[] { 1,3,2,6,1,2 }));
    }
}
