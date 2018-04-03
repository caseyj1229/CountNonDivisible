public class CountNonDivisible {
    public static int[] solution(int[] A){
        int N = A.length;
        //The largest possible element is 2*N
        int M = N*2+1;
        int[] counter = new int[M];

        //Count Frequency of each element in A
        for(int a: A){
            counter[a]++;
        }

        //Compute Divisors for each element in A
        int[] divisors = new int[M];
        //The largest possible divisor for an element will be if the
        //element is a perfect square, (symetric divisors)
        //i.e: if the number is 36, 6 will be the largest divisor (as 12 is handled by 3)
        for(int i = 1; i*i < M; i++){
            for(int j = i*i; j < M; j+= i){
                divisors[j] += counter[i];
                if(j != i*i){
                    divisors[j] += counter[j/i];
                }
            }
        }

        int[] result = new int[N];
        for(int i = 0; i < N; i++){
            result[i] = N - divisors[A[i]];
        }

        return result;
    }
}
