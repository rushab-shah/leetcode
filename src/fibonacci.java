import java.util.HashMap;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println("Program for calculating fibonacci sequence");
        System.out.println("Fibonacci using topdown dynamic programming approach");
        System.out.println(dynFibo(100,new HashMap<>()));
        System.out.println("Fibonacci using bottoms-up dynamic programming approach");
        System.out.println(dynBFibo(100, new HashMap<>()));
    }

    public static Long dynFibo(int n, HashMap<Integer, Long> memo) {
        if(n==0) {
            memo.put(n, 0L);
        } else if(n == 1 || n == 2) {
            memo.put(n, 1L);
        } else if(memo.get(n)!=null){
            return memo.get(n);
        } else {
            Long val = dynFibo(n-1,memo)+dynFibo(n-2,memo);
            memo.put(n,val);
        }
        return memo.get(n);
    }

    public static Long dynBFibo(int n, HashMap<Integer, Long> memo) {
        memo.put(0,0L);
        memo.put(1,1L);
        memo.put(2,1L);
        for(int i=3;i<=n;i++) {
            memo.put(i,memo.get(i-1) +memo.get(i-2));
        }
        return memo.get(n);
    }
}
